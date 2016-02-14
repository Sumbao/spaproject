// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.main.myprojectspa.domain.projectspa;

import com.main.myprojectspa.domain.projectspa.ShoppingEvent;
import flexjson.JSONDeserializer;
import flexjson.JSONSerializer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

privileged aspect ShoppingEvent_Roo_Json {
    
    public String ShoppingEvent.toJson() {
        return new JSONSerializer()
        .exclude("*.class").deepSerialize(this);
    }
    
    public String ShoppingEvent.toJson(String[] fields) {
        return new JSONSerializer()
        .include(fields).exclude("*.class").deepSerialize(this);
    }
    
    public static ShoppingEvent ShoppingEvent.fromJsonToShoppingEvent(String json) {
        return new JSONDeserializer<ShoppingEvent>()
        .use(null, ShoppingEvent.class).deserialize(json);
    }
    
    public static String ShoppingEvent.toJsonArray(Collection<ShoppingEvent> collection) {
        return new JSONSerializer()
        .exclude("*.class").deepSerialize(collection);
    }
    
    public static String ShoppingEvent.toJsonArray(Collection<ShoppingEvent> collection, String[] fields) {
        return new JSONSerializer()
        .include(fields).exclude("*.class").deepSerialize(collection);
    }
    
    public static Collection<ShoppingEvent> ShoppingEvent.fromJsonArrayToShoppingEvents(String json) {
        return new JSONDeserializer<List<ShoppingEvent>>()
        .use("values", ShoppingEvent.class).deserialize(json);
    }
    
}
