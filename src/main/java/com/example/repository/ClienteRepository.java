package com.example.repository;

import com.example.domain.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by robson.machado on 19/04/2017.
 */
@Repository
public interface ClienteRepository extends CrudRepository<Cliente, String>{

}
