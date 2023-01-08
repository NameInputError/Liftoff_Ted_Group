
package org.launchcode.trackmyeats.models.data;

        import org.launchcode.trackmyeats.models.User;

        import java.util.Optional;

public interface UserRepository {
    User findByUsername(String username);

    void save(User newUser);

    Optional<User> findById(Integer userId);
}