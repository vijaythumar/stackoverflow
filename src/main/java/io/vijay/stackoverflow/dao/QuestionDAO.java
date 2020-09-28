package io.vijay.stackoverflow.dao;

import io.vijay.stackoverflow.entities.Questions;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionDAO extends CrudRepository<Questions, Long> {


}
