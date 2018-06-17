package edu.mum.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.mum.domain.UserProfile;

@Repository
public interface UserRepository extends CrudRepository<UserProfile, Long> {}