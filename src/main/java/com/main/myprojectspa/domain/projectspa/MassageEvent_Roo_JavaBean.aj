// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.main.myprojectspa.domain.projectspa;

import com.main.myprojectspa.domain.projectspa.Customer;
import com.main.myprojectspa.domain.projectspa.Employee;
import com.main.myprojectspa.domain.projectspa.Massage;
import com.main.myprojectspa.domain.projectspa.MassageEvent;
import java.util.Date;

privileged aspect MassageEvent_Roo_JavaBean {
    
    public Date MassageEvent.getEventStartTime() {
        return this.eventStartTime;
    }
    
    public void MassageEvent.setEventStartTime(Date eventStartTime) {
        this.eventStartTime = eventStartTime;
    }
    
    public Date MassageEvent.getEventEndTime() {
        return this.eventEndTime;
    }
    
    public void MassageEvent.setEventEndTime(Date eventEndTime) {
        this.eventEndTime = eventEndTime;
    }
    
    public Customer MassageEvent.getUserReserve() {
        return this.userReserve;
    }
    
    public void MassageEvent.setUserReserve(Customer userReserve) {
        this.userReserve = userReserve;
    }
    
    public Massage MassageEvent.getMassage() {
        return this.massage;
    }
    
    public void MassageEvent.setMassage(Massage massage) {
        this.massage = massage;
    }
    
    public Employee MassageEvent.getEmployee() {
        return this.employee;
    }
    
    public void MassageEvent.setEmployee(Employee employee) {
        this.employee = employee;
    }
    
}