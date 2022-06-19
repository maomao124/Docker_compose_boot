package mao.docker_compose_boot.mapper;

import mao.docker_compose_boot.entity.Student;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author mao
 * @since 2022-06-19
 */

@Mapper
public interface StudentMapper extends BaseMapper<Student>
{

}
