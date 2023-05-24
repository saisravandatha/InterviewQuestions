package com.javagudies.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapAndCollectStream {

	public static void main(String[] args) {

		List<User> userList = new ArrayList<>();
		userList.add(new User(1, "Sai", "1234", "sai@gmail.com"));
		userList.add(new User(2, "durga", "25456", "durga@gmail.com"));
		userList.add(new User(3, "siva", "4569", "siva@gmail.com"));
		userList.add(new User(4, "ram", "122454", "ram@gmail.com"));
		
		// mapping User to UserDTO 
		List<UserDTO> dtoList = userList.stream()
				.map(user -> new UserDTO(user.getId(),user.getUserName(),user.getEmail()))
				.collect(Collectors.toList());
		
		System.out.println(dtoList);
	}
}

class User{
	
	private int id;
	private String userName;
	private String password;
	private String email;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public User(int id, String userName, String password, String email) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", email=" + email + "]";
	}
	
}


class UserDTO{

	private int id;
	private String userName;
	private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public UserDTO(int id, String userName, String email) {
		super();
		this.id = id;
		this.userName = userName;
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", email=" + email + "]";
	}
	
}