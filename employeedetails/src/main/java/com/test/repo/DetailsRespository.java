package com.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.entity.DetailsEntity;

public interface DetailsRespository extends JpaRepository<DetailsEntity, Long> {

}
