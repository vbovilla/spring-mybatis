package in.dminc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class StudentService {

    @Autowired
    StudentMapper studentMapper;

    public List<Student> getAllStudents() {
        return studentMapper.getAllStudents();
    }

    public Student getStudentById(int studentId) {
        return studentMapper.getStudentById(studentId);
    }

    public Map<String, List<StudentResult>> retrieveAllStudents() {
        List<StudentResult> students = studentMapper.retrieveAllStudents();

        Map<String, List<StudentResult>> studentsGroupedByGender = students.stream()
            .collect(Collectors.groupingBy(r -> r.getGender()));

//        System.out.println(studentsGroupedByGender);

        return studentsGroupedByGender;
    }
}
