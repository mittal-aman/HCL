package com.aman.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.aman.module.Question;
import com.aman.repository.QuestionRepository;

@Service
@Transactional
public class QuestionService 
{

	private final QuestionRepository questionRepository;

	public QuestionService(QuestionRepository questionRepository) {
		this.questionRepository = questionRepository;
	}

	public void saveMyQuestion(Question question) {
		questionRepository.save(question);
	}
	
	public List<Question> showAllquestion(){
		List<Question> questions = new ArrayList<Question>();
		for (Question question : questionRepository.findAll()) {
			questions.add(question);
		}
		return questions;
	}
	
	public void deleteMyUser(int number)
	{
		questionRepository.deleteById(number);
	}
	
	public Optional<Question> editMyUser(int number)
	{
		return questionRepository.findById(number);
	}

//	public User findByUsernameAndPassword(String username, String password) {
//		// TODO Auto-generated method stub
//		return userRepository.findByUsernameAndPassword(username, password);
//	}
	
}
