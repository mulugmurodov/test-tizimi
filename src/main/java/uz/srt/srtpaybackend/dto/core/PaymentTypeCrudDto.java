package uz.srt.srtpaybackend.dto.core;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PaymentTypeCrudDto {

    private Long id;

    private String code;

    private String nameUzCrl;

    private String nameUzUz;

    private String nameRuRu;
}
