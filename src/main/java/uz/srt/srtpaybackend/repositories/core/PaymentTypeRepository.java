package uz.srt.srtpaybackend.repositories.core;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import uz.srt.srtpaybackend.enteties.core.PaymentType;

import javax.persistence.LockModeType;
import java.util.List;

@Repository
public interface PaymentTypeRepository extends JpaRepository<PaymentType, Long> {
    @Lock(LockModeType.READ)
    @Query(" select s from PaymentType s ")
    PaymentType getPaymentType();

//    @Query(value = "CALL FIND_CARS_AFTER_YEAR(:year_in);", nativeQuery = true)
//    List<PaymentType> findCarsAfterYear(@Param("year_in") Integer year_in);
}
