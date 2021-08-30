
package uz.srt.srtpaybackend.controller.core;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import uz.srt.srtpaybackend.dto.core.PaymentTypeCrudDto;
import uz.srt.srtpaybackend.mapper.core.PaymentTypeMapper;

import javax.transaction.Transactional;

import static uz.srt.srtpaybackend.constant.ApiConstant.API_PATH;
import static uz.srt.srtpaybackend.constant.ApiConstant.V_1;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = {API_PATH + V_1 + "/core"}, produces = "application/json")
public class PaymentTypeController {

    private final PaymentTypeMapper paymentTypeMapper;
//    private final PaymentTypeService paymentTypeService;

    @Transactional
    @RequestMapping(value = "/payment-type", method = RequestMethod.POST)
    public ResponseEntity<PaymentTypeCrudDto> create(@RequestBody PaymentTypeCrudDto dto) {
        return null;
//        return new ResponseEntity<>(paymentTypeMapper.toDto(paymentTypeService.create(dto)), HttpStatus.CREATED);
    }

//    @RequestMapping(value = "/payment-type/{id}", method = {RequestMethod.PUT, RequestMethod.PATCH})
//    public ResponseEntity<CheckListDto> edit(@PathVariable("id") Long id, @RequestBody CheckListCrudDto dto) {
//        return ResponseEntity.ok(mapper.toDto(service.update(id, dto)));
//    }

//    @RequestMapping(value = "/payment-type/{id}", method = RequestMethod.DELETE)
//    public ResponseEntity<Boolean> delete(@PathVariable(value = "id") Long id) {
//        service.delete(id);
//        return ResponseEntity.ok(true);
//    }
//
//    @RequestMapping(value = "/payment-type/{id}", method = RequestMethod.GET)
//    public ResponseEntity<CheckListDto> get(@PathVariable(value = "id") Long id) {
//        return ResponseEntity.ok(mapper.toDto(service.get(id)));
//    }

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
