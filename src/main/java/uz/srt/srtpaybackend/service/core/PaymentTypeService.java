package uz.srt.srtpaybackend.service.core;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.srt.srtpaybackend.dto.core.PaymentTypeCrudDto;
import uz.srt.srtpaybackend.enteties.core.PaymentType;
import uz.srt.srtpaybackend.repositories.core.PaymentTypeRepository;
import uz.srt.srtpaybackend.service.GenericCrudService;

@Service
@RequiredArgsConstructor
public class PaymentTypeService implements GenericCrudService<PaymentType, PaymentTypeCrudDto> {
    private final PaymentTypeRepository paymentTypeRepository;
//    private final PaymentTypeMapper mapper;

    @Override
    public PaymentType get(Long id) {

        return null;
    }

    @Override
    public PaymentType create(PaymentTypeCrudDto dto) {
        return null;
    }

    @Override
    public PaymentType update(Long id, PaymentTypeCrudDto dto) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
