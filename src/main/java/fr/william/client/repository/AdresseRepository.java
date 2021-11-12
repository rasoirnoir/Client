package fr.william.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.william.client.model.Adresse;

@Repository
public interface AdresseRepository extends JpaRepository<Adresse, Integer>{

}
