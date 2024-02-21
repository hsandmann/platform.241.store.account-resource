package insper.store.account;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<AccountModel, String> {

    Optional<AccountModel> findByEmailAndHash(String email, String hash);
    
}
