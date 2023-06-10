package com.user.managment.userservice;

import com.user.managment.userentity.UserEntity;
import com.user.managment.usermodel.UserModel;
import com.user.managment.userrepository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	UserRepository repo;

	@Override
	public ArrayList<UserModel> getUserDetails() {
		ArrayList<UserModel> userData = new ArrayList<>();
		ArrayList<UserEntity> data = (ArrayList<UserEntity>) repo.findAll();
		for (UserEntity eachData : data) {
			UserModel user = new UserModel();
			user.setFirstName(eachData.getfName());
			user.setLastName(eachData.getlName());
			user.setEmailId(eachData.getEmailId());
			user.setPassword(eachData.getPassword());
			user.setMobileNum(eachData.getMobileNum());
			userData.add(user);
		}
		return userData;
	}

	@Override
	public String insertUserDetails(UserModel request) {
		// TODO Auto-generated method stub
		UserEntity data = new UserEntity();

		data.setfName(request.getFirstName());
		data.setlName(request.getLastName());
		data.setEmailId(request.getEmailId());
		data.setPassword(request.getPassword());
		data.setMobileNum(request.getMobileNum());
		repo.save(data);
		return request.getFirstName() + " Data is inserted";
	}
	/*
	 * @Override public String updatePasswordDetails(UserModel request, String
	 * emailId) { // TODO Auto-generated method stub Optional<UserEntity> userData =
	 * repo.findById(emailId); UserEntity data = userData.get();
	 * data.setfName(request.getFirstName()); data.setlName(request.getLastName());
	 * data.setEmailId(emailId); data.setPassword(request.getPassword());
	 * data.setMobileNum(request.getMobileNum()); repo.save(data);
	 * 
	 * return "User Data is Updated"; }
	 */

	@Override
	public String updateUserMobileNum(UserModel request, String emailId) {
		// TODO Auto-generated method stub

		Optional<UserEntity> data = repo.findById(emailId);
		UserEntity userData = data.get();

		userData.setMobileNum(request.getMobileNum());

		repo.save(userData);

		return "User Mobile Num is Updated";

	}

	@Override
	public String deleteUserAccount(String emailId) {
		Optional<UserEntity> data = repo.findById(emailId);
		UserEntity userData = data.get();
		String msg = userData.getfName() + "Account is Deleted";
		repo.deleteById(emailId);
		return msg;

	}

	

}
