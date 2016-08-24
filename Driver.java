import java.util.Scanner;

public class Driver {
static Scanner s;
public static void main(String[] args) 
{
	s=new Scanner(System.in);		//Declaring input object
	do{
		System.out.println("\nEnter Account\n1-Account 1\n2-Account 2\n3-Exit\n");//printing options
	int account=Integer.parseInt(s.next());//taking input
	if(account==1)
		new Account1();//making instance of new Account1
	if(account==2)
		new Account2();//making instance of new Account1
	if(account==3)
		System.exit(0);
	}while(true);
}
}
class Account1
{
	Account_1 acc=new Account_1();//initialising Account_1
	Scanner s=new Scanner(System.in);
	Account1()
	{
		int c;
		boolean condition=true;
		while(condition){
			System.out.println("Enter operation:\n1-open\n2-login\n3-pin\n4-deposit\n"
	           		+ "5-withdraw\n6-balance\n7-logout\n8-lock\n9-unlock"
	           		+"\n10-Exit");//printing options
			c=s.nextInt();
			switch(c)
			{
			case 1:System.out.println("Operation = open(String p,String y,String a)\n");//printing current operation
			System.out.println("Enter value of the parameter p");
			String p=s.next();
			System.out.println("Enter value of the parameter y");
			String y=s.next();
			System.out.println("Enter value of the parameter a");
			float a=s.nextFloat();
			acc.open(p, y, a);
			break;
			case 3:System.out.println("Operation = pin(String x)\nEnter Pin");//printing current operation
			acc.pin(s.next());
			break;
			case 2:System.out.println("Operation = login(String y)\nEnter ID");//printing current operation
			acc.login(s.next());
			break;
			case 4:System.out.println("Operation = deposit(float d)\nEnter Amount");//printing current operation
			acc.deposit(s.nextFloat());
			break;
			case 5:System.out.println("Operation = withdraw(float w)\nEnter Amount");//printing current operation
			acc.withdraw(s.nextFloat());
			break;
			case 6:System.out.println("Operation = balance()\n");//printing current operation
			acc.balance();
			break;
			case 7:System.out.println("Operation = logout()\n");//printing current operation
			acc.logout();
			break;
			case 8:System.out.println("Operation = lock()\nEnter Pin");//printing current operation
			acc.lock(s.next());
			break;
			case 9:System.out.println("Operation = unlock()\nEnter Pin");//printing current operation
			acc.unlock(s.next());
			break;
			case 10:System.out.println("Exit");condition=false;
			break;
			default:
				System.err.println("Invalid Input");//printing error in case of wrong input
			}
		}
	}
}
class Account2{
	Scanner s=new Scanner(System.in);
	Account2()
	{
		Account_2 acc=new Account_2();//initialising Account_1
		int c;
		boolean condition=true;
		while(condition){
			System.out.println("Enter operation:\n1-OPEN\n2-LOGIN\n3-PIN\n4-DEPOSIT\n"
		       		+ "5-WITHDRAW\n6-BALANCE\n7-LOGOUT\n8-suspend\n9-activate\n"
		       		+ "10-close\n11-Exit");//printing options
			c=s.nextInt();
			switch(c)
			{
			case 1:System.out.println("Operation = OPEN(int p,int y,int a)");//printing current operation
			System.out.println("Enter value of the parameter p");
			int p=s.nextInt();
			System.out.println("Enter value of the parameter y");
			int y=s.nextInt();
			System.out.println("Enter value of the parameter a");
			int a=s.nextInt();
			acc.OPEN(p, y, a);
			break;
			case 2:System.out.println("Operation = LOGIN(int y)\n");//printing current operation
			System.out.println("Enter ID");
			int x = s.nextInt();
			acc.LOGIN(x);
			break;
			case 3:System.out.println("Operation = PIN(int x)\nEnter Pin");//printing current operation
			acc.PIN(s.nextInt());
			break;
			case 4:System.out.println("Operation = DEPOSIT(int d)\n");//printing current operation
			System.out.println("Enter Amount");
			acc.DEPOSIT(s.nextInt());
			break;
			case 5:System.out.println("Operation = WITHDRAW(int w)\n");//printing current operation
			System.out.println("Enter Amount");
			acc.WITHDRAW(s.nextInt());
			break;
			case 6:System.out.println("Operation = BALANCE()\n");//printing current operation
			acc.BALANCE();
			break;
			case 7:System.out.println("Operation = LOGOUT()\n");//printing current operation
			acc.LOGOUT();
			break;
			case 8:System.out.println("Operation = suspend()");//printing current operation
			acc.suspend();
			break;
			case 9:System.out.println("Operation = activate()");//printing current operation
			acc.activate();
			break;
			case 10:System.out.println("Operation = close()");//printing current operation
			acc.close();
			break;
			case 11:System.out.println("Exit");condition=false;
			break;
			default:
				System.out.println("Invalid Input");//printing error in case of wrong input
			}
		}
		
	}
}