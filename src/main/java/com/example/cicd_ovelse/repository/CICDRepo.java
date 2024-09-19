package com.example.cicd_ovelse.repository;

import com.example.cicd_ovelse.model.CICDModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CICDRepo extends JpaRepository<CICDModel, Long> {

}
