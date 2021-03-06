// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.main.myprojectspa.web.myprojectspa;

import com.main.myprojectspa.domain.projectspa.MassageTypes;
import com.main.myprojectspa.web.myprojectspa.MassageTypesController;
import java.util.List;

import flexjson.JSONSerializer;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.UriComponentsBuilder;

privileged aspect MassageTypesController_Custom_Controller_Json {

    @RequestMapping(value="/findmassagetype",method = RequestMethod.GET,headers = "Accept=application/json")
    @ResponseBody
    public ResponseEntity<String> MassageTypesController.findmassagetype(){
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json; charset=utf-8");
        try {
            List<MassageTypes> result = MassageTypes.findAllMassageTypeses();
            return new ResponseEntity<String>((new JSONSerializer().exclude("*.class")
                    .include("id")
                    .include("version")
                    .include("massageTypeCode")
                    .include("massageTypeName")
                    .exclude("*")
                    .deepSerialize(result)),headers, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<String>("{\"ERROR\":"+e.getMessage()+"\"}", headers, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
