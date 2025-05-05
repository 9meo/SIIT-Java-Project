import jakarta.persistence.*;
import java.util.*;

@Entity
public class Student {
    @Id
    private int studentId;

    private String name;
    private String email;

    _____________(mappedBy = "student", cascade = CascadeType.ALL)
    private List<Enrollment> enrollments = new ArrayList<>();

    // TODO: Complete all Getter and Setter methods here
}
