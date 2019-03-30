
import java.util.*;public class email
{ String firstName;
 String  lastName;
 String  password;
 int mailBoxCapacity;
 int defaultPasswordLength=10;
 String department;
 
public email(String firstName,String lastName){
	this.firstName=firstName;
	this.lastName=lastName;
	System.out.println(this.firstName+" "+this.lastName);
	//method call to return department
	this.department=setDepartment();
	System.out.println(this.department);

	this.password=randomPassword(defaultPasswordLength);
	System.out.println("password is:"+this.password);
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
			int rand=(int)Math.random()*passwordSet.length();
			password[i]=passwordSet.charAt(rand);
		}
		return new String(password);
		
	}
 
}
