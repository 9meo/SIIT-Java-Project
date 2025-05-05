import jakarta.persistence.*;

@Entity
public class Book {
    @Id
    private int bookId;

    private String title;
    private int publishYear;

    ____________
    @JoinColumn(name = "author_id")
    private Author author;

    // TODO: Complete all Getter and Setter methods here
}
