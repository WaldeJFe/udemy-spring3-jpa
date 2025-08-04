package pessoalwjfe48.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import pessoalwjfe48.course.entities.OrderItem;
import pessoalwjfe48.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {	
}
