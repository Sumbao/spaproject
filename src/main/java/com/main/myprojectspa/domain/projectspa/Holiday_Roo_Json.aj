// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.main.myprojectspa.domain.projectspa;

import flexjson.JSONDeserializer;
import flexjson.JSONSerializer;

import java.util.Collection;
import java.util.List;

privileged aspect Holiday_Roo_Json {
    
    public String Holiday.toJson() {
        return new JSONSerializer()
        .exclude("*.class").deepSerialize(this);
    }
    
    public String Holiday.toJson(String[] fields) {
        return new JSONSerializer()
        .include(fields).exclude("*.class").deepSerialize(this);
    }
    
    public static Holiday Holiday.fromJsonToHoliday(String json) {
        return new JSONDeserializer<Holiday>()
        .use(null, Holiday.class).deserialize(json);
    }
    
    public static String Holiday.toJsonArray(Collection<Holiday> collection) {
        return new JSONSerializer()
        .exclude("*.class").deepSerialize(collection);
    }
    
    public static String Holiday.toJsonArray(Collection<Holiday> collection, String[] fields) {
        return new JSONSerializer()
        .include(fields).exclude("*.class").deepSerialize(collection);
    }
    
    public static Collection<Holiday> Holiday.fromJsonArrayToHolidays(String json) {
        return new JSONDeserializer<List<Holiday>>()
        .use("values", Holiday.class).deserialize(json);
    }
    
}
