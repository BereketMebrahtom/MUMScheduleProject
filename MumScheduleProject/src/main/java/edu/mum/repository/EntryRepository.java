package edu.mum.repository;

import org.springframework.data.repository.CrudRepository;

import edu.mum.domain.Entry;

public interface EntryRepository extends CrudRepository<Entry, Long>{}