package com.main.myprojectspa.web.myprojectspa;

import com.main.myprojectspa.domain.projectspa.CustomerType;
import com.main.myprojectspa.web.myprojectspa.CustomerTypeController;
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

privileged aspect CustomerTypeController_Custom_Controller_Json {

    @RequestMapping(value = "/getcustomertype/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
    @ResponseBody
    public ResponseEntity<String> CustomerTypeController.getcustomertype(@PathVariable("id") Long id) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json; charset=utf-8");
        try {
            CustomerType customerType = CustomerType.findCustomerType(id);
            if (customerType == null) {
                return new ResponseEntity<String>(headers, HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity<String>((new JSONSerializer().exclude("*.class")
                    .include("id")
                    .include("version")
                    .include("customerTypeName")
                    .exclude("*")
                    .deepSerialize(customerType)), headers, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<String>("{\"ERROR\":" + e.getMessage() + "\"}", headers, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}