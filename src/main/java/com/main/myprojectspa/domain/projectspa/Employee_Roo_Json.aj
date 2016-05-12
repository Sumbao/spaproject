// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.main.myprojectspa.domain.projectspa;

import flexjson.JSONDeserializer;
import flexjson.JSONSerializer;

import java.util.Collection;
import java.util.List;

privileged aspect Employee_Roo_Json {
    
    public String Employee.toJson() {
        return new JSONSerializer()
        .exclude("*.class").deepSerialize(this);
    }
    
    public String Employee.toJson(String[] fields) {
        return new JSONSerializer()
        .include(fields).exclude("*.class").deepSerialize(this);
    }
    
    public static Employee Employee.fromJsonToEmployee(String json) {
        return new JSONDeserializer<Employee>()
        .use(null, Employee.class).deserialize(json);
    }
    
    public static String Employee.toJsonArray(Collection<Employee> collection) {
        return new JSONSerializer()
        .exclude("*.class").deepSerialize(collection);
    }
    
    public static String Employee.toJsonArray(Collection<Employee> collection, String[] fields) {
        return new JSONSerializer()
        .include(fields).exclude("*.class").deepSerialize(collection);
    }
    
    public static Collection<Employee> Employee.fromJsonArrayToEmployees(String json) {
        return new JSONDeserializer<List<Employee>>()
        .use("values", Employee.class).deserialize(json);
    }
    
}
