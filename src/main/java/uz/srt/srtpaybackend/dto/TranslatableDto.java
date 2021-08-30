package uz.srt.srtpaybackend.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TranslatableDto extends GenericDto {

    private String nameEn;
    private String nameRu;
    private String nameUz;
    private String nameOz;

}
