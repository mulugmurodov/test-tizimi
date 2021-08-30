package uz.srt.srtpaybackend.mapper.core;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.springframework.stereotype.Component;
import uz.srt.srtpaybackend.dto.core.PaymentTypeCrudDto;
import uz.srt.srtpaybackend.enteties.core.PaymentType;
import uz.srt.srtpaybackend.mapper.EntityMapper;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
@Component
public interface PaymentTypeMapper extends EntityMapper<PaymentTypeCrudDto, PaymentType> {

}
