package mao.docker_compose_boot.service;

import mao.docker_compose_boot.entity.Student;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author mao
 * @since 2022-06-19
 */
public interface IStudentService extends IService<Student>
{

    /**
     * 获得学生信息
     *
     * @param id 学生的学号，（no）
     * @return Student
     */
    Student getStudent(Long id);
}
