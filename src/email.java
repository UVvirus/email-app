
import java.util.*;
public class email
{ private String firstName;
private String  lastName;
private String  password;
 String company="company.com";
 private String email;
private int mailBoxCapacity=500;
private String alternativeEmail;
 int defaultPasswordLength=10;
 private String department;
 
public email(String firstName,String lastName){
	this.firstName=firstName;
	this.lastName=lastName;
	System.out.println(this.firstName+" "+this.lastName);
	//method call to return department
	this.department=setDepartment();
	System.out.println(this.department);
  //Generate reandom password
	this.password=randomPassword(defaultPasswordLength);
	System.out.println("password is:"+this.password);
	//returns email
	email=firstName+"."+lastName+"."+department+"@"+company;
	System.out.println(email);
}



private String setDepartment(){
	System.out.println("1 for sales \n2 for security \n3 for dev");
	
	Scanner s=new Scanner(System.in);
	int dep=s.nextInt();
	if(dep==1){
		return("department:sales");
	}else if(dep==2){
		return("security");}
		else if(dep==3){
			return("dev");
		}else{
			return("");
		}
	}
//Generate random password
	private String randomPassword(int length)
	{
		String passwordSet="abcdjff7,43888833f77de12345@#$$&";
		char[]password=new char[length];
		for(int i=0;i<length;i++){
			int rand;
			rand=(int)(Math.random()*passwordSet.length());
			password[i]=passwordSet.charAt(rand);
			//System.out.println((int)Math.random());
		}
		return new String(password);
		
	}//getters and setters method
	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getPassword()
	{
		return password;
	}

	public void setAlternativeEmail(String alternativeEmail)
	{
		this.alternativeEmail = alternativeEmail;
	}

	public String getAlternativeEmail()
	{
		return alternativeEmail;
	}

	public void setMailBoxCapacity(int mailBoxCapacity)
	{
		this.mailBoxCapacity = mailBoxCapacity;
	}

	public int getMailBoxCapacity()
	{
		return mailBoxCapacity;
	}
 
}
