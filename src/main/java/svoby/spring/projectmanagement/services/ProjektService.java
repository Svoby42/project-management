package svoby.spring.projectmanagement.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import svoby.spring.projectmanagement.domain.Projekt;
import svoby.spring.projectmanagement.dto.ProjektStav;
import svoby.spring.projectmanagement.repositories.ProjektRepository;

import java.util.List;

@Service
public class ProjektService {

    @Autowired
    ProjektRepository projektRepository;

    public Projekt save(Projekt projekt){
        return projektRepository.save(projekt);
    }

    public List<Projekt> getAll(){
        return projektRepository.findAll();
    }

    public List<ProjektStav> getProjektStav(){
        return projektRepository.getProjektStav();
    }

}
