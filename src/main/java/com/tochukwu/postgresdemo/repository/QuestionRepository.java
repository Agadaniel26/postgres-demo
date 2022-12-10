package com.tochukwu.postgresdemo.repository;

import com.tochukwu.postgresdemo.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
}
