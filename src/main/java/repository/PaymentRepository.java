package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import entites.Payment;
import entites.PaymentStatus;
import entites.PaymentType;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

	List<Payment> findByStudentCode(String code);

	List<Payment> finfindByStatus(PaymentStatus status);

	List<Payment> finfindByType(PaymentType type);

}
