package pessoalwjfe48.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import pessoalwjfe48.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {	
}
