package com.aman.repository;

import org.springframework.data.repository.CrudRepository;

import com.aman.module.Question;

public interface QuestionRepository extends CrudRepository<Question, Integer> {

}
