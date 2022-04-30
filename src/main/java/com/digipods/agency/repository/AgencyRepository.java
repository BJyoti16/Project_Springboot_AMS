package com.digipods.agency.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.digipods.agency.domain.Agency;

public interface AgencyRepository extends JpaRepository<Agency,Long>{

}
