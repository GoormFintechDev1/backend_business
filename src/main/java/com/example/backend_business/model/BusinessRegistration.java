package com.example.backend_business.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "business_registration")
public class BusinessRegistration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "business_registration_id")
    private Long businessRegistrationId;

    // 회원 식별 번호
    @Column(name = "member_id", nullable = true)
    private String member;

    // 업태
    @Column(name = "business_type", nullable = false)
    private String businessType ;

    // 종목
    @Column(name = "business_item", nullable = false)
    private String businessItem;

    // 사업자등록번호 -> String으로 받기 v
    @Column(name = "br_num", nullable = false, unique = true)
    private String brNum;

    // 사업장 주소
    @Column(name = "address", nullable = true, length = 255)
    private String address;

    // 사업 시작일
    @Column(name = "business_start_date")
    private LocalDate businessStartDate;

    // 대표자명
    @Column(name = "representative_name")
    private String representativeName;

    // 상호
    @Column(name = "company_name")
    private String companyName;

    // 포스 식별 번호
    @Column(name = "pos_id", nullable = true)
    private String posId;

    // 계좌 식별 번호
    @Column(name = "account_id", nullable = true)
    private String accountId;


}
