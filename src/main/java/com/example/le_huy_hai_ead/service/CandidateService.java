package com.example.le_huy_hai_ead.service;

import com.example.le_huy_hai_ead.entity.CandidateEntity;

import java.util.List;

public interface CandidateService {
    CandidateEntity createCandidate(CandidateEntity candidateEntity);
    List<CandidateEntity> getAllCandidate();
}
