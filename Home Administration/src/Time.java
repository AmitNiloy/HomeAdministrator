import java.util.Date;
import java.text.DateFormat;
import java.util.Calendar;
import java.text.SimpleDateFormat;


public class Time {
	public static void main(String args[]){
	      /*Date now=new Date();
	       DateFormat df=DateFormat.getDateInstance();
	       DateFormat df1=DateFormat.getDateInstance(DateFormat.SHORT);
	       DateFormat df2=DateFormat.getDateInstance(DateFormat.MEDIUM);
	       DateFormat df3=DateFormat.getDateInstance(DateFormat.LONG);
	       DateFormat df4=DateFormat.getDateInstance(DateFormat.FULL);
	       
	       String s=df.format(now);
	       String s1=df1.format(now);
	       String s2=df2.format(now);
	       String s3=df3.format(now);
	       String s4=df4.format(now);
	       
	       System.out.println("today is "+s);
	       System.out.println("today is "+s1);
	       System.out.println("today is "+s2);
	       System.out.println("today is "+s3);
	       System.out.println("today is "+s4);*/
		Calendar cal = Calendar.getInstance();
		String month=new SimpleDateFormat("MMM").format(cal.getTime());
		String year=new SimpleDateFormat("YYYY").format(cal.getTime());
		String date=month+"."+year;
		System.out.println(date);
	}
	
}
