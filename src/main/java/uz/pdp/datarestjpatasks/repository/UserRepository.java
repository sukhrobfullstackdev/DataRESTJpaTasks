package uz.pdp.datarestjpatasks.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.datarestjpatasks.entity.User;

@RepositoryRestResource(path = "user", excerptProjection = CustomUser.class)
public interface UserRepository extends CrudRepository<User, Integer> {
}
