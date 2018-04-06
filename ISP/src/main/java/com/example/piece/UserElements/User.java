package com.example.piece.UserElements;

import java.util.HashMap;

import com.example.piece.State;

public class User {
	
	String username;
	Byte[] password;
	HashMap<String,String> preferences;
	int admin;
	HashMap<String,State> savedStates;
	boolean loggedIn;
	
	//Constructors
	public User() {
		super();
	}
	public User(String username, Byte[] password, HashMap<String, String> preferences, int admin,
			HashMap<String, State> savedStates, boolean loggedIn) {
		super();
		this.username = username;
		this.password = password;
		this.preferences = preferences;
		this.admin = admin;
		this.savedStates = savedStates;
		this.loggedIn = loggedIn;
	}
	
	
	//Getters and Setters
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public Byte[] getPassword() {
		return password;
	}
	public void setPassword(Byte[] password) {
		this.password = password;
	}
	
	public HashMap<String, String> getPreferences() {
		return preferences;
	}
	public void setPreferences(HashMap<String, String> preferences) {
		this.preferences = preferences;
	}
	
	public int getAdmin() {
		return admin;
	}
	public void setAdmin(int admin) {
		this.admin = admin;
	}
	
	public HashMap<String, State> getSavedStates() {
		return savedStates;
	}
	public void setSavedStates(HashMap<String, State> savedStates) {
		this.savedStates = savedStates;
	}
	
	public boolean isLoggedIn() {
		return loggedIn;
	}
	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}
	
	//Methods
	
	
}
