package com.example.market_new.persistence.crud;

import com.example.market_new.persistence.entity.Compra;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CompraCrudRepository extends CrudRepository<Compra, Integer> {
    /*Query method*/
    Optional<List<Compra>> findByIdCliente(String idClient);
}
