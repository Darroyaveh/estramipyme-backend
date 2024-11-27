package com.estramipyme.crud.services;

import com.estramipyme.crud.models.User;
import com.estramipyme.crud.repositories.UserItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserItemService {

	@Autowired
	private UserItemRepository userItemRepository;

	// Method to show all UserItems
	public List<User> showAllUserItems() {
		return userItemRepository.findAll();
	}

	// Method to create User
	public User createUserItem(User user) {
		if (userItemRepository.findUserByEmail(user.getEmail()) != null) {
			throw new RuntimeException("User already exists with email: " + user.getEmail());
		}
		return userItemRepository.save(user);
	}

	// Method to get User by id
	public User getUserById(String id) {
		User user = userItemRepository.findUserById(id);
		if (user == null) {
			throw new RuntimeException("User not found with id: " + id);
		}
		return userItemRepository.findUserById(id);
	}


	// Method to get a User by email
	public User getUserByEmail(String email) {
		User user = userItemRepository.findUserByEmail(email);
		if (user == null) {
			throw new RuntimeException("User not found with email: " + email);
		}
		return userItemRepository.findUserByEmail(email);
	}

	// Method to get User by fullname
	public User getUserByFullName(String firstName, String lastName) {
		User user = userItemRepository.findUserByName(firstName, lastName);
		if (user == null) {
			throw new RuntimeException("User not found with name: " + firstName + " " + lastName);
		}
		return userItemRepository.findUserByName(firstName, lastName);
	}

	// Method to get User by docNumber
	public User getUserByDocNumber(String docNumber) {
		User user = userItemRepository.findUserByDocNumber(docNumber);
		if (user == null) {
			throw new RuntimeException("User not found with docnumber: " + docNumber);
		}
		return userItemRepository.findUserByDocNumber(docNumber);
	}

	// Method to update User
	public User updateUserItem(User user) {
		Optional<User> existingUserItem = Optional.ofNullable(userItemRepository.findUserByEmail(user.getEmail()));

		if (existingUserItem.isPresent()) {
			User updatedUser = existingUserItem.get();
			updatedUser.setFirstName(user.getFirstName());
			updatedUser.setLastName(user.getLastName());
			updatedUser.setPassword(user.getPassword());
			updatedUser.setPersonType(user.getPersonType());
			updatedUser.setDocType(user.getDocType());
			updatedUser.setDocNumber(user.getDocNumber());
			updatedUser.setSector(user.getSector());
			updatedUser.setRole(user.getRole());
			updatedUser.setAcceptPolicy(user.isAcceptPolicy());
			return userItemRepository.save(updatedUser);
		} else {
			throw new RuntimeException("User not found with email: " + user.getEmail());
		}
	}

	// Method to delete User
	public void deleteUserItem(String email) {
		Optional<User> existingUserItem = Optional.ofNullable(userItemRepository.findUserByEmail(email));

		if (existingUserItem.isPresent()) {
			userItemRepository.delete(existingUserItem.get());
		} else {
			throw new RuntimeException("User not found with email: " + email);
		}
	}

}
