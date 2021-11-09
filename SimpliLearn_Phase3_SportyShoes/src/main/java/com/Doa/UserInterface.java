package com.Doa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.bean.User;

@Repository
public interface UserInterface extends JpaRepository<User, String>{


	Boolean existsBypassword(String password);

	Boolean existsByusername(String username);
	
	

	

}
