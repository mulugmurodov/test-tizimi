package uz.srt.srtpaybackend.enteties.core;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import uz.srt.srtpaybackend.dto.ContestDTO;
import uz.srt.srtpaybackend.enteties.auth.User;
import uz.srt.srtpaybackend.utils.LocalDateTimeConverter;

import javax.persistence.*;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Contest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private LocalDateTime startDate;
    private Long duration;
    private Boolean deleted = false;

    @CreatedDate
    @CreationTimestamp
    @Column(name = "created_at", nullable = false)
    @Convert(converter = LocalDateTimeConverter.class)
    private LocalDateTime createdAt;

    @LastModifiedDate
    @UpdateTimestamp
    @Column(name = "updated_at")
    @Convert(converter = LocalDateTimeConverter.class)
    private LocalDateTime updatedAt;

    public ContestDTO toDTO() {
        ContestDTO contest = new ContestDTO();
        contest.setId(this.id);
        contest.setName(this.name);
        contest.setDescription(this.description);
        contest.setCreatedAt(this.createdAt);
        contest.setUpdatedAt(this.updatedAt);
        contest.setDeleted(this.deleted);
        contest.setStartDate(this.startDate);
        contest.setDuration(this.duration);
        return contest;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Contest testTheme = (Contest) o;
        return id != null && Objects.equals(id, testTheme.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
