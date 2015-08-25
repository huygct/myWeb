package com.huyvn.happytostudy.services.impl;

import com.huyvn.happytostudy.model.Subjects;
import com.huyvn.happytostudy.repository.SubjectsRepository;
import com.huyvn.happytostudy.services.SubjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* Created by Huy Nghi on 8/5/2015.
*/
@Service
public class SubjectsServiceImpl implements SubjectsService{

    @Autowired
    private SubjectsRepository subjectsRepository;

    @Override
    public List<Subjects> findAll() {
        return subjectsRepository.findAll();
    }

    @Override
    public List<Subjects> findByMenuId(int menuId) {
        return subjectsRepository.findByMenuId(menuId);
    }
}
