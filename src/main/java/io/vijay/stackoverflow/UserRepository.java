package io.vijay.stackoverflow;

import com.sun.xml.bind.v2.model.core.ID;
import io.vijay.stackoverflow.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
    User findByEmail(String email);
}
