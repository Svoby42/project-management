package svoby.spring.projectmanagement.api;

import jdk.jfr.ContentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import svoby.spring.projectmanagement.domain.Zamestnanec;
import svoby.spring.projectmanagement.repositories.ZamestnanecRepository;

import javax.validation.Valid;


@RestController
@RequestMapping("/app-api/zamestnanci")
public class ZamestnanecApiController {

    @Autowired
    ZamestnanecRepository zamestnanecRepository;

    @GetMapping
    public Iterable<Zamestnanec> getZamestnanec(){
        return zamestnanecRepository.findAll();
    }

    @GetMapping("/{id}")
    public Zamestnanec getZamestnanecById(@PathVariable("id") Long id){
        return zamestnanecRepository.findById(id).get();
    }

    @PostMapping(consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Zamestnanec vytvorit(@RequestBody @Valid Zamestnanec zamestnanec){
        return zamestnanecRepository.save(zamestnanec);
    }

}
