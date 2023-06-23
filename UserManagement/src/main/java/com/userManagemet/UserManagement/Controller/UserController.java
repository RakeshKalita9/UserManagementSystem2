package com.userManagemet.UserManagement.Controller;

import com.userManagemet.UserManagement.Model.User;
import com.userManagemet.UserManagement.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
     @Autowired
     UserService userService;

     // getAllUser
     @GetMapping("users")
     public List<User> getAllUser(){
          return  userService.getAllUser();
     }
     //addUser
     @PostMapping("users")
     public String addUsers(@RequestBody List<User> userList){
      return userService.addAllUser(userList);
     }
     //GetUserById
     @GetMapping("users/userId/{userId}")
     public User getUserById(@PathVariable Integer userId){
          return userService.getUsersById(userId);
     }
     // updateUser
     @PutMapping("users/userId/{userId}")
     public String updateUserInfo(@PathVariable Integer userId,@RequestBody User user){
          return userService.updateUserInfo(userId,user);
     }
     //Delete User
     @DeleteMapping("user/userId/{userId}")
     public String deleteUser(@PathVariable Integer userId){
          return userService.deleteUser(userId);
     }

}
