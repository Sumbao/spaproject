// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.main.myprojectspa.domain.projectspa;

import com.main.myprojectspa.domain.projectspa.Massage;
import com.main.myprojectspa.domain.projectspa.MassageTypes;
import java.util.Set;

privileged aspect MassageTypes_Roo_JavaBean {
    
    public String MassageTypes.getMassageTypeCode() {
        return this.massageTypeCode;
    }
    
    public void MassageTypes.setMassageTypeCode(String massageTypeCode) {
        this.massageTypeCode = massageTypeCode;
    }
    
    public String MassageTypes.getMassageTypeName() {
        return this.massageTypeName;
    }
    
    public void MassageTypes.setMassageTypeName(String massageTypeName) {
        this.massageTypeName = massageTypeName;
    }
    
    public Set<Massage> MassageTypes.getMassage() {
        return this.massage;
    }
    
    public void MassageTypes.setMassage(Set<Massage> massage) {
        this.massage = massage;
    }
    
}
