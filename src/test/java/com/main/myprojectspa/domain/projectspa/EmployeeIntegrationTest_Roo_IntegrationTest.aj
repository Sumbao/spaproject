// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.main.myprojectspa.domain.projectspa;

import com.main.myprojectspa.domain.projectspa.Employee;
import com.main.myprojectspa.domain.projectspa.EmployeeDataOnDemand;
import com.main.myprojectspa.domain.projectspa.EmployeeIntegrationTest;
import java.util.Iterator;
import java.util.List;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

privileged aspect EmployeeIntegrationTest_Roo_IntegrationTest {
    
    declare @type: EmployeeIntegrationTest: @RunWith(SpringJUnit4ClassRunner.class);
    
    declare @type: EmployeeIntegrationTest: @ContextConfiguration(locations = "classpath*:/META-INF/spring/applicationContext*.xml");
    
    declare @type: EmployeeIntegrationTest: @Transactional;
    
    @Autowired
    EmployeeDataOnDemand EmployeeIntegrationTest.dod;
    
    @Test
    public void EmployeeIntegrationTest.testCountEmployees() {
        Assert.assertNotNull("Data on demand for 'Employee' failed to initialize correctly", dod.getRandomEmployee());
        long count = Employee.countEmployees();
        Assert.assertTrue("Counter for 'Employee' incorrectly reported there were no entries", count > 0);
    }
    
    @Test
    public void EmployeeIntegrationTest.testFindEmployee() {
        Employee obj = dod.getRandomEmployee();
        Assert.assertNotNull("Data on demand for 'Employee' failed to initialize correctly", obj);
        Long id = obj.getId();
        Assert.assertNotNull("Data on demand for 'Employee' failed to provide an identifier", id);
        obj = Employee.findEmployee(id);
        Assert.assertNotNull("Find method for 'Employee' illegally returned null for id '" + id + "'", obj);
        Assert.assertEquals("Find method for 'Employee' returned the incorrect identifier", id, obj.getId());
    }
    
    @Test
    public void EmployeeIntegrationTest.testFindAllEmployees() {
        Assert.assertNotNull("Data on demand for 'Employee' failed to initialize correctly", dod.getRandomEmployee());
        long count = Employee.countEmployees();
        Assert.assertTrue("Too expensive to perform a find all test for 'Employee', as there are " + count + " entries; set the findAllMaximum to exceed this value or set findAll=false on the integration test annotation to disable the test", count < 250);
        List<Employee> result = Employee.findAllEmployees();
        Assert.assertNotNull("Find all method for 'Employee' illegally returned null", result);
        Assert.assertTrue("Find all method for 'Employee' failed to return any data", result.size() > 0);
    }
    
    @Test
    public void EmployeeIntegrationTest.testFindEmployeeEntries() {
        Assert.assertNotNull("Data on demand for 'Employee' failed to initialize correctly", dod.getRandomEmployee());
        long count = Employee.countEmployees();
        if (count > 20) count = 20;
        int firstResult = 0;
        int maxResults = (int) count;
        List<Employee> result = Employee.findEmployeeEntries(firstResult, maxResults);
        Assert.assertNotNull("Find entries method for 'Employee' illegally returned null", result);
        Assert.assertEquals("Find entries method for 'Employee' returned an incorrect number of entries", count, result.size());
    }
    
    @Test
    public void EmployeeIntegrationTest.testFlush() {
        Employee obj = dod.getRandomEmployee();
        Assert.assertNotNull("Data on demand for 'Employee' failed to initialize correctly", obj);
        Long id = obj.getId();
        Assert.assertNotNull("Data on demand for 'Employee' failed to provide an identifier", id);
        obj = Employee.findEmployee(id);
        Assert.assertNotNull("Find method for 'Employee' illegally returned null for id '" + id + "'", obj);
        boolean modified =  dod.modifyEmployee(obj);
        Integer currentVersion = obj.getVersion();
        obj.flush();
        Assert.assertTrue("Version for 'Employee' failed to increment on flush directive", (currentVersion != null && obj.getVersion() > currentVersion) || !modified);
    }
    
    @Test
    public void EmployeeIntegrationTest.testMergeUpdate() {
        Employee obj = dod.getRandomEmployee();
        Assert.assertNotNull("Data on demand for 'Employee' failed to initialize correctly", obj);
        Long id = obj.getId();
        Assert.assertNotNull("Data on demand for 'Employee' failed to provide an identifier", id);
        obj = Employee.findEmployee(id);
        boolean modified =  dod.modifyEmployee(obj);
        Integer currentVersion = obj.getVersion();
        Employee merged = (Employee)obj.merge();
        obj.flush();
        Assert.assertEquals("Identifier of merged object not the same as identifier of original object", merged.getId(), id);
        Assert.assertTrue("Version for 'Employee' failed to increment on merge and flush directive", (currentVersion != null && obj.getVersion() > currentVersion) || !modified);
    }
    
    @Test
    public void EmployeeIntegrationTest.testPersist() {
        Assert.assertNotNull("Data on demand for 'Employee' failed to initialize correctly", dod.getRandomEmployee());
        Employee obj = dod.getNewTransientEmployee(Integer.MAX_VALUE);
        Assert.assertNotNull("Data on demand for 'Employee' failed to provide a new transient entity", obj);
        Assert.assertNull("Expected 'Employee' identifier to be null", obj.getId());
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
        Assert.assertNotNull("Expected 'Employee' identifier to no longer be null", obj.getId());
    }
    
    @Test
    public void EmployeeIntegrationTest.testRemove() {
        Employee obj = dod.getRandomEmployee();
        Assert.assertNotNull("Data on demand for 'Employee' failed to initialize correctly", obj);
        Long id = obj.getId();
        Assert.assertNotNull("Data on demand for 'Employee' failed to provide an identifier", id);
        obj = Employee.findEmployee(id);
        obj.remove();
        obj.flush();
        Assert.assertNull("Failed to remove 'Employee' with identifier '" + id + "'", Employee.findEmployee(id));
    }
    
}
