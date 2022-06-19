package mao.docker_compose_boot.service.impl;

import mao.docker_compose_boot.entity.Student;
import mao.docker_compose_boot.mapper.StudentMapper;
import mao.docker_compose_boot.service.IStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import mao.docker_compose_boot.utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author mao
 * @since 2022-06-19
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService
{

    @Autowired
    private RedisUtils redisUtils;

    @Override
    public Student getStudent(Long id)
    {
        return redisUtils.query("docker_compose_boot:student:", "docker_compose_boot:lock:",
                id, Student.class, this::getById,
                300L, TimeUnit.SECONDS, 50);
    }
}
