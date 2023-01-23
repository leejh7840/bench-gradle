package com.nexient.benchgradle.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.nexient.benchgradle.entity.Alien;

@RepositoryRestResource(collectionResourceRel = "aliens", path = "aliens")
//Spring data REST
public interface AlienRepo extends JpaRepository<Alien, Integer> {
	
}
