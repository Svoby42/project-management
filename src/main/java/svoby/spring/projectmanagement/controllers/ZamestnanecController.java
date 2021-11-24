package svoby.spring.projectmanagement.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import svoby.spring.projectmanagement.domain.Zamestnanec;
import svoby.spring.projectmanagement.repositories.ZamestnanecRepository;

import java.util.List;

@Controller
@RequestMapping("/zamestnanci")
public class ZamestnanecController {

    @Autowired
    ZamestnanecRepository zamestnanecRepository;

    @GetMapping({"","/"})
    public String zobrazitSeznamZamestnancu(Model model){
        List<Zamestnanec> zamestnanciList = zamestnanecRepository.findAll();
        model.addAttribute("seznam", zamestnanciList);

        return "zamestnanci/zamestnanci-seznam";
    }

    @GetMapping("/novy")
    public String zobrazitZamestnanecFormular(Model model){
        Zamestnanec zamestnanec = new Zamestnanec();
        model.addAttribute("zamestnanec", zamestnanec);
        return "zamestnanci/novy-zamestnanec";
    }

    @PostMapping("/ulozit")
    public String vytvoritZamestnance(Zamestnanec zamestnanec, Model model){
        zamestnanecRepository.save(zamestnanec);
        return "redirect:/zamestnanci";
    }

}
