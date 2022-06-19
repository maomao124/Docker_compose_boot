package mao.docker_compose_boot.controller;


import mao.docker_compose_boot.entity.Student;
import mao.docker_compose_boot.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author mao
 * @since 2022-06-19
 */

@RequestMapping("/student")
@RestController()
public class StudentController
{

    @Autowired
    private IStudentService studentService;

    @GetMapping("")
    public List<Student> getAll()
    {
        return studentService.list();
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable Long id)
    {
        return studentService.getStudent(id);
    }

}

