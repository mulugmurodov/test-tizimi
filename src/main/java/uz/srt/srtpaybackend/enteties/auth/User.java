package uz.srt.srtpaybackend.enteties.auth;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import uz.srt.srtpaybackend.utils.LocalDateTimeConverter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "auth_user", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"user_name"})
})
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    @Column(name = "user_name", unique = true, nullable = false, columnDefinition = "varchar2(255)")
    private String username;

    @Column(unique = true, nullable = false, columnDefinition = "varchar2(255)")
    private String password;

    @CreatedDate
    @CreationTimestamp
    @Column(name = "created_at", columnDefinition = "DATE default SYSDATE", nullable = false)
    @Convert(converter = LocalDateTimeConverter.class)
    private LocalDateTime createdAt;

    @LastModifiedDate
    @UpdateTimestamp
    @Column(name = "updated_at", columnDefinition = "DATE")
    @Convert(converter = LocalDateTimeConverter.class)
    private LocalDateTime updatedAt;

    @Column(name = "is_deleted", columnDefinition = "NUMBER default 0")
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private Boolean deleted = false;
}
