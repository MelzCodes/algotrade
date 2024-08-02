package com.algotrade.api.repository;

import com.algotrade.api.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PersonRepository extends JpaRepository<Person, Long> {
}
