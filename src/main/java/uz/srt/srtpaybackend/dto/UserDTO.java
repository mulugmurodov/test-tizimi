package uz.srt.srtpaybackend.dto;

import lombok.Data;
import uz.srt.srtpaybackend.enteties.auth.User;
import uz.srt.srtpaybackend.enteties.core.District;
import uz.srt.srtpaybackend.enteties.core.Region;

import java.time.LocalDateTime;

@Data
public class UserDTO {
    private Long id;
    private String username;
    private String password;
    private String encodedPassword;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Boolean deleted;
    private String firstName;
    private String lastName;
    private String middleName;
    private Long regionId;
    private Long districtId;

    public User toEntity() {
        User user = new User();
        user.setId(this.id);
        user.setUsername(this.username);
        user.setPassword(this.encodedPassword);
        user.setCreatedAt(this.createdAt);
        user.setUpdatedAt(this.updatedAt);
        user.setDeleted(this.deleted);
        user.setFirstName(this.firstName);
        user.setLastName(this.lastName);
        user.setMiddleName(this.middleName);
        user.setRegion(new Region().id(this.regionId));
        user.setDistrict(new District().id(this.districtId));
        return new User();
    }
}
