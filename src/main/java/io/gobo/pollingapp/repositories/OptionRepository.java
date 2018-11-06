package io.gobo.pollingapp.repositories;

import org.springframework.data.repository.CrudRepository;
import io.gobo.pollingapp.domain.Option;



public interface OptionRepository extends CrudRepository<Option, Long>
{



}
