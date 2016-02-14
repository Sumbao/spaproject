// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.main.myprojectspa.domain.projectspa;

import com.main.myprojectspa.domain.projectspa.MassageEvent;
import flexjson.JSONDeserializer;
import flexjson.JSONSerializer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

privileged aspect MassageEvent_Roo_Json {
    
    public String MassageEvent.toJson() {
        return new JSONSerializer()
        .exclude("*.class").deepSerialize(this);
    }
    
    public String MassageEvent.toJson(String[] fields) {
        return new JSONSerializer()
        .include(fields).exclude("*.class").deepSerialize(this);
    }
    
    public static MassageEvent MassageEvent.fromJsonToMassageEvent(String json) {
        return new JSONDeserializer<MassageEvent>()
        .use(null, MassageEvent.class).deserialize(json);
    }
    
    public static String MassageEvent.toJsonArray(Collection<MassageEvent> collection) {
        return new JSONSerializer()
        .exclude("*.class").deepSerialize(collection);
    }
    
    public static String MassageEvent.toJsonArray(Collection<MassageEvent> collection, String[] fields) {
        return new JSONSerializer()
        .include(fields).exclude("*.class").deepSerialize(collection);
    }
    
    public static Collection<MassageEvent> MassageEvent.fromJsonArrayToMassageEvents(String json) {
        return new JSONDeserializer<List<MassageEvent>>()
        .use("values", MassageEvent.class).deserialize(json);
    }
    
}