package com.project.fooddelivery.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.project.fooddelivery.entity.FDUsers;
import com.project.fooddelivery.exceptions.ResourceNotFoundException;
import com.project.fooddelivery.repo.UserRepository;

@RestController
public class UserController {
	
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public List<FDUsers> getAllUsers() {
        return userRepository.findAll();
    }
    
    @GetMapping("/users/{id}")
    public ResponseEntity<FDUsers> getUserById(@PathVariable(value = "id") Long userId) throws ResourceNotFoundException {
    	FDUsers user = userRepository.findById(userId)
        .orElseThrow(() -> new ResourceNotFoundException("FDUSR404"));
        return ResponseEntity.ok().body(user);
    }

	/**
	 * @return the userRepository
	 */
	public UserRepository getUserRepository() {
		return userRepository;
	}

	/**
	 * @param userRepository the userRepository to set
	 */
	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

}
