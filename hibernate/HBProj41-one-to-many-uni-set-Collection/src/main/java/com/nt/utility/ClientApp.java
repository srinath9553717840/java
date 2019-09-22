package com.nt.utility;

import com.nt.dao.OToMDAO;
import com.nt.dao.OToMDAOFactory;

public class ClientApp {
	public static void main(String[] args) {
		OToMDAO dao=OToMDAOFactory.getInstance();
		dao.deleteAllPhoneNumberFromUserToAnotherUser();
	
	}
	

}
