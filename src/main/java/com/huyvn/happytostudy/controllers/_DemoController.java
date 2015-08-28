package com.huyvn.happytostudy.controllers;

import com.huyvn.happytostudy.model.Subjects;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by Huy Nghi on 8/28/2015.
 */
@Controller
@RequestMapping(value = "/demo/getAudio")
public class _DemoController {

    // --> /demo/getAudio/photo
//    @RequestMapping("/photo")
//    public ResponseEntity<byte[]> testphoto() throws IOException {
//        InputStream in = servletContext.getResourceAsStream("/images/no_image.jpg");
//
//        final HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(PageAttributes.MediaType.IMAGE_PNG);
//
//        return new ResponseEntity<byte[]>(IOUtils.toByteArray(in), headers, HttpStatus.CREATED);
//    }
}
