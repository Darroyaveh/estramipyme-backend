package com.estramipyme.crud.controllers;

import com.estramipyme.crud.models.User;
import com.estramipyme.crud.services.UserItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/api/v1/users")
public class UserItemController {
	private final AtomicLong counter = new AtomicLong();

	@Autowired
	private UserItemService userItemService;

	@GetMapping
	public List<User> getAllUsers() {
		return userItemService.showAllUserItems();
	}

	@GetMapping("id")
	public User getUserById(@RequestParam String id) {
		return userItemService.getUserById(id);
	}

	@GetMapping("email")
	public User getUserByEmail(@RequestParam String email) {
		return userItemService.getUserByEmail(email);
	}

	@PostMapping
	public User createUser(@RequestBody User user) {
		return userItemService.createUserItem(user);
	}

	@PutMapping("email")
	public User updateUser(@RequestBody User user) {
		return userItemService.updateUserItem(user);
	}

	@DeleteMapping("email")
	public void deleteUser(@RequestParam String email) {
		userItemService.deleteUserItem(email);
	}
}
