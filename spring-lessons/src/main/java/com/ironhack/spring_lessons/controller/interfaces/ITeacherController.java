package com.ironhack.spring_lessons.controller.interfaces;

import java.util.List;

import com.ironhack.spring_lessons.model.Teacher;

public interface ITeacherController {
    List<Teacher> getAllTeachers();

    Teacher getTeacherById(Integer id);
}