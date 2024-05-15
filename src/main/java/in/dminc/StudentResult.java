package in.dminc;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class StudentResult {
    private int studentId;
    private String studentName;
    private Date dateOfBirth;
    private Date dateOfJoining;
    private String gender;
}
