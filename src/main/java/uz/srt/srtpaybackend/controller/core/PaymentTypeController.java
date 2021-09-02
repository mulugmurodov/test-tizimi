
package uz.srt.srtpaybackend.controller.core;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.srt.srtpaybackend.dto.core.PaymentTypeCrudDto;
import uz.srt.srtpaybackend.enteties.core.PaymentType;
import uz.srt.srtpaybackend.mapper.core.PaymentTypeMapper;
import uz.srt.srtpaybackend.service.core.PaymentTypeService;

import javax.transaction.Transactional;
import java.util.List;

import static uz.srt.srtpaybackend.constant.ApiConstant.API_PATH;
import static uz.srt.srtpaybackend.constant.ApiConstant.V_1;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = {API_PATH + V_1 + "/core"}, produces = "application/json")
public class PaymentTypeController {

    private final PaymentTypeMapper paymentTypeMapper;
    private final PaymentTypeService paymentTypeService;

    @Transactional
    @RequestMapping(value = "/payment-types", method = RequestMethod.POST)
    public ResponseEntity<PaymentTypeCrudDto> create(@RequestBody PaymentTypeCrudDto dto) {
        return new ResponseEntity<>(paymentTypeMapper.toDto(paymentTypeService.create(dto)), HttpStatus.CREATED);
    }

    @RequestMapping(value = "/payment-type/{id}", method = {RequestMethod.PUT, RequestMethod.PATCH})
    public ResponseEntity<PaymentTypeCrudDto> edit(@PathVariable("id") Long id, @RequestBody PaymentTypeCrudDto dto) {
        return ResponseEntity.ok(paymentTypeMapper.toDto(paymentTypeService.update(id, dto)));
    }

    @RequestMapping(value = "/payment-type/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Boolean> delete(@PathVariable(value = "id") Long id) {
        paymentTypeService.delete(id);
        return ResponseEntity.ok(true);
    }

    @RequestMapping(value = "/payment-type/{id}", method = RequestMethod.GET)
    public ResponseEntity<PaymentTypeCrudDto> get(@PathVariable(value = "id") Long id) {
        return ResponseEntity.ok(paymentTypeMapper.toDto(paymentTypeService.get(id)));
    }

    @RequestMapping(value = "/payment-types", method = RequestMethod.GET)
    public ResponseEntity<List<PaymentType>> getPaymentTypeList() {
        return ResponseEntity.ok(paymentTypeService.getList());
    }

//    @Transactional
//    @PostMapping("/payment-type")
//    public ResponseEntity<?> create(@RequestBody Map<String, Object> map) {
//        return CustomResponse.getResponseEntity(checkListService.createData(map));
//    }

//    @RequestMapping(value = "/payment-type-by-employment", method = RequestMethod.GET)
//    public ResponseEntity<?> getByEmploymentId(@RequestParam Map<String, Object> map) {
//        return CustomResponse.getResponseEntity(checkListService.checkListByEmploymentId(map));
//    }

}
