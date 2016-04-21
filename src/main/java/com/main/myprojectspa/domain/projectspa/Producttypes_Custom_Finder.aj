package com.main.myprojectspa.domain.projectspa;

import com.main.myprojectspa.domain.projectspa.ProductTypes;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

privileged aspect Producttypes_Custom_Finder {
    public static List<ProductTypes> ProductTypes.findprotypebyname(String protypename){
        Criteria criteria =((Session) Customer.entityManager().getDelegate()).createCriteria(ProductTypes.class,"protype");
        criteria.add(Restrictions.eq("productTypesName",protypename));
        List<ProductTypes> list = criteria.list();
        return list;
    }
}