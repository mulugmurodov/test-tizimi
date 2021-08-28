package uz.srt.srtpaybackend.enteties;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "my_user")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(unique = true, nullable = false)
    private String password;
}
