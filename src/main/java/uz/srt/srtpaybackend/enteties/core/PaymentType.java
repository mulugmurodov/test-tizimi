package uz.srt.srtpaybackend.enteties.core;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "payment_type")
@Data
public class PaymentType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "code", unique = true, nullable = false, columnDefinition = "varchar2(10)")
    private String code;

    @Column(name = "name_uz_crl", unique = true, nullable = false, columnDefinition = "varchar2(255)")
    private String nameUzCrl;

    @Column(name = "name_uz_uz", unique = true, nullable = false, columnDefinition = "varchar2(255)")
    private String nameUzUz;

    @Column(name = "name_ru_ru", unique = true, nullable = false, columnDefinition = "varchar2(255)")
    private String nameRuRu;

}
