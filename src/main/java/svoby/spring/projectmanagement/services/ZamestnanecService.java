package svoby.spring.projectmanagement.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import svoby.spring.projectmanagement.domain.Zamestnanec;
import svoby.spring.projectmanagement.dto.ZamestnanecProjekt;
import svoby.spring.projectmanagement.repositories.ZamestnanecRepository;

import java.util.List;

@Service
public class ZamestnanecService {

    @Autowired
    ZamestnanecRepository zamestnanecRepository;

    public Zamestnanec save(Zamestnanec zamestnanec){
        return zamestnanecRepository.save(zamestnanec);
    }

    public Iterable<Zamestnanec> getAll(){
        return zamestnanecRepository.findAll();
    }

    public List<ZamestnanecProjekt> zamestnanecProjekty(){
        return zamestnanecRepository.zamestnanecProjekty();
    }

    public Zamestnanec findByZamestnanecId(Long id){
        return zamestnanecRepository.findByZamestnanecId(id);
    }

    public void delete(Zamestnanec zamestnanec){
        zamestnanecRepository.delete(zamestnanec);
    }


}
