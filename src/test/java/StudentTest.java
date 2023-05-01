import org.junit.Test;
import org.junit.Before;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class StudentTest {

    private Student student;

    @Before
    public void setUp() {
        student = new Student();
        student.setId(1);
        student.setName("Ezra");
        student.addGrade(90);
        student.addGrade(85);
        student.addGrade(95);
    }

    @Test
    public void testGetId() {
        assertEquals(1, student.getId());
    }

    @Test
    public void testGetName() {
        assertEquals("Ezra", student.getName());
    }

    @Test
    public void testGetGrades() {
        ArrayList<Integer> expectedGrades = new ArrayList<>();
        expectedGrades.add(90);
        expectedGrades.add(85);
        expectedGrades.add(95);

        assertEquals(expectedGrades, student.getGrades());
    }

    @Test
    public void testGetGradeAverage() {
        double expectedAverage = (90 + 85 + 95) / 3.0;

        assertEquals(expectedAverage, student.getGradeAverage(), 0.001);
    }

    @Test
    public void testGetAverage() {
        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(80);
        grades.add(70);
        grades.add(90);

        double expectedAverage = (80 + 70 + 90) / 3.0;

        assertEquals(expectedAverage, student.getAverage(grades), 0.001);
    }

    @Test
    public void testGetAverageWithEmptyList() {
        ArrayList<Integer> grades = new ArrayList<>();

        assertEquals(0.0, student.getAverage(grades), 0.001);
    }

    @Test
    public void testGetAverageWithNullList() {
        assertEquals(0.0, student.getAverage(null), 0.001);
    }
}
