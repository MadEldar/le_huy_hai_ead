package com.example.le_huy_hai_ead.service;

import com.example.le_huy_hai_ead.dto.CandidateDto;
import com.example.le_huy_hai_ead.dto.MapperDTO;
import com.example.le_huy_hai_ead.entity.CandidateEntity;
import com.example.le_huy_hai_ead.repository.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateServiceImpl implements CandidateService {
    @Autowired
    CandidateRepository candidateRepository;

    @Autowired
    MapperDTO mapperDTO;

    @Override
    public CandidateEntity createCandidate(CandidateEntity candidateEntity) {
        return candidateRepository.save(candidateEntity);
    }

    @Override
    public List<CandidateEntity> getAllCandidate() {
        return candidateRepository.findAll();
    }
}
