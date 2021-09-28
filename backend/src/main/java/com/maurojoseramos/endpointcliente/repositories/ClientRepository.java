package com.maurojoseramos.endpointcliente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maurojoseramos.endpointcliente.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
