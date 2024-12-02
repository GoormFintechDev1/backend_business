package com.example.backend_business.service;

import com.example.backend_business.model.BusinessRegistration;
import com.example.backend_business.repository.BusinessRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BusinessService {

    private final BusinessRepository businessRepository;

    public Optional<BusinessRegistration> findByBrNum(String brNum) {
        return businessRepository.findByBrNum(brNum);
    }
}
