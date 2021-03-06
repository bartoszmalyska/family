package com.bartoszmalyska.family.db;

import com.bartoszmalyska.family.domain.Father;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@org.springframework.stereotype.Repository
public interface FathersRepository extends CrudRepository<Father, Long> {
    Father findByFamilyId(Long familyId);
    List<Father> findAllByFamilyId(Long familyId);
}