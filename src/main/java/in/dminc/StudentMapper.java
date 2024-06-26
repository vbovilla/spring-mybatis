package in.dminc;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface StudentMapper {
    List<Student> getAllStudents();

    Student getStudentById(int studentId);

    List<StudentResult> retrieveAllStudents();

    List<StudentResult> getStudentByName(String studentName);
}
