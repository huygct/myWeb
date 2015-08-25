package com.huyvn.happytostudy.services.impl;

import com.huyvn.happytostudy.model.Menu;
import com.huyvn.happytostudy.repository.MenuRepository;
import com.huyvn.happytostudy.services.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* Created by Huy Nghi on 7/29/2015.
*/
@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    private MenuRepository menuRepository;

    @Override
    public List<Menu> findAll() {
        return menuRepository.findAll();
    }

    @Override
    public List<Menu> findById(int id) {
        return menuRepository.findById(id);
    }

    @Override
    public List<Menu> findByParent(int idParent) {
        return menuRepository.findByParent(idParent);
    }
}
