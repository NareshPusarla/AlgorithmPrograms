package test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexName {
	static BufferedReader br;
	private final static String REGEX_NAME = "<<name>>";
	private final static String REGEX_FULLNAME = "<<full name>> ";
	private final static String REGEX_MOBILE_NO = "xxxxxxxxxx";
	private final static String REGEX_DATE = "26/07/2021";
	
	public RegexName() {
	br = new BufferedReader(new InputStreamReader(System.in));
	}
	public static String convertString(UserDetails userDetails,String message){
		Pattern p = Pattern.compile(REGEX_NAME);
		Matcher m = p.matcher(message); 
		message = m.replaceAll(userDetails.getfName());

		p = Pattern.compile(REGEX_FULLNAME);
		m = p.matcher(message); 
		message = m.replaceAll(userDetails.getfName()+" "+userDetails.getlName());

		p = Pattern.compile(REGEX_MOBILE_NO);
		m = p.matcher(message); 
		message = m.replaceAll(userDetails.mobileNo());

		p = Pattern.compile(REGEX_DATE);
		m = p.matcher(message); 
		message = m.replaceAll(userDetails.date());

		return message;
	}
	
	//take input word
	public static String inputString(){
		try{
			return br.readLine();
		}
		catch(IOException ioe){
			System.out.println(ioe.getMessage());
		}
		return "";
	}
	public static String getFormatedDate(Date date){
		SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
		return sdf.format(date);
	}

	//Take file name as input and return string of file text
	public static String getFileText(String fileName){
		try{
			br=new BufferedReader(new FileReader(fileName));
			StringBuilder sb=new StringBuilder();
			String line=br.readLine();
			while(line!=null){
				sb.append(line);
				sb.append(System.lineSeparator());
				line=br.readLine();
			}
			return sb.toString();
		 }
		catch(Exception e){
			return null;
		}
		finally{
			try{
				br.close();
			}
			catch(IOException ioe){
			}	
		}
	}

	public static void main(String args[])
	{
		UserDetails user=new UserDetails();
		System.out.println();
	
		//asking user to enter his data
		System.out.println("Enter FirstName:");
		user.setfName(inputString());
		System.out.println();
	
		System.out.println("Enter LastName:");
		user.setlName(inputString());
		System.out.println();
	
		System.out.println("Enter Mobile Number:");
		user.setmobileNo(inputString());
		System.out.println();	
		
		//Setting current date
		user.setdate(getFormatedDate(new Date(0)));
		System.out.println(convertString(user,getFileText("file.txt")));	
	}
}
