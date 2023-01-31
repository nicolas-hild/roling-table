package com.sdevelopment.rolingtable.repositories;

import com.sdevelopment.rolingtable.components.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource()
public interface UserRepository
        extends JpaRepository<User, Integer>, JpaSpecificationExecutor<User> {}
