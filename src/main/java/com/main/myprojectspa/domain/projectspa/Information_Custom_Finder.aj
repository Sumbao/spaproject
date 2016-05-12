package com.main.myprojectspa.domain.projectspa;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

privileged aspect Information_Custom_Finder {
    public static List<Information> Information.createInformation(String inforName){
        Criteria criteria =((Session) Customer.entityManager().getDelegate()).createCriteria(Information.class,"Information");
        criteria.add(Restrictions.eq("informationName",inforName));
        List<Information> list = criteria.list();
        return list;
    }

    public static List<Information> Information.findbyinforId(Long inforId){
        Criteria criteria = ((Session) Product.entityManager().getDelegate()).createCriteria(Information.class,"Information");
        criteria.add(Restrictions.eq("id",inforId));
        List<Information> list = criteria.list();
        return list;
    }
}