package com.thinkxfactor.zomatoplus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thinkxfactor.zomatoplus.model.Login;
import com.thinkxfactor.zomatoplus.model.User;

public interface UserRepository extends JpaRepository<User,Long> {

	User findBynameAndPassword(Long name,String password);
}
