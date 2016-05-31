package com.main.myprojectspa.domain.projectspa;

import com.sun.org.apache.xpath.internal.operations.String;
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

//    public static List<Massage> Massage.createmassage(String massageCode, String massageName){
//        Criteria criteria =((Session) Product.entityManager().getDelegate()).createCriteria(Massage.class,"Massage");
//        criteria.add(Restrictions.eq("massageCode",massageCode));
//        criteria.add(Restrictions.eq("massageName",massageName));
//        return criteria.list();
//    }
}
