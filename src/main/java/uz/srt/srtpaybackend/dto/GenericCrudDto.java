package uz.srt.srtpaybackend.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GenericCrudDto implements CrudDto {
    protected Boolean deleted;
}
