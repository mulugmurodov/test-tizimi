package uz.srt.srtpaybackend.enteties.auth;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import uz.srt.srtpaybackend.dto.UserDTO;
import uz.srt.srtpaybackend.enteties.core.District;
import uz.srt.srtpaybackend.enteties.core.Region;
import uz.srt.srtpaybackend.utils.LocalDateTimeConverter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "auth_user")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    @Column(name = "user_name", unique = true, nullable = false)
    private String username;

    @Column(unique = true, nullable = false)
    private String password;

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

    @Column(name = "is_deleted")
    private Boolean deleted = false;

    private String firstName;

    private String lastName;

    private String middleName;
    private String phoneNumber;

    @OneToOne
    @JoinColumn(name = "region_id")
    private Region region;

    @OneToOne
    @JoinColumn(name = "district_id")
    private District district;

    public UserDTO toDTO(){
        UserDTO dto = new UserDTO();
        dto.setId(this.id);
        dto.setId(this.id);
        dto.setUsername(this.username);
        dto.setCreatedAt(this.createdAt);
        dto.setUpdatedAt(this.updatedAt);
        dto.setDeleted(this.deleted);
        dto.setFirstName(this.firstName);
        dto.setLastName(this.lastName);
        dto.setMiddleName(this.middleName);
        dto.setPhoneNumber(this.phoneNumber);
        dto.setRegionId(Objects.nonNull(this.region) ? this.region.getId() : null);
        dto.setDistrictId(Objects.nonNull(this.district) ? this.district.getId() : null);
        dto.setRegionName(Objects.nonNull(this.region) ? this.region.getName() : null);
        dto.setDistrictName(Objects.nonNull(this.district) ? this.district.getName() : null);
        return dto;
    }
}
