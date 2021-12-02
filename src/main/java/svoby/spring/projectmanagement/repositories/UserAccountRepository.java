package svoby.spring.projectmanagement.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import svoby.spring.projectmanagement.domain.UserAccount;

public interface UserAccountRepository extends PagingAndSortingRepository<UserAccount, Long> {
}
