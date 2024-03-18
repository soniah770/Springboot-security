package com.profiles.Spring_Profiles.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "USER")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;


	private String username;
	
	
	private String password;

//    private boolean enabled;

	// more properties as your project requirements

	public User() {
	}

	public User(Integer id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="userDetail_id")
//	private UserDetails userDetails;

//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="token_id")
//	private UserLoginToken userLoginToken;

}
