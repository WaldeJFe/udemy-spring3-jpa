package pessoalwjfe48.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import pessoalwjfe48.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {	
}
