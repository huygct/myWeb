package com.huyvn.happytostudy.repository;

import com.huyvn.happytostudy.model.Subjects;

import java.util.List;

/**
 * Created by Huy Nghi on 8/5/2015.
 */
public interface SubjectsRepository extends MyBaseRepository<Subjects, Integer>{
    List<Subjects> findAll();
    List<Subjects> findByMenuId(int menuId);
}
