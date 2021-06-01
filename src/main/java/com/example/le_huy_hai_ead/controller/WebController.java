package com.example.le_huy_hai_ead.controller;

import com.example.le_huy_hai_ead.dto.CandidateDto;
import com.example.le_huy_hai_ead.dto.MapperDTO;
import com.example.le_huy_hai_ead.entity.CandidateEntity;
import com.example.le_huy_hai_ead.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.view.RedirectView;

import javax.validation.Valid;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class WebController {
    @Autowired
    CandidateService candidateService;

    @Autowired
    MapperDTO mapperDTO;

    @GetMapping("/")
    public String index(Model model) {
        List<CandidateEntity> candidateEntities = candidateService.getAllCandidate();
        if (candidateEntities.isEmpty()) {
            candidateService.createCandidate(new CandidateEntity("Le Huy Hai", "8 Ton That Thuyet", "0931512315", new Date(98, Calendar.JANUARY, 6), "Software Engineer", ".NET Core"));
            candidateService.createCandidate(new CandidateEntity("Nguyen Thi Ninh", "9 Ton That Thuyet", "0937823153", new Date(100, Calendar.APRIL, 20), "Software Engineer", "Java"));
            candidateEntities = candidateService.getAllCandidate();
        }

        model.addAttribute("candidates", candidateEntities.stream().map(candidate -> mapperDTO.convertToCandidateDTO(candidate)).collect(Collectors.toList()));

        return "index";
    }

    @GetMapping("/create")
    public String create() {
        return "create";
    }

    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public RedirectView createCandidate(@Valid CandidateDto candidateDto) {
        CandidateEntity candidateEntity = mapperDTO.convertToCandidateEntity(candidateDto);
        candidateService.createCandidate(candidateEntity);
        return new RedirectView("/");
    }
}
