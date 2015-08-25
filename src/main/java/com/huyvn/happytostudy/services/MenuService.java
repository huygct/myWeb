package com.huyvn.happytostudy.services;

import com.huyvn.happytostudy.model.Menu;

import java.util.List;

/**
 * Created by Huy Nghi on 7/29/2015.
 */
public interface MenuService {
    List<Menu> findAll();
    List<Menu> findById(int id);
    List<Menu> findByParent(int idParent);
}
