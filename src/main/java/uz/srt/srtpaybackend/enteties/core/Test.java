package uz.srt.srtpaybackend.enteties.core;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;
import uz.srt.srtpaybackend.enteties.auth.User;

import javax.persistence.*;
import java.time.Instant;
import java.util.Objects;

@Entity
@Table
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    private TestTheme testTheme;

    private String name;
    private String questionText;
    private String description;

    @ManyToOne(optional = false)
    private User createdUser;

    @ManyToOne
    private User updatedUser;

    private Instant createdDate;

    private Instant updatedDate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Test testTheme = (Test) o;
        return id != null && Objects.equals(id, testTheme.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
