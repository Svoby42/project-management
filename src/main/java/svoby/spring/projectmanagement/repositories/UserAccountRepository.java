package svoby.spring.projectmanagement.repositories;

import org.springframework.data.repository.CrudRepository;
import svoby.spring.projectmanagement.domain.UserAccount;

public interface UserAccountRepository extends CrudRepository<UserAccount, Long> {
}
