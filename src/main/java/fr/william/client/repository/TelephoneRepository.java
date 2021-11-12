package fr.william.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.william.client.model.Telephone;

@Repository
public interface TelephoneRepository extends JpaRepository<Telephone, Integer>{

}
