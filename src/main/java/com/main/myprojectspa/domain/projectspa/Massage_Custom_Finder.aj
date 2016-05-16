package com.main.myprojectspa.domain.projectspa;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

privileged aspect Massage_Custom_Finder {
    public static List<Massage> Massage.findmassagebytype(long typeId){
        Criteria criteria =((Session) Product.entityManager().getDelegate()).createCriteria(Massage.class,"Massage");
        criteria.add(Restrictions.eq("Massage.massageTypes.id",typeId));
        return criteria.list();
    }
}