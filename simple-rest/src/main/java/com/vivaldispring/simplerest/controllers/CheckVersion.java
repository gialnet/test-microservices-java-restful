package com.vivaldispring.simplerest.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
public class CheckVersion {
    Map<String, Object> response = new HashMap<String, Object>();

    @RequestMapping(value = "/serviceA", method = RequestMethod.GET, produces = {"application/JSON"} )
    public ResponseEntity<?> checkVersion(){

        response.clear();
        response.put("version", "1.0");
        response.put("status", "ok");
        response.put("data",  "ServiceA Version 2.0 Release August 2018" );
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
