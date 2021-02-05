package Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class JobTest {
    Job job1,job2,jobObjectOne, jobObjectTwo, jobNotEqualOne, jobNotEqualTwo;

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
       // assertEquals(1, job2.getId() - job1.getId());
        assertEquals(1, jobObjectOne.getId() - jobObjectOne.getId());

        //System.out.println(job1.getId());

//        assertEquals("JobOne", "JobTwo", 1);
//        assertEquals("EmployerOne", "EmployerTwo", 1);
//        assertEquals("LocationOne", "LocationTwo", 1);
//        assertEquals("PositionOne", "PositionTwo", 1);
//        assertEquals("CoreCompetencyOne", "CoreCompetencyTwo", 1);
    }

    private void assertFalse(int i, int i1) {
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job jobObjectThree = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(jobObjectThree instanceof Job);
    }

    @Test
    public void testJobsForEquality () {
        jobNotEqualOne = new Job();
        jobNotEqualTwo = new Job();
        Job jobNotEqualOne =  new Job("Test", new Employer("LaunchCode"), new Location("Missouri"), new PositionType("Instructor"), new CoreCompetency("Experienced"));
        Job jobNotEqualTwo =  new Job("Test", new Employer("LaunchCode"), new Location("Missouri"), new PositionType("Instructor"), new CoreCompetency("Experienced"));

        assertFalse(jobNotEqualOne.getId(), jobNotEqualTwo.getId());

    }

}
