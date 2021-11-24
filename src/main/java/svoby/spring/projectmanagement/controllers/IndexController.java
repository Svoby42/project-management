package svoby.spring.projectmanagement.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import svoby.spring.projectmanagement.domain.Projekt;
import svoby.spring.projectmanagement.domain.Zamestnanec;
import svoby.spring.projectmanagement.repositories.ProjektRepository;
import svoby.spring.projectmanagement.repositories.ZamestnanecRepository;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    ProjektRepository projektRepository;

    @Autowired
    ZamestnanecRepository zamestnanecRepository;

    @GetMapping({"", "/", "/index"})
    public String zobrazitIndex(Model model){

        List<Projekt> projekty = projektRepository.findAll();
        List<Zamestnanec> zamestnanci = zamestnanecRepository.findAll();

        model.addAttribute("projektyList", projekty);
        model.addAttribute("zamestnanciList", zamestnanci);

        return "index";
    }

}
