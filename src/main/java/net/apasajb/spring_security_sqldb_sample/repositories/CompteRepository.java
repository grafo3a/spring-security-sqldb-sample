package net.apasajb.spring_security_sqldb_sample.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import net.apasajb.spring_security_sqldb_sample.entities.Compte;


public interface CompteRepository extends JpaRepository<Compte, Long> {
	
	Optional<Compte> findByUsername(String username);
}
