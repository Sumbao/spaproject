package com.main.myprojectspa.domain.projectspa;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import java.util.List;
import java.util.Date;

privileged aspect MassageEvent_Custom_Finder {
    public static List<MassageEvent> MassageEvent.findeventbyEmpId(long empId){
        Criteria criteria =((Session) MassageEvent.entityManager().getDelegate()).createCriteria(MassageEvent.class,"MassageEvent");
        criteria.add(Restrictions.eq("MassageEvent.employee.id",empId));
        return criteria.list();
    }

    public static List<MassageEvent> MassageEvent.findeventbyDate(Date reservedatetosearch){
        Criteria criteria =((Session) MassageEvent.entityManager().getDelegate()).createCriteria(MassageEvent.class,"MassageEvent");
        criteria.add(Restrictions.eq("MassageEvent.reserveDate",reservedatetosearch));
        return criteria.list();
    }

    public static List<MassageEvent> MassageEvent.findoverlapdata(long empreserve,Date reserveDate){
//        Date reserveDate = new Date(reservedate);
//        Date starttime = new Date(startTime);
//        Date endtime = new Date(endTime);
        Criteria criteria = ((Session) MassageEvent.entityManager().getDelegate()).createCriteria(MassageEvent.class,"MassageEvent");
//        Criterion case1 = Restrictions.and(Restrictions.eq("MassageEvent.employee.id",empreserve),Restrictions.eq("MassageEvent.reserveDate",reserveDate),Restrictions.gt("MassageEvent.eventStartTime",starttime));
//        Criterion case2 = Restrictions.and(Restrictions.eq("MassageEvent.employee.id",empreserve),Restrictions.eq("MassageEvent.reserveDate",reserveDate),Restrictions.lt("MassageEvent.eventEndTime",starttime));
//        Criterion case3 = Restrictions.and(Restrictions.eq("MassageEvent.employee.id",empreserve),Restrictions.eq("MassageEvent.reserveDate",reserveDate),Restrictions.gt("MassageEvent.eventStartTime",endtime));
//        Criterion case4 = Restrictions.and(Restrictions.eq("MassageEvent.employee.id",empreserve),Restrictions.eq("MassageEvent.reserveDate",reserveDate),Restrictions.lt("MassageEvent.eventEndTime",endtime));
//        Criterion case5 = Restrictions.and(Restrictions.eq("MassageEvent.employee.id",empreserve),Restrictions.eq("MassageEvent.reserveDate",reserveDate),Restrictions.eq("MassageEvent.eventStartTime",starttime),Restrictions.eq("MassageEvent.eventStartTime",endtime),Restrictions.eq("MassageEvent.eventEndTime",endtime));
//        criteria.add(Restrictions.or(case1,case2,case3,case4,case5));
        Criterion testcase1 = Restrictions.and(Restrictions.eq("MassageEvent.employee.id",empreserve),Restrictions.eq("MassageEvent.reserveDate",reserveDate));
//        Criterion testcase2 = Restrictions.and(Restrictions.eq("MassageEvent.employee.id",empreserve),Restrictions.eq("MassageEvent.reserveDate",reserveDate),Restrictions.eq("MassageEvent.eventEndTime",starttime));
//        Criterion testcase3 = Restrictions.and(Restrictions.eq("MassageEvent.employee.id",empreserve),Restrictions.eq("MassageEvent.reserveDate",reserveDate),Restrictions.eq("MassageEvent.eventStartTime",endtime));
//        Criterion testcase4 = Restrictions.and(Restrictions.eq("MassageEvent.employee.id",empreserve),Restrictions.eq("MassageEvent.reserveDate",reserveDate),Restrictions.eq("MassageEvent.eventEndTime",endtime));
//        Criterion testcase5 = Restrictions.and(Restrictions.eq("MassageEvent.employee.id",empreserve),Restrictions.eq("MassageEvent.reserveDate",reserveDate),Restrictions.gt("MassageEvent.eventStartTime",starttime));
//        Criterion testcase6 = Restrictions.and(Restrictions.eq("MassageEvent.employee.id",empreserve),Restrictions.eq("MassageEvent.reserveDate",reserveDate),Restrictions.gt("MassageEvent.eventStartTime",endtime));
//        Criterion testcase7 = Restrictions.and(Restrictions.eq("MassageEvent.employee.id",empreserve),Restrictions.eq("MassageEvent.reserveDate",reserveDate),Restrictions.lt("MassageEvent.eventEndTime",starttime));
//        Criterion testcase8 = Restrictions.and(Restrictions.eq("MassageEvent.employee.id",empreserve),Restrictions.eq("MassageEvent.reserveDate",reserveDate),Restrictions.lt("MassageEvent.eventEndTime",endtime));
//        //criteria.add(Restrictions.eq("MassageEvent.employee.id",empreserve));
        //criteria.add(Restrictions.or(testcase1,testcase2,testcase3,testcase4,testcase5,testcase6,testcase7,testcase8));
        criteria.add(Restrictions.or(testcase1));
        return criteria.list();
    }
}