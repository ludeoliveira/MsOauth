package com.aulas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.aulas.entidades.User;
import com.aulas.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository repo;
	
	@Autowired
	BCryptPasswordEncoder passwordEncoder;
	
	public User salvar(User user) {
		String senha = user.getSenha();
		user.setSenha(passwordEncoder.encode(senha));
		return repo.save(user);
	}
	
	public List<User> consultar() {
		return repo.findAll();
	}
}
