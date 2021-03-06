package com.main.myprojectspa.domain.projectspa;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

privileged aspect Product_Custom_Finder {
    public static List<Product> Product.createproduct(String proName,String proCode,String photoName){
        Criteria criteria =((Session) Product.entityManager().getDelegate()).createCriteria(Product.class,"Product");
        criteria.add(Restrictions.eq("productId",proCode));
        criteria.add(Restrictions.eq("productName",proName));
        criteria.add(Restrictions.eq("productPicture",photoName));
        List<Product> list = criteria.list();
        return list;
    }

    public  static List<Product> Product.findProductBytypeid(Long typeid){
        Criteria criteria =((Session) Product.entityManager().getDelegate()).createCriteria(Product.class,"Product");
//        criteria.createAlias("ProductTypes","ProductTypes");
        criteria.add(Restrictions.eq("Product.productTypes.id",typeid));
        List<Product> list = criteria.list();
        return list;
    }

    public static List<Product> Product.findbyId(Long proId){
        Criteria criteria = ((Session) Product.entityManager().getDelegate()).createCriteria(Product.class,"Product");
        criteria.add(Restrictions.eq("productId",proId));
        List<Product> list = criteria.list();
        return list;
    }
}