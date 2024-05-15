package in.dminc;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Mapper
@Component
public interface StudentMapper {
    List<Student> getAllStudents();

    Student getStudentById(int studentId);

    List<StudentResult> retrieveAllStudents();
}
