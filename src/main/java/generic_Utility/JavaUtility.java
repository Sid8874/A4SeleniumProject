package generic_Utility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
	public String calenderHandling(String pattern)
	{
		Calendar cal=Calendar.getInstance();
		Date d=cal.getTime();
		SimpleDateFormat sdf=new SimpleDateFormat(pattern);
		String data=sdf.format(d);
		return data;
		
	}
	public int getRandomNumber(int range)
	{
		Random r=new Random();
		int num=r.nextInt(range);
		return num;
		
	}
//	public static void main(String[] args) {
//		JavaUtility jv=new JavaUtility();
//		System.out.println(jv.calenderHandling("dd/MM/YYYY"));
//		System.out.println(jv.getRandomNumber(1000));
//	}

}
