package com.huyvn.happytostudy.repository;

import com.huyvn.happytostudy.model.Subjects;
import com.huyvn.happytostudy.model.english.Lessons;

import java.util.List;

/**
 * Created by Huy Nghi on 8/11/2015.
 */
public interface LessonsRepository extends MyBaseRepository<Lessons, Integer> {
    List<Lessons> findAll();
    List<Lessons> findBySubjects(Subjects subjects);
}
