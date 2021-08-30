package uz.srt.srtpaybackend.enteties.auth;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

@Entity
@Table(name = "auth_permissions")
@NoArgsConstructor
@Data
public class Permission implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    protected Long id;

    @Column(name = "name")
    private String name;

    @Override
    public String getAuthority() {
        return getName();
    }
}
