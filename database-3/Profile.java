import jakarta.persistence.*;

@Entity
public class Profile {
    @Id
    private int profileId;

    private int age;
    private String gender;

    ___________
    @JoinColumn(name = "user_id")
    private User user;

    // TODO: Complete all Getter and Setter methods here
}
