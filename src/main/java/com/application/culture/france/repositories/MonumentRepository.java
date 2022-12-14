package com.application.culture.france.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.application.culture.france.models.Monument;

public interface MonumentRepository extends JpaRepository<Monument, Integer>{

	boolean existsByCode(String code);

	Monument findByCode(String code);

	void removeByCode(String code);

	
}
