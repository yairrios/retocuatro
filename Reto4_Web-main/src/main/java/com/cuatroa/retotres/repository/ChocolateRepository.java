package com.cuatroa.retotres.repository;

import com.cuatroa.retotres.model.Chocolate;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.cuatroa.retotres.repository.crud.ChocolateCrudRepository;

/**
 *
 * @author Fabian Mendoza
 */
@Repository
public class ChocolateRepository {
    @Autowired
    private ChocolateCrudRepository chocolateCrudRepository;

    public List<Chocolate> getAll() {
        return chocolateCrudRepository.findAll();
    }

    public Optional<Chocolate> getChocolate(String reference) {
        return chocolateCrudRepository.findById(reference);
    }
    
    public Chocolate create(Chocolate chocolate) {
        return chocolateCrudRepository.save(chocolate);
    }

    public void update(Chocolate chocolate) {
        chocolateCrudRepository.save(chocolate);
    }
    
    public void delete(Chocolate chocolate) {
        chocolateCrudRepository.delete(chocolate);
    }
}
