package com.main.myprojectspa.domain.projectspa;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import com.main.myprojectspa.domain.projectspa.Employee;
import java.util.List;

privileged aspect Employee_Custom_Finder {
    public static List<Employee> Employee.findEmpbyId(String empCode){
        Criteria criteria =((Session) Customer.entityManager().getDelegate()).createCriteria(Employee.class,"Employee");
        criteria.add(Restrictions.eq("empCode",empCode));
        List<Employee> list = criteria.list();
        return list;
    }
}