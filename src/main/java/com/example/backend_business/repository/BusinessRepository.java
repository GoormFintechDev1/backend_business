package com.example.backend_business.repository;

import com.example.backend_business.model.BusinessRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BusinessRepository extends JpaRepository<BusinessRegistration, Long> {
    Optional<BusinessRegistration> findByBrNum(String brNum);
}
