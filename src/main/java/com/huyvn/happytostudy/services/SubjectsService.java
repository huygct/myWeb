package com.huyvn.happytostudy.services;

import com.huyvn.happytostudy.model.Subjects;

import java.util.List;

/**
 * Created by Huy Nghi on 8/5/2015.
 */
public interface SubjectsService {
    List<Subjects> findAll();
    List<Subjects> findByMenuId(int menuId);
}
