package uz.srt.srtpaybackend.repositories.core;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import uz.srt.srtpaybackend.enteties.core.PaymentType;

@Repository
public interface PaymentTypeRepository extends JpaRepository<PaymentType, Long> {
    @Query("select s from PaymentType s ")
    PaymentType getPaymentType();
}
