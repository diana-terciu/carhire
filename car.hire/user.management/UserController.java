package ro.agilehub.javacourse.car.hire.fleet.controller;

import java.util.Collections;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import ro.agilehub.javacourse.car.hire.api.model.UserDTO;
import ro.agilehub.javacourse.car.hire.api.specification.UsersApi;

@RestController
public class UserController implements UsersApi {

	@Override
	public ResponseEntity<List<UserDTO>> getUsers() {
		return ResponseEntity.ok(Collections.singletonList(buildStubs()));

	}

	@Override
	public ResponseEntity<UserDTO> getUserById(Long userId) {
		return ResponseEntity.ok(buildStubs());

	}

	public UserDTO buildStubs() {
		UserDTO userDTO = new UserDTO();
		userDTO.setId(1);
		userDTO.setFirstName("Diana");
		userDTO.setLastName("Terciu");
		return userDTO;
	}

	@Override
	public ResponseEntity<UserDTO> addUser(@Valid UserDTO userDTO) {
		return ResponseEntity.ok(buildStubs());
	}

	@Override
	public ResponseEntity<Void> deleteUserById(Long userId) {
		return UsersApi.super.deleteUserById(userId);
	}

}
