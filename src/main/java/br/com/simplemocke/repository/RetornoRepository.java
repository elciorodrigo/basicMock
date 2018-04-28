package br.com.simplemocke.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.simplemocke.entity.RetornoEntity;

@Repository
public interface RetornoRepository extends JpaRepository<RetornoEntity, Long> {

	@Query("select r from RetornoEntity r where r.protocolo = ?1 ")
	List<RetornoEntity> findByProtocolo(String protocolo);
}
