package com.userManagemet.UserManagement.Configuration;

import com.userManagemet.UserManagement.Model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanManager {
    @Bean
    public ArrayList<User> beanArrayList(){
        return new ArrayList<>();
    }
}
