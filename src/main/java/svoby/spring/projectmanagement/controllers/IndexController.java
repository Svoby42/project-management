package svoby.spring.projectmanagement.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import svoby.spring.projectmanagement.domain.Projekt;
import svoby.spring.projectmanagement.domain.Zamestnanec;
import svoby.spring.projectmanagement.dto.ProjektStav;
import svoby.spring.projectmanagement.dto.ZamestnanecProjekt;
import svoby.spring.projectmanagement.repositories.ProjektRepository;
import svoby.spring.projectmanagement.repositories.ZamestnanecRepository;

import java.util.*;

@Controller
public class IndexController {

    @Value("${version}")
    private String verze;

    @Autowired
    ProjektRepository projektRepository;

    @Autowired
    ZamestnanecRepository zamestnanecRepository;

    @GetMapping({"", "/", "/index"})
    public String zobrazitIndex(Model model) throws JsonProcessingException {

        model.addAttribute("verzeCislo", verze);

        Map<String, Object> map = new HashMap<>();
        List<Projekt> projekty = projektRepository.findAll();
        List<ZamestnanecProjekt> zamestnanciProjektyPocet = zamestnanecRepository.zamestnanciProjekty();

        List<ProjektStav> projektData = projektRepository.getProjektStav();
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = objectMapper.writeValueAsString(projektData);                               //Převod do JSONu


        model.addAttribute("projektStatusPocet", jsonString);

        model.addAttribute("projektyList", projekty);
        model.addAttribute("zamestnanciListProjektyPocet", zamestnanciProjektyPocet);

        return "index";
    }

}
