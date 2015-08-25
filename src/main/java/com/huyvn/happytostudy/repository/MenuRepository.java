package com.huyvn.happytostudy.repository;

import com.huyvn.happytostudy.model.Menu;

import java.util.List;

/**
 * Created by Huy Nghi on 7/29/2015.
 */
public interface MenuRepository extends MyBaseRepository<Menu, Integer> {
    List<Menu> findAll();
    List<Menu> findById(int id);
    List<Menu> findByParent(int idParent);
}
