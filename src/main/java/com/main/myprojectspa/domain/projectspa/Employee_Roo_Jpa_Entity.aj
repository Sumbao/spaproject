// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.main.myprojectspa.domain.projectspa;

import com.main.myprojectspa.domain.projectspa.Employee;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

privileged aspect Employee_Roo_Jpa_Entity {
    
    declare @type: Employee: @Entity;
    
    declare @type: Employee: @Inheritance(strategy = InheritanceType.TABLE_PER_CLASS);
    
}
