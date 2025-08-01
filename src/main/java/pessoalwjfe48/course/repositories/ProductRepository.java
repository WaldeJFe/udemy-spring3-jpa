package pessoalwjfe48.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import pessoalwjfe48.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {	
}
