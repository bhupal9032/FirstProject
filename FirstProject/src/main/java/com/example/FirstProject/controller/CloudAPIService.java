package com.example.FirstProject.controller;

import com.example.FirstProject.model.cloudVendor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cloudvendor")
public class CloudAPIService {

    //this is the getmethiod wehere we get  cloudvendor details by using id
    @GetMapping("{vendorid}")
    public cloudVendor getCloudvendordetails(String vendorid){
        return new cloudVendor("c1","bhupal","kothakota",
                "9r603793318");
    }

}
