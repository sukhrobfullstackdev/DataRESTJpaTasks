package uz.pdp.datarestjpatasks.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.datarestjpatasks.entity.Input;

@RepositoryRestResource(path = "input",excerptProjection = CustomInput.class)
public interface InputRepository extends CrudRepository<Input,Integer> {}
