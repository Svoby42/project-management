package svoby.spring.projectmanagement.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import svoby.spring.projectmanagement.domain.Projekt;
import svoby.spring.projectmanagement.repositories.ProjektRepository;

@Controller
@RequestMapping("/projekty")
public class ProjektController {

    @Autowired
    ProjektRepository projektRepository;


    @GetMapping("/novy")
    public String zobrazitProjektFormular(Model model){

        Projekt projekt = new Projekt();
        model.addAttribute("projekt", projekt);

        return "projekty/novy-projekt";
    }

    @PostMapping("/ulozit")
    public String vytvoritProjekt(Projekt projekt, Model model){
        projektRepository.save(projekt);

        return "redirect:/projekty/novy";
    }

}