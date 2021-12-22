package social.network.services;

import org.springframework.security.core.userdetails.UserDetailsService;

import social.network.models.User;

public interface UserService extends UserDetailsService {

    boolean login(User user);

    User register(User user);

    User getByEmail(String email);

}
