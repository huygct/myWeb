package com.huyvn.happytostudy.controllers;

import com.huyvn.happytostudy.model.Subjects;
import com.huyvn.happytostudy.services.SubjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.Method;
import java.util.List;

/**
 * Created by Huy Nghi on 8/5/2015.
 */
@Controller
@RequestMapping(value = "/main/subjects")
public class SubjectsController {

    @Autowired
    private SubjectsService subjectsService;

    // --> /main/subjects/getSubjectsByMenuId
    @RequestMapping(value = "/getSubjectsByMenuId", method = RequestMethod.GET)
    public @ResponseBody
    List<Subjects> getSubjectsByMenuId (int menuId) {
        return subjectsService.findByMenuId(menuId);
    }
}
