package svoby.spring.projectmanagement.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import svoby.spring.projectmanagement.domain.Projekt;
import svoby.spring.projectmanagement.repositories.ProjektRepository;

import javax.validation.Valid;

@RestController
@RequestMapping("/app-api/projekty")
public class ProjektApiController {

    @Autowired
    ProjektRepository projektRepository;

    @GetMapping
    public Iterable<Projekt> getProjekt(){
        return projektRepository.findAll();
    }

    @GetMapping("/{id}")
    public Projekt getProjektById(@PathVariable("id") Long id){
        return projektRepository.findById(id).get();
    }

    @PostMapping(consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Projekt create(@RequestBody @Valid Projekt projekt){
        return projektRepository.save(projekt);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public Projekt update(@RequestBody Projekt projekt){
        return projektRepository.save(projekt);
    }

    @PatchMapping(path = "/{id}", consumes = "application/json")
    public Projekt partialUpdate(@PathVariable("id") Long id, @RequestBody Projekt projektPatch){
        Projekt projekt = projektRepository.findById(id).get();

        if(projekt.getPopis() != null){
            projekt.setPopis(projektPatch.getPopis());
        }
        if(projekt.getNazev() != null){
            projekt.setNazev(projektPatch.getNazev());
        }
        if(projekt.getStav() != null){
            projekt.setStav(projektPatch.getStav());
        }

        return projektRepository.save(projekt);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") Long id){
        try{
            projektRepository.deleteById(id);
        } catch (EmptyResultDataAccessException e){

        }
    }


}
