package svoby.spring.projectmanagement.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import svoby.spring.projectmanagement.repositories.ZamestnanecRepository;

@Service
public class ZamestnanecService {


    //@Autowired
    ZamestnanecRepository zamestnanecRepository;

    public ZamestnanecService(ZamestnanecRepository zamestnanecRepository){
        this.zamestnanecRepository = zamestnanecRepository;
    }

/*    @Autowired
    public void setZamestnanecRepository(ZamestnanecRepository zamestnanecRepository) {
        this.zamestnanecRepository = zamestnanecRepository;
    }*/
}
