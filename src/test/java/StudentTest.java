package java;

import org.junit.Test;

import java.Student;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testIfStudentCanBeCreated(){
        Student john = new Student(1L, "john");
        Student nullStudent = null;
        assertNotNull(john);
        assertNull(nullStudent);
    }

    @Test
    public void testIfFieldsAreSet(){
        Student idris = new Student(1L, "idris");
        assertEquals(1L, idris.getId());
        assertEquals("idris", idris.getName());

    }

    @Test
    public void testIfAddGradeWorks(){
        Student harley = new Student(1L, "harley");
        assertEquals(0, harley.getGrades().size());
        harley.addGrade(90);
        assertEquals(1, harley.getGrades().size());
        harley.addGrade(70);
        assertEquals(2, harley.getGrades().size());
    }

    @Test
    public void testIfGetGradesWorks(){
        Student fer = new Student(1L, "fer");
        fer.addGrade(90);
        fer.addGrade(70);
        assertSame(90, fer.getGrades().get(0));
        assertSame(70, fer.getGrades().get(1));
    }

    @Test
    public void testIfGetAVGWorks(){
        Student shark = new Student(1L, "shark");
        shark.addGrade(90);
        shark.addGrade(70);
        assertEquals(80, shark.getGradeAverage(), 0);
        shark.addGrade(50);
        assertEquals(70, shark.getGradeAverage(), 0);
    }

}
