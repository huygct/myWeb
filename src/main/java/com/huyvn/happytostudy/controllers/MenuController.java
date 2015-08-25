package com.huyvn.happytostudy.controllers;

import com.huyvn.happytostudy.model.Menu;
import com.huyvn.happytostudy.services.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Huy Nghi on 7/29/2015.
 */
@Controller
@RequestMapping(value = "/main/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @RequestMapping(value = "/allMenuList", method = RequestMethod.GET)
    public @ResponseBody
    List<Menu> menuList() {
        return  menuService.findAll();
    }

    @RequestMapping(value = "/menuListById", method = RequestMethod.GET)
    public @ResponseBody
    List<Menu> menuListByID (int id) {
        return menuService.findById(id);
    }

    @RequestMapping(value = "/menuListByParent", method = RequestMethod.GET)
    public @ResponseBody
    List<Menu> menuListByParent (int idParent) {
        return menuService.findByParent(idParent);
    }
}
