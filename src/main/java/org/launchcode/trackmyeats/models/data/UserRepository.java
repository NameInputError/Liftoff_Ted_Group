
package org.launchcode.trackmyeats.models.data;


import org.launchcode.trackmyeats.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;


@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
//    User findByUsername(String username);
//
//     void save(User newUser);
//
//    Optional<User> findById(Integer userId);

}

