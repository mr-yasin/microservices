package com.user.managment.usercontroller;

import com.user.managment.userentity.UserEntity;
import com.user.managment.usermodel.UserModel;
import com.user.managment.userrepository.UserRepository;
import com.user.managment.userservice.UserService;
import com.user.managment.userservice.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class UserController {

    @Autowired
    UserService service;
    
    @Autowired
	UserRepository repo;




    @RequestMapping(method = RequestMethod.GET,path ="/user/details" )
    public ArrayList<UserModel> getUserDetails() {

        return service.getUserDetails();
    }
    
    @RequestMapping(method = RequestMethod.POST,path="/user/insert/details")
    public  String insertUserDetails(@RequestBody UserModel request) {
    	return service.insertUserDetails(request);
    }
    @RequestMapping(method = RequestMethod.PUT,path="/user/updatepassword/details/{emailId}")
    public String updatePasswordDetails(@RequestBody UserEntity request, @PathVariable String emailId) {
    	
    	UserEntity s1= repo.findById(emailId).get();
    	s1.setfName(request.getfName());
    	s1.setlName(request.getlName());
    	s1.setPassword(request.getPassword());
    	s1.setMobileNum(request.getMobileNum());
    	repo.save(s1);
		
		return "jai balayya" ;
	}
    
    @RequestMapping(method = RequestMethod.PUT,path="/user/updatemobilenumber/details/{emailId}")
    public String updateUserMobileNum(@RequestBody UserModel request, @PathVariable String emailId) {
		return service.updateUserMobileNum(request, emailId);
	}
    
    @RequestMapping(method = RequestMethod.DELETE,path="user/delete/{emailId}")
    public String deleteUserAccount(@PathVariable String emailId) {
    	
		
		return service.deleteUserAccount(emailId);
	}
    

}
