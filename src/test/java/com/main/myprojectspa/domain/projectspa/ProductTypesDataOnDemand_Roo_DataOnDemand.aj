// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.main.myprojectspa.domain.projectspa;

import com.main.myprojectspa.domain.projectspa.ProductTypes;
import com.main.myprojectspa.domain.projectspa.ProductTypesDataOnDemand;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import org.springframework.stereotype.Component;

privileged aspect ProductTypesDataOnDemand_Roo_DataOnDemand {
    
    declare @type: ProductTypesDataOnDemand: @Component;
    
    private Random ProductTypesDataOnDemand.rnd = new SecureRandom();
    
    private List<ProductTypes> ProductTypesDataOnDemand.data;
    
    public ProductTypes ProductTypesDataOnDemand.getNewTransientProductTypes(int index) {
        ProductTypes obj = new ProductTypes();
        setCreatedBy(obj, index);
        setCreatedDate(obj, index);
        setProductTypesDescription(obj, index);
        setProductTypesName(obj, index);
        setStatus(obj, index);
        setUpdatedBy(obj, index);
        setUpdatedDate(obj, index);
        return obj;
    }
    
    public void ProductTypesDataOnDemand.setCreatedBy(ProductTypes obj, int index) {
        String createdBy = "createdBy_" + index;
        obj.setCreatedBy(createdBy);
    }
    
    public void ProductTypesDataOnDemand.setCreatedDate(ProductTypes obj, int index) {
        Date createdDate = new GregorianCalendar(Calendar.getInstance().get(Calendar.YEAR), Calendar.getInstance().get(Calendar.MONTH), Calendar.getInstance().get(Calendar.DAY_OF_MONTH), Calendar.getInstance().get(Calendar.HOUR_OF_DAY), Calendar.getInstance().get(Calendar.MINUTE), Calendar.getInstance().get(Calendar.SECOND) + new Double(Math.random() * 1000).intValue()).getTime();
        obj.setCreatedDate(createdDate);
    }
    
    public void ProductTypesDataOnDemand.setProductTypesDescription(ProductTypes obj, int index) {
        String productTypesDescription = "productTypesDescription_" + index;
        obj.setProductTypesDescription(productTypesDescription);
    }
    
    public void ProductTypesDataOnDemand.setProductTypesName(ProductTypes obj, int index) {
        String productTypesName = "productTypesName_" + index;
        obj.setProductTypesName(productTypesName);
    }
    
    public void ProductTypesDataOnDemand.setStatus(ProductTypes obj, int index) {
        String status = "status_" + index;
        obj.setStatus(status);
    }
    
    public void ProductTypesDataOnDemand.setUpdatedBy(ProductTypes obj, int index) {
        String updatedBy = "updatedBy_" + index;
        obj.setUpdatedBy(updatedBy);
    }
    
    public void ProductTypesDataOnDemand.setUpdatedDate(ProductTypes obj, int index) {
        Date updatedDate = new GregorianCalendar(Calendar.getInstance().get(Calendar.YEAR), Calendar.getInstance().get(Calendar.MONTH), Calendar.getInstance().get(Calendar.DAY_OF_MONTH), Calendar.getInstance().get(Calendar.HOUR_OF_DAY), Calendar.getInstance().get(Calendar.MINUTE), Calendar.getInstance().get(Calendar.SECOND) + new Double(Math.random() * 1000).intValue()).getTime();
        obj.setUpdatedDate(updatedDate);
    }
    
    public ProductTypes ProductTypesDataOnDemand.getSpecificProductTypes(int index) {
        init();
        if (index < 0) {
            index = 0;
        }
        if (index > (data.size() - 1)) {
            index = data.size() - 1;
        }
        ProductTypes obj = data.get(index);
        Long id = obj.getId();
        return ProductTypes.findProductTypes(id);
    }
    
    public ProductTypes ProductTypesDataOnDemand.getRandomProductTypes() {
        init();
        ProductTypes obj = data.get(rnd.nextInt(data.size()));
        Long id = obj.getId();
        return ProductTypes.findProductTypes(id);
    }
    
    public boolean ProductTypesDataOnDemand.modifyProductTypes(ProductTypes obj) {
        return false;
    }
    
    public void ProductTypesDataOnDemand.init() {
        int from = 0;
        int to = 10;
        data = ProductTypes.findProductTypesEntries(from, to);
        if (data == null) {
            throw new IllegalStateException("Find entries implementation for 'ProductTypes' illegally returned null");
        }
        if (!data.isEmpty()) {
            return;
        }
        
        data = new ArrayList<ProductTypes>();
        for (int i = 0; i < 10; i++) {
            ProductTypes obj = getNewTransientProductTypes(i);
            try {
                obj.persist();
            } catch (final ConstraintViolationException e) {
                final StringBuilder msg = new StringBuilder();
                for (Iterator<ConstraintViolation<?>> iter = e.getConstraintViolations().iterator(); iter.hasNext();) {
                    final ConstraintViolation<?> cv = iter.next();
                    msg.append("[").append(cv.getRootBean().getClass().getName()).append(".").append(cv.getPropertyPath()).append(": ").append(cv.getMessage()).append(" (invalid value = ").append(cv.getInvalidValue()).append(")").append("]");
                }
                throw new IllegalStateException(msg.toString(), e);
            }
            obj.flush();
            data.add(obj);
        }
    }
    
}