package com.huyvn.happytostudy.services;

import com.huyvn.happytostudy.model.Subjects;
import com.huyvn.happytostudy.model.english.Lessons;

import java.util.List;

public interface LessonsService {
    List<Lessons> findAll();
    List<Lessons> findBySubjects(Subjects subjects);
}
