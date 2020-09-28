package com.nt.service;

import java.util.Calendar;

public class WishMessageServiceImpl implements WishMessageService {

	@Override
	public String generateMessage() {
      var hour=0;
      //get system date and time
      var calendar=Calendar.getInstance();
      //get current hour of the day
      hour=calendar.get(Calendar.HOUR_OF_DAY);
      //generate wish messages
      if(hour<12)
    	  return "Good Morning::";
      else if(hour<16)
    	  return "Good Afternoon::";
      else if(hour<20)
    	  return "Good Evening";
      else
    	  return "Good Night::";
	}

}
