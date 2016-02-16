package bank;

import java.util.Scanner;

public class AccountMain {
	public static void main(String[] args) {
		
		String name="";
		int password=0;
		
		System.out.println("이름? 비번? ");
		Scanner scanner= new Scanner(System.in);
		name=scanner.next();
		password= scanner.nextInt();
		AccountService  acc = new AccountServiceImple();
		System.out.println(acc.open(name, password));
		System.out.println(acc.deposit(1000));
		System.out.println(acc.deposit(1000));
		System.out.println(acc.withdraw(1500));
		System.out.println(acc.withdraw(1500));
		
		System.out.println(acc.search());
		
	}
}
