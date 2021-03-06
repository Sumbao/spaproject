// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.main.myprojectspa.domain.projectspa;

import com.main.myprojectspa.domain.projectspa.MassageTypes;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

privileged aspect MassageTypes_Roo_Jpa_ActiveRecord {
    
    public static final List<String> MassageTypes.fieldNames4OrderClauseFilter = java.util.Arrays.asList("massageTypeCode", "massageTypeName", "massage");
    
    public static long MassageTypes.countMassageTypeses() {
        return entityManager().createQuery("SELECT COUNT(o) FROM MassageTypes o", Long.class).getSingleResult();
    }
    
    public static List<MassageTypes> MassageTypes.findAllMassageTypeses() {
        return entityManager().createQuery("SELECT o FROM MassageTypes o", MassageTypes.class).getResultList();
    }
    
    public static List<MassageTypes> MassageTypes.findAllMassageTypeses(String sortFieldName, String sortOrder) {
        String jpaQuery = "SELECT o FROM MassageTypes o";
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            jpaQuery = jpaQuery + " ORDER BY " + sortFieldName;
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                jpaQuery = jpaQuery + " " + sortOrder;
            }
        }
        return entityManager().createQuery(jpaQuery, MassageTypes.class).getResultList();
    }
    
    public static MassageTypes MassageTypes.findMassageTypes(Long id) {
        if (id == null) return null;
        return entityManager().find(MassageTypes.class, id);
    }
    
    public static List<MassageTypes> MassageTypes.findMassageTypesEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM MassageTypes o", MassageTypes.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    public static List<MassageTypes> MassageTypes.findMassageTypesEntries(int firstResult, int maxResults, String sortFieldName, String sortOrder) {
        String jpaQuery = "SELECT o FROM MassageTypes o";
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            jpaQuery = jpaQuery + " ORDER BY " + sortFieldName;
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                jpaQuery = jpaQuery + " " + sortOrder;
            }
        }
        return entityManager().createQuery(jpaQuery, MassageTypes.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public MassageTypes MassageTypes.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        MassageTypes merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}
