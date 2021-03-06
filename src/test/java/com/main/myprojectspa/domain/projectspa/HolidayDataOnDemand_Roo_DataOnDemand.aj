// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.main.myprojectspa.domain.projectspa;

import com.main.myprojectspa.domain.projectspa.EmployeeDataOnDemand;
import com.main.myprojectspa.domain.projectspa.Holiday;
import com.main.myprojectspa.domain.projectspa.HolidayDataOnDemand;
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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

privileged aspect HolidayDataOnDemand_Roo_DataOnDemand {
    
    declare @type: HolidayDataOnDemand: @Component;
    
    private Random HolidayDataOnDemand.rnd = new SecureRandom();
    
    private List<Holiday> HolidayDataOnDemand.data;
    
    @Autowired
    EmployeeDataOnDemand HolidayDataOnDemand.employeeDataOnDemand;
    
    public Holiday HolidayDataOnDemand.getNewTransientHoliday(int index) {
        Holiday obj = new Holiday();
        setCreatedBy(obj, index);
        setCreatedDate(obj, index);
        setHolidayDate(obj, index);
        setHolidayDetail(obj, index);
        setStatus(obj, index);
        setUpdatedBy(obj, index);
        setUpdatedDate(obj, index);
        return obj;
    }
    
    public void HolidayDataOnDemand.setCreatedBy(Holiday obj, int index) {
        String createdBy = "createdBy_" + index;
        obj.setCreatedBy(createdBy);
    }
    
    public void HolidayDataOnDemand.setCreatedDate(Holiday obj, int index) {
        Date createdDate = new GregorianCalendar(Calendar.getInstance().get(Calendar.YEAR), Calendar.getInstance().get(Calendar.MONTH), Calendar.getInstance().get(Calendar.DAY_OF_MONTH), Calendar.getInstance().get(Calendar.HOUR_OF_DAY), Calendar.getInstance().get(Calendar.MINUTE), Calendar.getInstance().get(Calendar.SECOND) + new Double(Math.random() * 1000).intValue()).getTime();
        obj.setCreatedDate(createdDate);
    }
    
    public void HolidayDataOnDemand.setHolidayDate(Holiday obj, int index) {
        Date holidayDate = new GregorianCalendar(Calendar.getInstance().get(Calendar.YEAR), Calendar.getInstance().get(Calendar.MONTH), Calendar.getInstance().get(Calendar.DAY_OF_MONTH), Calendar.getInstance().get(Calendar.HOUR_OF_DAY), Calendar.getInstance().get(Calendar.MINUTE), Calendar.getInstance().get(Calendar.SECOND) + new Double(Math.random() * 1000).intValue()).getTime();
        obj.setHolidayDate(holidayDate);
    }
    
    public void HolidayDataOnDemand.setHolidayDetail(Holiday obj, int index) {
        String holidayDetail = "holidayDetail_" + index;
        obj.setHolidayDetail(holidayDetail);
    }
    
    public void HolidayDataOnDemand.setStatus(Holiday obj, int index) {
        String status = "status_" + index;
        obj.setStatus(status);
    }
    
    public void HolidayDataOnDemand.setUpdatedBy(Holiday obj, int index) {
        String updatedBy = "updatedBy_" + index;
        obj.setUpdatedBy(updatedBy);
    }
    
    public void HolidayDataOnDemand.setUpdatedDate(Holiday obj, int index) {
        Date updatedDate = new GregorianCalendar(Calendar.getInstance().get(Calendar.YEAR), Calendar.getInstance().get(Calendar.MONTH), Calendar.getInstance().get(Calendar.DAY_OF_MONTH), Calendar.getInstance().get(Calendar.HOUR_OF_DAY), Calendar.getInstance().get(Calendar.MINUTE), Calendar.getInstance().get(Calendar.SECOND) + new Double(Math.random() * 1000).intValue()).getTime();
        obj.setUpdatedDate(updatedDate);
    }
    
    public Holiday HolidayDataOnDemand.getSpecificHoliday(int index) {
        init();
        if (index < 0) {
            index = 0;
        }
        if (index > (data.size() - 1)) {
            index = data.size() - 1;
        }
        Holiday obj = data.get(index);
        Long id = obj.getId();
        return Holiday.findHoliday(id);
    }
    
    public Holiday HolidayDataOnDemand.getRandomHoliday() {
        init();
        Holiday obj = data.get(rnd.nextInt(data.size()));
        Long id = obj.getId();
        return Holiday.findHoliday(id);
    }
    
    public boolean HolidayDataOnDemand.modifyHoliday(Holiday obj) {
        return false;
    }
    
    public void HolidayDataOnDemand.init() {
        int from = 0;
        int to = 10;
        data = Holiday.findHolidayEntries(from, to);
        if (data == null) {
            throw new IllegalStateException("Find entries implementation for 'Holiday' illegally returned null");
        }
        if (!data.isEmpty()) {
            return;
        }
        
        data = new ArrayList<Holiday>();
        for (int i = 0; i < 10; i++) {
            Holiday obj = getNewTransientHoliday(i);
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
