package svoby.spring.projectmanagement.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import svoby.spring.projectmanagement.domain.Zamestnanec;
import svoby.spring.projectmanagement.repositories.ZamestnanecRepository;
import svoby.spring.projectmanagement.services.ZamestnanecService;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/zamestnanci")
public class ZamestnanecController {

    @Autowired
    ZamestnanecService zamestnanecService;

    @GetMapping({"","/"})
    public String zobrazitSeznamZamestnancu(Model model){
        Iterable<Zamestnanec> zamestnanciList = zamestnanecService.getAll();
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
    public String vytvoritZamestnance(@Valid Zamestnanec zamestnanec, Model model, Errors errors){

        if(errors.hasErrors()){
            return "zamestnanci/novy-zamestnanec";
        }
        zamestnanecService.save(zamestnanec);
        return "redirect:/zamestnanci";
    }

    @GetMapping("/zmenit")
    public String zmenitDataZamestnance(@RequestParam("id") Long id, Model model){
        Zamestnanec zamestnanec = zamestnanecService.findByZamestnanecId(id);
        model.addAttribute("zamestnanec", zamestnanec);

        return "zamestnanci/novy-zamestnanec";
    }

    @GetMapping("/smazat")
    public String smazatZamestnance(@RequestParam("id") Long id, Model model){
        Zamestnanec zamestnanec = zamestnanecService.findByZamestnanecId(id);
        zamestnanecService.delete(zamestnanec);

        return "redirect/zamestnanci";
    }

}
