// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.main.myprojectspa.domain.projectspa;

import com.main.myprojectspa.domain.projectspa.Massage;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

privileged aspect Massage_Roo_Jpa_Entity {
    
    declare @type: Massage: @Entity;
    
    declare @type: Massage: @Inheritance(strategy = InheritanceType.TABLE_PER_CLASS);
    
}
