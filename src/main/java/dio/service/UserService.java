package dio.service;

import dio.domain.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User findById(Long id);

    User create (User userToCreate);

    List<User> findAll ();

}
