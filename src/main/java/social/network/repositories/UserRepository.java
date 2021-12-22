package social.network.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import social.network.models.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

    User findFirstByEmail(String email);

}