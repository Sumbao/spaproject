// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.main.myprojectspa.domain.projectspa;

import com.main.myprojectspa.domain.projectspa.CustomerType;
import flexjson.JSONDeserializer;
import flexjson.JSONSerializer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

privileged aspect CustomerType_Roo_Json {
    
    public String CustomerType.toJson() {
        return new JSONSerializer()
        .exclude("*.class").deepSerialize(this);
    }
    
    public String CustomerType.toJson(String[] fields) {
        return new JSONSerializer()
        .include(fields).exclude("*.class").deepSerialize(this);
    }
    
    public static CustomerType CustomerType.fromJsonToCustomerType(String json) {
        return new JSONDeserializer<CustomerType>()
        .use(null, CustomerType.class).deserialize(json);
    }
    
    public static String CustomerType.toJsonArray(Collection<CustomerType> collection) {
        return new JSONSerializer()
        .exclude("*.class").deepSerialize(collection);
    }
    
    public static String CustomerType.toJsonArray(Collection<CustomerType> collection, String[] fields) {
        return new JSONSerializer()
        .include(fields).exclude("*.class").deepSerialize(collection);
    }
    
    public static Collection<CustomerType> CustomerType.fromJsonArrayToCustomerTypes(String json) {
        return new JSONDeserializer<List<CustomerType>>()
        .use("values", CustomerType.class).deserialize(json);
    }
    
}