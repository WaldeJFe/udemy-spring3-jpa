package pessoalwjfe48.course.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pessoalwjfe48.course.entities.Order;
import pessoalwjfe48.course.repositories.OrderRepository;

@Service
public class OrderService {
 
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll() {
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		
		Optional<Order> obj = repository.findById(id);
		return obj.get();		
	}
}
