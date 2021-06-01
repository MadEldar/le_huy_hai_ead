package com.example.le_huy_hai_ead.dto;

import com.example.le_huy_hai_ead.entity.CandidateEntity;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface MapperDTO {
    CandidateEntity convertToCandidateEntity(CandidateDto candidateDto);

    CandidateDto convertToCandidateDTO(CandidateEntity candidateEntity);
}
