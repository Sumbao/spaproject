// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.main.myprojectspa.domain.projectspa;

import com.main.myprojectspa.domain.projectspa.Holiday;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

privileged aspect Holiday_Roo_Jpa_ActiveRecord {
    
    public static final List<String> Holiday.fieldNames4OrderClauseFilter = java.util.Arrays.asList("holidayDate", "holidayDetail", "employeeHoliday");
    
    public static long Holiday.countHolidays() {
        return entityManager().createQuery("SELECT COUNT(o) FROM Holiday o", Long.class).getSingleResult();
    }
    
    public static List<Holiday> Holiday.findAllHolidays() {
        return entityManager().createQuery("SELECT o FROM Holiday o", Holiday.class).getResultList();
    }
    
    public static List<Holiday> Holiday.findAllHolidays(String sortFieldName, String sortOrder) {
        String jpaQuery = "SELECT o FROM Holiday o";
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            jpaQuery = jpaQuery + " ORDER BY " + sortFieldName;
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                jpaQuery = jpaQuery + " " + sortOrder;
            }
        }
        return entityManager().createQuery(jpaQuery, Holiday.class).getResultList();
    }
    
    public static Holiday Holiday.findHoliday(Long id) {
        if (id == null) return null;
        return entityManager().find(Holiday.class, id);
    }
    
    public static List<Holiday> Holiday.findHolidayEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM Holiday o", Holiday.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    public static List<Holiday> Holiday.findHolidayEntries(int firstResult, int maxResults, String sortFieldName, String sortOrder) {
        String jpaQuery = "SELECT o FROM Holiday o";
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            jpaQuery = jpaQuery + " ORDER BY " + sortFieldName;
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                jpaQuery = jpaQuery + " " + sortOrder;
            }
        }
        return entityManager().createQuery(jpaQuery, Holiday.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public Holiday Holiday.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        Holiday merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}