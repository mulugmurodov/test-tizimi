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
public class District {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne(optional = false)
    private Region region;

    @ManyToOne
    private User createdUser;

    @ManyToOne
    private User updatedUser;

    private Instant createdDate;

    private Instant updatedDate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        District testTheme = (District) o;
        return id != null && Objects.equals(id, testTheme.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
