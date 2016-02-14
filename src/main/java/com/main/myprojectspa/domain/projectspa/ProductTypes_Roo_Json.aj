// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.main.myprojectspa.domain.projectspa;

import com.main.myprojectspa.domain.projectspa.ProductTypes;
import flexjson.JSONDeserializer;
import flexjson.JSONSerializer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

privileged aspect ProductTypes_Roo_Json {
    
    public String ProductTypes.toJson() {
        return new JSONSerializer()
        .exclude("*.class").deepSerialize(this);
    }
    
    public String ProductTypes.toJson(String[] fields) {
        return new JSONSerializer()
        .include(fields).exclude("*.class").deepSerialize(this);
    }
    
    public static ProductTypes ProductTypes.fromJsonToProductTypes(String json) {
        return new JSONDeserializer<ProductTypes>()
        .use(null, ProductTypes.class).deserialize(json);
    }
    
    public static String ProductTypes.toJsonArray(Collection<ProductTypes> collection) {
        return new JSONSerializer()
        .exclude("*.class").deepSerialize(collection);
    }
    
    public static String ProductTypes.toJsonArray(Collection<ProductTypes> collection, String[] fields) {
        return new JSONSerializer()
        .include(fields).exclude("*.class").deepSerialize(collection);
    }
    
    public static Collection<ProductTypes> ProductTypes.fromJsonArrayToProductTypeses(String json) {
        return new JSONDeserializer<List<ProductTypes>>()
        .use("values", ProductTypes.class).deserialize(json);
    }
    
}
