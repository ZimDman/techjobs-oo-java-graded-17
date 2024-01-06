package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId() {
        Job test_job1 = new Job();
        Job test_job2 = new Job();

        assertNotEquals(test_job1.getId(),test_job2.getId());

    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(test_job.getName() ,"Product tester");

        assertTrue(test_job.getEmployer() instanceof Employer);
        assertEquals("ACME", test_job.getEmployer().getValue());

        assertTrue(test_job.getLocation() instanceof Location);
        assertEquals("Desert", test_job.getLocation().getValue());

        assertTrue(test_job.getPositionType() instanceof PositionType);
        assertEquals("Quality control", test_job.getPositionType().getValue());

        assertTrue(test_job.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", test_job.getCoreCompetency().getValue());

    }

    @Test
    public void testJobsForEquality() {
        Job test_job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job test_job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(test_job1.equals(test_job2));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String test_string = test_job.toString();
        String space = System.lineSeparator();

        assertEquals(space + "ID: " + test_job.getId() + space + "Name: Product tester" + space +
                "Employer: ACME" + space + "Location: Desert" + space + "Position Type: Quality control" +
                space + "Core Competency: Persistence" + space, test_string);

    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String test_string = test_job.toString();
        String space = System.lineSeparator();

        assertEquals(space + "ID: " + test_job.getId() + space + "Name: Product tester" + space +
                "Employer: ACME" + space + "Location: Desert" + space + "Position Type: Quality control" +
                space + "Core Competency: Persistence" + space, test_string);
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job test_job = new Job("", null,null,null,null);

        String test_string = test_job.toString();
        String space = System.lineSeparator();

        assertEquals(space + "ID: " + test_job.getId() + space + "Name: Data not available" + space +
                "Employer: Data not available" + space + "Location: Data not available" + space +
                "Position Type: Data not available" + space + "Core Competency: Data not available" + space, test_string);

    }

   /* @Test
    public void testToStringHandlesIDOnly() {
        Job test_job = new Job();

        String test_string = test_job.toString();
        String space = System.lineSeparator();

        assertEquals(space + "ID: " + test_job.getId() + space +
                "OOPS! this job does not seem to exist." + space,test_string);


    }*/
}
