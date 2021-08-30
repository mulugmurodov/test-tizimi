package uz.srt.srtpaybackend.enteties.auth;

import lombok.Data;
import lombok.NoArgsConstructor;
import uz.srt.srtpaybackend.enteties.auth.Permission;

import javax.persistence.*;
import java.util.Set;


@Entity
@Data
@NoArgsConstructor
@Table(name = "auth_roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    @JoinTable(name = "auth_roles_permissions", joinColumns = {@JoinColumn(name = "role_id", referencedColumnName = "id")}
            , inverseJoinColumns = {@JoinColumn(name = "permission_id", referencedColumnName = "id")})
    private Set<Permission> permissions;
}
