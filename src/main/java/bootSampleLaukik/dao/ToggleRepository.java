package bootSampleLaukik.dao;

import org.springframework.data.repository.CrudRepository;

import bootSampleLaukik.model.Toggle;

public interface ToggleRepository extends CrudRepository<Toggle, String> {

}
