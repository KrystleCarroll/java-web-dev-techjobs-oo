package Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;
import org.w3c.dom.ls.LSOutput;


import javax.print.attribute.standard.JobName;

import static org.junit.Assert.*;


public class JobTest {
//    private int id;
//    private String name;
//    private String employer;
//    private String location;
//    private String positionType;
//    private String coreCompetency;

    Job job1, job2, jobObjectOne, jobObjectTwo, jobNotEqualOne, jobNotEqualTwo;


    @Before
    public void creatingJobObjects() {
        job1 = new Job();
        job2 = new Job();
        //String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency
        jobObjectOne = new Job("JobOne", new Employer("EmployerOne"), new Location("LocationOne"), new PositionType("PositionOne"), new CoreCompetency("CoreCompetencyOne"));
        jobObjectTwo = new Job("JobTwo", new Employer("EmployerTwo"), new Location("LocationTwo"), new PositionType("PositionTwo"), new CoreCompetency("CoreCompetencyTwo"));

    }

    @Test
    public void testSettingJobId() {
        //System.out.println(jobObjectOne);
        //assertEquals(1, job2.getId() - job1.getId());
        assertEquals(1, jobObjectTwo.getId() - jobObjectOne.getId());

        //System.out.println(job1.getId());

//        assertEquals("JobOne", "JobTwo", 1);
//        assertEquals("EmployerOne", "EmployerTwo", 1);
//        assertEquals("LocationOne", "LocationTwo", 1);
//        assertEquals("PositionOne", "PositionTwo", 1);
//        assertEquals("CoreCompetencyOne", "CoreCompetencyTwo", 1);
    }

//    private void assertFalse(int i, int i1) {
//    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job jobObjectThree = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(jobObjectThree instanceof Job);
        jobObjectThree.getName();
        jobObjectThree.getEmployer().toString();
        jobObjectThree.getLocation().toString();
        jobObjectThree.getPositionType().toString();
        jobObjectThree.getCoreCompetency().toString();
//        System.out.println(jobObjectThree.getName());
        assertEquals("Product Tester", jobObjectThree.getName());
        assertEquals("ACME", jobObjectThree.getEmployer().getValue());
        assertEquals("Desert", jobObjectThree.getLocation().getValue());
        assertEquals("Quality control", jobObjectThree.getPositionType().getValue());
        assertEquals("Persistence", jobObjectThree.getCoreCompetency().getValue());
    }


    @Test
    public void testJobsForEquality() {
        jobNotEqualOne = new Job();
        jobNotEqualTwo = new Job();
        Job jobNotEqualOne = new Job("Test", new Employer("LaunchCode"), new Location("Missouri"), new PositionType("Instructor"), new CoreCompetency("Experienced"));
        Job jobNotEqualTwo = new Job("Test", new Employer("LaunchCode"), new Location("Missouri"), new PositionType("Instructor"), new CoreCompetency("Experienced"));

        assertFalse(jobNotEqualOne.getId() == jobNotEqualTwo.getId());

    }

    @Test //test for new line before and after test
    public void startsAndEndsWithBlankLineTest() {
        Job testing = new Job();
//        System.out.println(testing.toString().startsWith(""));
        assertTrue(testing.toString().startsWith(""));

//        System.out.println(testing.toString().endsWith(""));
        assertTrue(testing.toString().endsWith(""));

    }

    @Test
    public void firstTestForToString() {
        String expectedOutput = "\nID: " + jobObjectOne.getId() + "\nName: " + jobObjectOne.getName() + "\nEmployer: " + jobObjectOne.getEmployer() + "\nLocation: " + jobObjectOne.getLocation() + "\nPosition Type: " + jobObjectOne.getPositionType() + "\nCore Competency: " + jobObjectOne.getCoreCompetency();
        assertEquals(jobObjectOne.toString(), expectedOutput);
        //System.out.println(jobObjectOne.toString());
    }

    @Test
    public void expectedValue () {
        Job noExpectedValue = new Job("Test2", new Employer("LaunchCode2"), new Location("Missouri2"), new PositionType("Instructor2"), new CoreCompetency("Experienced1"));
        assertNotEquals(jobObjectOne.toString(), noExpectedValue);
    }
}
    



