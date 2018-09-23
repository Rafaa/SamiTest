package com.sami.controller;

import com.sami.models.Dhba3;
import com.sami.service.Dhba3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/api")
public class Dhba3Controller {

    @Autowired
    Dhba3Service dhba3Service;

    @RequestMapping(value = "/dhba3", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Dhba3> getDhba3Name(){


        return dhba3Service.getDhba3();


    }

    @RequestMapping(value = "/dhba3", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Dhba3 saveDhba3(@RequestBody Dhba3 dhba3){

        dhba3Service.createDhba3(dhba3);

        return dhba3;


    }
}
