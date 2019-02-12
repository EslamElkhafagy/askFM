package com.example.demo.Model;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String userName;
	private String passWord;
	private String fullName;
	private String email;
	private String birthDay;
	private String gender;
	private String location;
	private String bio;
	private String web;
	private String hashTags;
	private byte allowAnonQuestion; // Allow anonymous questions ?
	private byte allowSharePosts; // >Allow other users to share posts ?
	private byte allowOnDiscoverFeed; //Allow showing user answers on Discover feed ?
	private byte showStatus;
	private String profileImagePath;  // upload image in file and store path
	private String backgroundImagePath;
	
	@OneToMany(mappedBy="recUser")
	private Set<Question> questions= new HashSet<>(); 
	
	@OneToMany(mappedBy="userFollow")
	private Set<Follower> followers = new HashSet<>();
	
	@OneToMany(mappedBy="user")
	private Set<Notification> notifications= new HashSet<>();
	
	
	
	public Set<Question> getQuestions() {
		return questions;
	}
	public void setQuestions(Set<Question> questions) {
		this.questions = questions;
	}
	public Set<Follower> getFollowers() {
		return followers;
	}
	public void setFollowers(Set<Follower> followers) {
		this.followers = followers;
	}
	public Set<Notification> getNotifications() {
		return notifications;
	}
	public void setNotifications(Set<Notification> notifications) {
		this.notifications = notifications;
	}
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
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	public String getHashTags() {
		return hashTags;
	}
	public void setHashTags(String hashTags) {
		this.hashTags = hashTags;
	}
	public byte getAllowAnonQuestion() {
		return allowAnonQuestion;
	}
	public void setAllowAnonQuestion(byte allowAnonQuestion) {
		this.allowAnonQuestion = allowAnonQuestion;
	}
	public byte getAllowSharePosts() {
		return allowSharePosts;
	}
	public void setAllowSharePosts(byte allowSharePosts) {
		this.allowSharePosts = allowSharePosts;
	}
	public byte getAllowOnDiscoverFeed() {
		return allowOnDiscoverFeed;
	}
	public void setAllowOnDiscoverFeed(byte allowOnDiscoverFeed) {
		this.allowOnDiscoverFeed = allowOnDiscoverFeed;
	}
	public byte getShowStatus() {
		return showStatus;
	}
	public void setShowStatus(byte showStatus) {
		this.showStatus = showStatus;
	}
	public String getProfileImagePath() {
		return profileImagePath;
	}
	public void setProfileImagePath(String profileImagePath) {
		this.profileImagePath = profileImagePath;
	}
	public String getBackgroundImagePath() {
		return backgroundImagePath;
	}
	public void setBackgroundImagePath(String backgroundImagePath) {
		this.backgroundImagePath = backgroundImagePath;
	}
	
	
	
	
	
}
