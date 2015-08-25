package com.huyvn.happytostudy.services.impl;

import com.huyvn.happytostudy.model.Subjects;
import com.huyvn.happytostudy.model.english.Lessons;
import com.huyvn.happytostudy.repository.LessonsRepository;
import com.huyvn.happytostudy.repository.SubjectsRepository;
import com.huyvn.happytostudy.services.LessonsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* Created by Huy Nghi on 8/11/2015.
*/
@Service
public class LessonsServiceImpl implements LessonsService {

    @Autowired
    private LessonsRepository lessonsRepository;

    @Override
    public List<Lessons> findAll() {
        return lessonsRepository.findAll();
    }

    @Override
    public List<Lessons> findBySubjects(Subjects subjects) {
        return lessonsRepository.findBySubjects(subjects);
    }
}
