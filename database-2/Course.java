import jakarta.persistence.*;
import java.util.*;

@Entity
public class Course {
    @Id
    private int courseId;

    private String courseName;
    private int credits;

    _____________(mappedBy = "course", cascade = CascadeType.ALL)
    private List<Enrollment> enrollments = new ArrayList<>();

    // TODO: Complete all Getter and Setter methods here
}
