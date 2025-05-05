import jakarta.persistence.*;

@Entity
public class Enrollment {
    @Id
    private int enrollmentId;

    __________
    @JoinColumn(name = "student_id")
    private Student student;

    __________
    @JoinColumn(name = "course_id")
    private Course course;

    // TODO: Complete all Getter and Setter methods here
}
