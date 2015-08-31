package com.huyvn.happytostudy.controllers;

import org.apache.commons.io.IOUtils;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletResponse;
import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by Huy Nghi on 8/28/2015.
 */
@Controller
@RequestMapping(value = "/demo/getAudio")
public class _DemoController {

    // --> /demo/getAudio/getImage
    @RequestMapping(value = "/getImage", method = RequestMethod.GET)
    @ResponseBody
    public void getImage( ServletResponse response ) throws IOException{
        File imageFile = new File( "E:\\Hinh Anh\\WP_000337.png" );
        byte[] byteArray = IOUtils.toByteArray(new FileInputStream(imageFile));
        response.setContentType( "image/png" );
        response.getOutputStream().write( byteArray );
    }

    // --> /demo/getAudio/getAudio
    @RequestMapping(value = "/getAudio", method = RequestMethod.GET)
    @ResponseBody
    public void getAudio( ServletResponse response ) throws IOException{
        File imageFile = new File( "E:\\My Music\\Nhac Chuong\\Sinbad.mp3" );
        byte[] byteArray = IOUtils.toByteArray(new FileInputStream(imageFile));
        response.setContentType( "audio/mpeg" );
        response.getOutputStream().write( byteArray );
    }

    // --> /demo/getAudio/getPhoto
    @ResponseBody
    @RequestMapping(value = "/getPhoto", method = RequestMethod.GET, produces = MediaType.IMAGE_JPEG_VALUE)
    public byte[] getPhoto() throws IOException {
        File imageFile = new File( "E:\\Hinh Anh\\WP_000337.png" );
        byte[] byteArray = IOUtils.toByteArray( new FileInputStream( imageFile ) );
        return byteArray;
    }
}
