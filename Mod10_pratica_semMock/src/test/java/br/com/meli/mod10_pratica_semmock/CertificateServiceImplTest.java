package br.com.meli.mod10_pratica_semmock;

import br.com.meli.mod10_pratica_semmock.dto.GradeDTO;
import br.com.meli.mod10_pratica_semmock.dto.StudentDTO;
import br.com.meli.mod10_pratica_semmock.dto.SubjectDTO;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
@AutoConfigureMockMvc
@ExtendWith(SpringExtension.class)
public class CertificateServiceImplTest {

    @Test
    public void analyzeNotesTest_mustPass() {
        List<SubjectDTO> subjects = new ArrayList<>();
        subjects.add(new SubjectDTO("Matemática", 10.0));
        subjects.add(new SubjectDTO("Física", 9.0));
        subjects.add(new SubjectDTO("Química", 8.0));
        StudentDTO student = new StudentDTO("Rodrigo", subjects);
        GradeDTO manualGrade = new GradeDTO(String.format("Sua média foi de %.1f! Parabéns", 9.0), 9.0, student);
        GradeDTO autoGrade = new GradeDTO(student);
        assertEquals(manualGrade, autoGrade);
    }

    @Test
    public void analyzeNotesTest_mustNotPass() {
        List<SubjectDTO> subjects = new ArrayList<>();
        subjects.add(new SubjectDTO("Matemática", 10.0));
        subjects.add(new SubjectDTO("Física", 9.0));
        subjects.add(new SubjectDTO("Química", 8.0));
        StudentDTO student = new StudentDTO("Rodrigo", subjects);
        GradeDTO grade = new GradeDTO(String.format("Sua média foi de %.1f! Parabéns", 9.0), 9.0, student);
        GradeDTO assertGrade = new GradeDTO(new StudentDTO("Felipe", subjects));
        assertNotEquals(grade, assertGrade);
    }

    @Test
    public void calculateAverage_mustPass() {
        List<SubjectDTO> subjects = new ArrayList<>();
        subjects.add(new SubjectDTO("Matemática", 10.0));
        subjects.add(new SubjectDTO("Física", 9.0));
        subjects.add(new SubjectDTO("Química", 8.0));
        StudentDTO student = new StudentDTO("Rodrigo", subjects);
        GradeDTO grade = new GradeDTO();
        grade.calculateAverage(student);
        assertEquals(9.0, grade.getAverage());
    }

    @Test
    public void calculateAverage_mustNotPass() {
        List<SubjectDTO> subjects = new ArrayList<>();
        subjects.add(new SubjectDTO("Matemática", 10.0));
        subjects.add(new SubjectDTO("Física", 9.0));
        subjects.add(new SubjectDTO("Química", 8.0));
        StudentDTO student = new StudentDTO("Rodrigo", subjects);
        GradeDTO grade = new GradeDTO(student);
        assertNotEquals(10.0, grade.getAverage());
    }

    @Test
    public void writeDiploma_mustPass() {
        List<SubjectDTO> subjects = new ArrayList<>();
        subjects.add(new SubjectDTO("Matemática", 10.0));
        subjects.add(new SubjectDTO("Física", 7.0));
        subjects.add(new SubjectDTO("Química", 7.0));
        StudentDTO student = new StudentDTO("Rodrigo", subjects);
        GradeDTO grade = new GradeDTO(student);
        assertEquals(String.format("Sua média foi de %.1f", 8.0), grade.getMessage());
    }

    @Test
    public void writeDiploma_mustNotPass() {
        List<SubjectDTO> subjects = new ArrayList<>();
        subjects.add(new SubjectDTO("Matemática", 10.0));
        subjects.add(new SubjectDTO("Física", 7.0));
        subjects.add(new SubjectDTO("Química", 7.0));
        StudentDTO student = new StudentDTO("Rodrigo", subjects);
        GradeDTO grade = new GradeDTO(student);
        assertNotEquals(String.format("Sua média foi de %.1f.", 6.0), grade.getMessage());
    }

    @Test
    public void whitHonors_mustPass() {
        List<SubjectDTO> subjects = new ArrayList<>();
        subjects.add(new SubjectDTO("Matemática", 10.0));
        subjects.add(new SubjectDTO("Física", 9.0));
        subjects.add(new SubjectDTO("Química", 8.0));
        StudentDTO student = new StudentDTO("Rodrigo", subjects);
        GradeDTO grade = new GradeDTO();
        grade.calculateAverage(student);
        assertEquals(String.format("Sua média foi de %.1f! Parabéns", 9.0), grade.getMessage());
    }

    @Test
    public void whitHonors_mustNotPass() {
        List<SubjectDTO> subjects = new ArrayList<>();
        subjects.add(new SubjectDTO("Matemática", 10.0));
        subjects.add(new SubjectDTO("Física", 9.0));
        subjects.add(new SubjectDTO("Química", 8.0));
        StudentDTO student = new StudentDTO("Rodrigo", subjects);
        GradeDTO grade = new GradeDTO();
        grade.calculateAverage(student);
        assertNotEquals(String.format("Sua média foi de %.1f! Parabéns", 10.0), grade.getMessage());
    }
}
