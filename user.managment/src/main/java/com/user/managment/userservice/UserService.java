package com.user.managment.userservice;

import com.user.managment.usermodel.UserModel;

import java.util.ArrayList;

public interface UserService {

    ArrayList<UserModel>getUserDetails();
    
    String insertUserDetails(UserModel request);
    
	/* String updatePasswordDetails(UserModel request ,String emailId); */
    
    String updateUserMobileNum(UserModel request ,String emailId);
    
    String deleteUserAccount(String emailId);
    
    
   
}
