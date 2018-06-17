package edu.mum.repository;

import org.springframework.data.repository.CrudRepository;

import edu.mum.domain.Block;

public interface BlockRepository extends CrudRepository<Block, Long> {}