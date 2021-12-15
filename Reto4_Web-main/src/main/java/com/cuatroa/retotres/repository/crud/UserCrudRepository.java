package com.cuatroa.retotres.repository.crud;

import com.cuatroa.retotres.model.User;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Fabian Mendoza
 */
public interface UserCrudRepository extends MongoRepository<User, Integer> {

    Optional<User> findByEmail(String email);

    Optional<User> findByEmailAndPassword(String email, String password);
    
    //Para seleccionar el usuario con el id maximo
    Optional<User> findTopByOrderByIdDesc();
}
