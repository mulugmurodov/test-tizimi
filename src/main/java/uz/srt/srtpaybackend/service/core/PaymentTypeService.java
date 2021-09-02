package uz.srt.srtpaybackend.service.core;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.srt.srtpaybackend.dto.core.PaymentTypeCrudDto;
import uz.srt.srtpaybackend.enteties.core.PaymentType;
import uz.srt.srtpaybackend.mapper.core.PaymentTypeMapper;
import uz.srt.srtpaybackend.repositories.core.PaymentTypeRepository;
import uz.srt.srtpaybackend.service.GenericCrudService;
import org.springframework.data.domain.Sort;


import java.util.List;

@Service
@RequiredArgsConstructor
public class PaymentTypeService implements GenericCrudService<PaymentType, PaymentTypeCrudDto> {
    private final PaymentTypeRepository paymentTypeRepository;
    private final PaymentTypeMapper paymentTypeMapper;

    @Override
    public PaymentType get(Long id) {
        return paymentTypeRepository.getById(id);
    }

    @Override
    public PaymentType create(PaymentTypeCrudDto dto) {
        return paymentTypeRepository.save(paymentTypeMapper.toEntity(dto));
    }

    @Override
    public PaymentType update(Long id, PaymentTypeCrudDto dto) {
        return paymentTypeRepository.save(paymentTypeMapper.toEntity(dto));
    }

    @Override
    public void delete(Long id) {
        paymentTypeRepository.deleteById(id);
    }

    public List<PaymentType> getList() {
        return paymentTypeRepository.findAll();
    }
}
