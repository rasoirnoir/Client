package fr.william.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.william.client.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
