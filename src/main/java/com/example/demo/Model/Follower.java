package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "follower")
public class Follower {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne
	@JoinColumn(name = "friend_id")
	private User friendFollow;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User userFollow;

	public User getFriendFollow() {
		return friendFollow;
	}

	public void setFriendFollow(User friendFollow) {
		this.friendFollow = friendFollow;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getfriendFollow() {
		return friendFollow;
	}

	public void setfriendFollow(User friendFollow) {
		this.friendFollow = friendFollow;
	}

	public User getUserFollow() {
		return userFollow;
	}

	public void setUserFollow(User userFollow) {
		this.userFollow = userFollow;
	}

}
