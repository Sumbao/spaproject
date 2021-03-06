// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.main.myprojectspa.domain.projectspa;

import com.main.myprojectspa.domain.projectspa.MassageEvent;
import com.main.myprojectspa.domain.projectspa.MassageEventDataOnDemand;
import com.main.myprojectspa.domain.projectspa.MassageEventIntegrationTest;
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

privileged aspect MassageEventIntegrationTest_Roo_IntegrationTest {
    
    declare @type: MassageEventIntegrationTest: @RunWith(SpringJUnit4ClassRunner.class);
    
    declare @type: MassageEventIntegrationTest: @ContextConfiguration(locations = "classpath*:/META-INF/spring/applicationContext*.xml");
    
    declare @type: MassageEventIntegrationTest: @Transactional;
    
    @Autowired
    MassageEventDataOnDemand MassageEventIntegrationTest.dod;
    
    @Test
    public void MassageEventIntegrationTest.testCountMassageEvents() {
        Assert.assertNotNull("Data on demand for 'MassageEvent' failed to initialize correctly", dod.getRandomMassageEvent());
        long count = MassageEvent.countMassageEvents();
        Assert.assertTrue("Counter for 'MassageEvent' incorrectly reported there were no entries", count > 0);
    }
    
    @Test
    public void MassageEventIntegrationTest.testFindMassageEvent() {
        MassageEvent obj = dod.getRandomMassageEvent();
        Assert.assertNotNull("Data on demand for 'MassageEvent' failed to initialize correctly", obj);
        Long id = obj.getId();
        Assert.assertNotNull("Data on demand for 'MassageEvent' failed to provide an identifier", id);
        obj = MassageEvent.findMassageEvent(id);
        Assert.assertNotNull("Find method for 'MassageEvent' illegally returned null for id '" + id + "'", obj);
        Assert.assertEquals("Find method for 'MassageEvent' returned the incorrect identifier", id, obj.getId());
    }
    
    @Test
    public void MassageEventIntegrationTest.testFindAllMassageEvents() {
        Assert.assertNotNull("Data on demand for 'MassageEvent' failed to initialize correctly", dod.getRandomMassageEvent());
        long count = MassageEvent.countMassageEvents();
        Assert.assertTrue("Too expensive to perform a find all test for 'MassageEvent', as there are " + count + " entries; set the findAllMaximum to exceed this value or set findAll=false on the integration test annotation to disable the test", count < 250);
        List<MassageEvent> result = MassageEvent.findAllMassageEvents();
        Assert.assertNotNull("Find all method for 'MassageEvent' illegally returned null", result);
        Assert.assertTrue("Find all method for 'MassageEvent' failed to return any data", result.size() > 0);
    }
    
    @Test
    public void MassageEventIntegrationTest.testFindMassageEventEntries() {
        Assert.assertNotNull("Data on demand for 'MassageEvent' failed to initialize correctly", dod.getRandomMassageEvent());
        long count = MassageEvent.countMassageEvents();
        if (count > 20) count = 20;
        int firstResult = 0;
        int maxResults = (int) count;
        List<MassageEvent> result = MassageEvent.findMassageEventEntries(firstResult, maxResults);
        Assert.assertNotNull("Find entries method for 'MassageEvent' illegally returned null", result);
        Assert.assertEquals("Find entries method for 'MassageEvent' returned an incorrect number of entries", count, result.size());
    }
    
    @Test
    public void MassageEventIntegrationTest.testFlush() {
        MassageEvent obj = dod.getRandomMassageEvent();
        Assert.assertNotNull("Data on demand for 'MassageEvent' failed to initialize correctly", obj);
        Long id = obj.getId();
        Assert.assertNotNull("Data on demand for 'MassageEvent' failed to provide an identifier", id);
        obj = MassageEvent.findMassageEvent(id);
        Assert.assertNotNull("Find method for 'MassageEvent' illegally returned null for id '" + id + "'", obj);
        boolean modified =  dod.modifyMassageEvent(obj);
        Integer currentVersion = obj.getVersion();
        obj.flush();
        Assert.assertTrue("Version for 'MassageEvent' failed to increment on flush directive", (currentVersion != null && obj.getVersion() > currentVersion) || !modified);
    }
    
    @Test
    public void MassageEventIntegrationTest.testMergeUpdate() {
        MassageEvent obj = dod.getRandomMassageEvent();
        Assert.assertNotNull("Data on demand for 'MassageEvent' failed to initialize correctly", obj);
        Long id = obj.getId();
        Assert.assertNotNull("Data on demand for 'MassageEvent' failed to provide an identifier", id);
        obj = MassageEvent.findMassageEvent(id);
        boolean modified =  dod.modifyMassageEvent(obj);
        Integer currentVersion = obj.getVersion();
        MassageEvent merged = (MassageEvent)obj.merge();
        obj.flush();
        Assert.assertEquals("Identifier of merged object not the same as identifier of original object", merged.getId(), id);
        Assert.assertTrue("Version for 'MassageEvent' failed to increment on merge and flush directive", (currentVersion != null && obj.getVersion() > currentVersion) || !modified);
    }
    
    @Test
    public void MassageEventIntegrationTest.testPersist() {
        Assert.assertNotNull("Data on demand for 'MassageEvent' failed to initialize correctly", dod.getRandomMassageEvent());
        MassageEvent obj = dod.getNewTransientMassageEvent(Integer.MAX_VALUE);
        Assert.assertNotNull("Data on demand for 'MassageEvent' failed to provide a new transient entity", obj);
        Assert.assertNull("Expected 'MassageEvent' identifier to be null", obj.getId());
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
        Assert.assertNotNull("Expected 'MassageEvent' identifier to no longer be null", obj.getId());
    }
    
    @Test
    public void MassageEventIntegrationTest.testRemove() {
        MassageEvent obj = dod.getRandomMassageEvent();
        Assert.assertNotNull("Data on demand for 'MassageEvent' failed to initialize correctly", obj);
        Long id = obj.getId();
        Assert.assertNotNull("Data on demand for 'MassageEvent' failed to provide an identifier", id);
        obj = MassageEvent.findMassageEvent(id);
        obj.remove();
        obj.flush();
        Assert.assertNull("Failed to remove 'MassageEvent' with identifier '" + id + "'", MassageEvent.findMassageEvent(id));
    }
    
}
