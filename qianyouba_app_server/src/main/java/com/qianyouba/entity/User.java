package com.qianyouba.entity;

public class User {
	private int id;
	private String username;
	private String avatarUrl = "";
	private int created;
	private String name = "";
	private String nickName = "";
	private int onlineStatus;
	private int roleStatus;
	private String token = "";
	private int updated;
	
	public User(){
		
	}
	
	public User(String username, String avatarUrl,
			int created, String name, String nickName, int onlineStatus,
			int roleStatus, String token, int updated) {
		super();
		this.username = username;
		this.avatarUrl = avatarUrl;
		this.created = created;
		this.name = name;
		this.nickName = nickName;
		this.onlineStatus = onlineStatus;
		this.roleStatus = roleStatus;
		this.token = token;
		this.updated = updated;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAvatarUrl() {
		return avatarUrl;
	}

	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}

	public int getCreated() {
		return created;
	}

	public void setCreated(int created) {
		this.created = created;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public int getOnlineStatus() {
		return onlineStatus;
	}

	public void setOnlineStatus(int onlineStatus) {
		this.onlineStatus = onlineStatus;
	}

	public int getRoleStatus() {
		return roleStatus;
	}

	public void setRoleStatus(int roleStatus) {
		this.roleStatus = roleStatus;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public int getUpdated() {
		return updated;
	}

	public void setUpdated(int updated) {
		this.updated = updated;
	}
	

}
