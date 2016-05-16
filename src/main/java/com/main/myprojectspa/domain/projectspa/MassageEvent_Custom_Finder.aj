package com.main.myprojectspa.domain.projectspa;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

privileged aspect MassageEvent_Custom_Finder {
    public static List<MassageEvent> MassageEvent.findeventbyEmpId(long empId){
        Criteria criteria =((Session) Product.entityManager().getDelegate()).createCriteria(MassageEvent.class,"MassageEvent");
        criteria.add(Restrictions.eq("MassageEvent.employee.id",empId));
        return criteria.list();
    }
}