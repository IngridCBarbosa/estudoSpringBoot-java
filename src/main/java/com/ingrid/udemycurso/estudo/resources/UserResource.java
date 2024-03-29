package com.ingrid.udemycurso.estudo.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ingrid.udemycurso.estudo.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User>  findAll(){
		User u = new User(1,"Maria","m@gmail.com","979112585","123456");
		return ResponseEntity.ok().body(u);
	}

}
