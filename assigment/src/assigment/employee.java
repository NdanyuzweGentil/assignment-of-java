package assigment;
import java.util.*;
public class employee {
	public int type;
	public String name;
	public int salary;
	public int tax;
	public int hour;
	public int gross;
	public int rssb;
	public int net;
	

	public static class Month extends employee{
		public void emp1()
		{
			Scanner in = new Scanner(System.in);
			System.out.println("Enter monthly salary: ");
			salary=in.nextInt();
			
		tax= (salary*30)/100;
		rssb=(salary*3)/100;
		net=salary-(tax+rssb);
		
		
		}
		
		
	}
	public static class Week extends employee{
		public void emp2(){
			System.out.println("Enter week salary:");
			Scanner in = new Scanner(System.in);
			salary=in.nextInt();
			net=salary;
			
		}
	}
	public static class Hour extends employee{
		
	public  int emp3(){
		System.out.println("Please enter number of hours:");
		Scanner in = new Scanner(System.in);
		hour = in.nextInt();
		System.out.println("Please enter salary per  hour:");
		salary = in.nextInt();
		
		if(hour<=40){
		return(net = hour*salary);
		
		}
		else{
			return(net=(hour*salary)+((40-hour)*salary));
			
			
		}
	}
	}


	
	public  static void main(String[] args) {
		int a;
		
		Hour num = new Hour();
        Week num1=new Week();
        Month num2=new Month();
		
		//num.emp3();
		System.out.println("Please Enter Name of an Employee:");
		
		Scanner in = new Scanner(System.in);
		//a=in.nextInt();
        num.name=in.nextLine();
        System.out.println("Please select type of employee according to type");
        System.out.println("=================================================");
        System.out.println("type1:month,type2:weekly,type3:hour:");
        num.type=in.nextInt();
        System.out.println("name is "+num.name);
		if(num.type==1)
		{
			num2.emp1();
			System.out.println("Your Net Salary is: "+num2.net+"RWF");
			
		}
		else if(num.type==2){
			num1.emp2();
			System.out.println("Your Net Salary is: "+num1.net+"RWF");
		}
		else if(num.type==3){
			num.emp3();
			System.out.println("Your Net Salary is: "+num.net+"RWF");
			
		}
		else{
			System.out.println("Invalid Type PLZ Try again!!!");
		}
                
		
		}
	
}
