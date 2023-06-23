package com.userManagemet.UserManagement.Service;

import com.userManagemet.UserManagement.Model.User;
import com.userManagemet.UserManagement.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;
    public List<User> getAllUser() {
        return userRepo.userList;
    }

    public String addAllUser(List<User> userList) {
        boolean flag = userRepo.userList.addAll(userList);
        if(flag) return "Users Added";
        else return "Users Can't be Added ";
    }

    public User getUsersById(Integer userId) {

        for(User user : userRepo.userList){
            if(user.getUserId().equals(userId)){
                return user;
            }
        }
        return  null;
    }


    public String updateUserInfo(Integer userId, User user) {
        for(User user1 : userRepo.userList){
            if(user1.getUserId().equals(userId)){
                user1.setUserId(user.getUserId());
                user1.setName(user.getName());
                user1.setUserName(user.getUserName());
                user1.setUserAddress(user.getUserAddress());
                user1.setUserPhoneNumber(user.getUserPhoneNumber());
                return "User Updated";
            }
        }
        return "Check UserId Once";
    }

    public String deleteUser(Integer userId) {
        for(User user : userRepo.userList){
            if(user.getUserId().equals(userId)){
                userRepo.userList.remove(user);
                return "User Deletion SuccessFul";
            }
        }
        return "Invalid UserId";
    }
}
