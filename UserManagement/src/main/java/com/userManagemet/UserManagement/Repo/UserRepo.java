package com.userManagemet.UserManagement.Repo;

import com.userManagemet.UserManagement.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class UserRepo {
    @Autowired
    public List<User> userList;



}
