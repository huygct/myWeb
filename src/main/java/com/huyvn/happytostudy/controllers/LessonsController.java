package com.huyvn.happytostudy.controllers;

import com.huyvn.happytostudy.model.Subjects;
import com.huyvn.happytostudy.model.english.Lessons;
import com.huyvn.happytostudy.model.english.LessonsDetail;
import com.huyvn.happytostudy.repository.SubjectsRepository;
import com.huyvn.happytostudy.services.LessonsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Huy Nghi on 8/10/2015.
 */
@Controller
@RequestMapping(value = "/main/lessons")
public class LessonsController {

    @Autowired
    private LessonsService lessonsService;
    @Autowired
    private SubjectsRepository subjectsRepository;

    @RequestMapping(value = "/getAllLessons", method = RequestMethod.GET)
    public @ResponseBody
    List<Lessons> getAllLessons() {
        return lessonsService.findAll();
    }

    @RequestMapping(value = "/getLessonsBySubject", method = RequestMethod.GET)
    public @ResponseBody
    List<Lessons> getLessonsBySubjectFromMenuId(int menuId) {
        List<Subjects> listSubject = subjectsRepository.findByMenuId(menuId);
        return lessonsService.findBySubjects(listSubject.get(0));
    }
}
