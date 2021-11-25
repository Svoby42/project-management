package svoby.spring.projectmanagement.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import svoby.spring.projectmanagement.domain.Projekt;
import svoby.spring.projectmanagement.domain.Zamestnanec;
import svoby.spring.projectmanagement.repositories.ProjektRepository;
import svoby.spring.projectmanagement.repositories.ZamestnanecRepository;

import java.util.List;

@Controller
@RequestMapping("/projekty")
public class ProjektController {

    @Autowired
    ProjektRepository projektRepository;

    @Autowired
    ZamestnanecRepository zamestnanecRepository;

    @GetMapping({"","/"})
    public String zobrazitSeznamProjektu(Model model){
        List<Projekt> projektList = projektRepository.findAll();
        model.addAttribute("seznam", projektList);

        return "projekty/projekty-seznam";
    }

    @GetMapping("/novy")
    public String zobrazitProjektFormular(Model model){

        Projekt projekt = new Projekt();
        List<Zamestnanec> zamestnanci = zamestnanecRepository.findAll();
        model.addAttribute("projekt", projekt);
        model.addAttribute("zamestnanciList", zamestnanci);

        return "projekty/novy-projekt";
    }

    @PostMapping("/ulozit")
    public String vytvoritProjekt(Projekt projekt, @RequestParam List<Long> zamestnanci, Model model){

        projektRepository.save(projekt);
        Iterable<Zamestnanec> vybraniZamestnanci = zamestnanecRepository.findAllById(zamestnanci);
        vybraniZamestnanci.forEach(zamestnanec -> { zamestnanec.setProjekt(projekt); zamestnanecRepository.save(zamestnanec); });

        return "redirect:/projekty";
    }


}