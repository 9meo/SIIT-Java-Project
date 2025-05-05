import jakarta.persistence.*;

@Entity
public class User {
    @Id
    private int userId;

    private String username;
    private String email;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Profile profile;

    // TODO: Complete all Getter and Setter methods here
}
