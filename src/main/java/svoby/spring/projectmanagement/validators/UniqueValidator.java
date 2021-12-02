package svoby.spring.projectmanagement.validators;

import org.springframework.beans.factory.annotation.Autowired;
import svoby.spring.projectmanagement.domain.Zamestnanec;
import svoby.spring.projectmanagement.repositories.ZamestnanecRepository;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UniqueValidator implements ConstraintValidator<UniqueValue, String> {

    @Autowired
    ZamestnanecRepository zamestnanecRepository;

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        Zamestnanec zamestnanec = zamestnanecRepository.findByEmail(value);

        if(zamestnanec != null){
            return false;
        }
        else{
            return true;
        }
    }
}
