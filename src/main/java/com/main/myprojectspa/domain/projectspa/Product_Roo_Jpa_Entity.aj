// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.main.myprojectspa.domain.projectspa;

import com.main.myprojectspa.domain.projectspa.Product;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

privileged aspect Product_Roo_Jpa_Entity {
    
    declare @type: Product: @Entity;
    
    declare @type: Product: @Inheritance(strategy = InheritanceType.TABLE_PER_CLASS);
    
}
