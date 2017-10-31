package com.niit.restcontroller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.model.Error;
import com.niit.model.User;
import com.niit.service.FriendService;

@Controller
public class FriendController {

	@Autowired
	private FriendService friendService;
	
	@RequestMapping(value="/getsuggestedusers",method=RequestMethod.GET)
	public ResponseEntity<?> getSuggestedUsers(HttpSession session){
		String username=(String)session.getAttribute("username");
		if(username==null) {
			Error error=new Error(5,"Unauthorized access");
			return new ResponseEntity<Error>(error,HttpStatus.UNAUTHORIZED);
		}
		List<User> suggestedUsers=friendService.listOfSuggestedUsers(username);
		return new ResponseEntity<List<User>>(suggestedUsers,HttpStatus.OK);
	}
}