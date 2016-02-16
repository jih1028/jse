package oop;

import java.util.Scanner;

public class DateServiceImpl implements DateService {

	@Override
	public String getEndDayOfMonth(int year, int month) {
		


		String endOfDay="";
		switch (month) {
		case 1:case 3:case 5:case 7:case 8:case 10:case 12:endOfDay="31";break;
		case 4:case 6:case 9:case 11:endOfDay="30";break;
		case 2: endOfDay = "28";
			if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) endOfDay = "29";break;
		default:break;
		}
		return endOfDay;
	
		
		
	}

}
