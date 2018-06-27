package com.thinkxfactor.zomatoplus.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.thinkxfactor.zomatoplus.model.Login;
import com.thinkxfactor.zomatoplus.model.User;
import com.thinkxfactor.zomatoplus.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {
	private static final Object Long = null;
	private static final String String = null;
	@Autowired
private UserRepository userRepository;
@PostMapping("/add")
public User addUser(@RequestBody User user) {
	User persistedUser=userRepository.save(user);
			
			return persistedUser;
}
	@GetMapping("/getAll")
	public List<User> getAll(){
		List<User> listofusers=userRepository.findAll();
		return listofusers;
	}
	
	
	@PostMapping("/login")
	public User userLogin(@RequestBody User usr)
	{
		User usr1=userRepository.findBynameAndPassword(usr.getName(), usr.getPassword());
		if(usr1.equals(null))
			return null;
		else
			return usr;
	}

/*	@GetMapping("/login")
	public User userLogin(@RequestParam("Username") String username, @RequestParam("Password")String password){
		User usr= new User();
		usr.setName(username);
		usr.setPassword(password);
		
		return usr;
	}
	
	@GetMapping("/all")
	public List<User> userList(){
		List<User> usr=new ArrayList<>();
		User usr1,usr2,usr3;
		usr1=new User("Shaif","abcd1234");
		usr2=new User("Rashid","efgh3456");
		usr3=new User("Sanjeev","ijkl5678");
		usr.add(usr1);
		usr.add(usr2);
		usr.add(usr3);
		
		
		
		return usr;
	}
	@PostMapping("/create")
	public User userCreate(@RequestBody User user) {
		System.out.println(user.toString());
		
		return user;
		
		
	}*/
}
