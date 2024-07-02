package dio.domain.repository;

import dio.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {

    // o JPA apenas por esse atributo já é capaz de verificar se o número da conta do usuário já está cadastrada no banco
    boolean existsByAccountNumber(String number);


}
