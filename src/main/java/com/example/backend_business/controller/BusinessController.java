package com.example.backend_business.controller;

import com.example.backend_business.model.BusinessRegistration;
import com.example.backend_business.service.BusinessService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/business")
@RequiredArgsConstructor
public class BusinessController {

    private final BusinessService businessService;

    @GetMapping("/{brNum}")
    public ResponseEntity<BusinessRegistration> getBusinessDetails(@PathVariable String brNum) {
        BusinessRegistration business = businessService.findByBrNum(brNum)
                .orElseThrow(() -> new RuntimeException("해당 사업자 등록 번호는 존재하지 않습니다."));
        return ResponseEntity.ok(business);
    }
}


