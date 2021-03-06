package com.main.myprojectspa.domain.projectspa;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

privileged aspect Customer_Custom_Finder {
    public static List<Customer> Customer.findCustomerbyId(String cusId){
        Criteria criteria =((Session) Customer.entityManager().getDelegate()).createCriteria(Customer.class,"Customer");
        criteria.add(Restrictions.eq("username",cusId));
        List<Customer> list = criteria.list();
        return list;
    }

    public static List<Customer> Customer.findCustomerbyUsername(String username){
        Criteria criteria =((Session) Customer.entityManager().getDelegate()).createCriteria(Customer.class,"Customer");
        criteria.add(Restrictions.eq("username",username));
        List<Customer> list = criteria.list();
        return list;
    }
}