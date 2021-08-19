package br.com.silber.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.silber.model.Cambio;

public interface CambioRepository extends JpaRepository<Cambio, Long>{
	
	Cambio findByFromAndTo(String from, String to);

}
