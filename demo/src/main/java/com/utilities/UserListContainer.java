package com.utilities;

import java.util.List;

import com.model.entities.User;

public class UserListContainer {
	private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
