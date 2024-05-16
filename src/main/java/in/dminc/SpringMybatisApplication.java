package in.dminc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

@SpringBootApplication
public class SpringMybatisApplication implements CommandLineRunner {

    Logger logger = LoggerFactory.getLogger(SpringMybatisApplication.class);

    @Autowired
    StudentService studentService;

    public static void main(String[] args) {
        SpringApplication.run(SpringMybatisApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<Student> allStudents = studentService.getAllStudents();
        Objects.requireNonNull(allStudents)
            .forEach(student -> logger.info(String.format("%s :: %s", student.getStudentId(), student.getStudentName())));

        logger.info("\n");

        Student student = studentService.getStudentById(2);
        if (null != student) {
            logger.info(String.format("%s : %s", student.getStudentId(), student.getStudentName()));
        }

        logger.info("\n");

        Map<String, List<StudentResult>> studentsGroupedByGender = studentService.retrieveAllStudents();
        studentsGroupedByGender.forEach((key, value) -> logger.info(String.format("%s : %s", key, value.stream().map(StudentResult::getStudentName).collect(Collectors.toSet()))));

        logger.info("\n");

        List<StudentResult> students = studentService.getStudentByName("John Doe");
        for (StudentResult studentResult : students) {
            logger.info(String.format("%s - %s", studentResult.getStudentId(), studentResult.getStudentName()));
        }
    }
}
