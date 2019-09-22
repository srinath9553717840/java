package com.nt.dao;

public interface OToMDAO {
	
	public void saveDate();
	public void loadData();
	
	public void addNewPhoneNumberToExistingUser();
	public void deleteUserWithPhoneNumbers();
	public void deleteOnePhoneNumberOfAUser();
	public void deleteAllPhoneNumberFromUserToAnotherUser();
	public void transferPhoneNumberFromOneUserToAnotherUser();
	public void ChangePhoneNumberProviderorExistingUser();
	
	

}
