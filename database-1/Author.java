import jakarta.persistence.*;
import java.util.*;

@Entity
public class Author {
    @Id
    private int authorId;

    private String name;
    private String bio;

    @________(mappedBy = "author", cascade = CascadeType.ALL)
    private List<Book> books = new ArrayList<>();

    // TODO: Complete all Getter and Setter methods here
}