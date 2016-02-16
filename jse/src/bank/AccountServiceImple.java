package bank;

import java.util.Scanner;

public class AccountServiceImple implements AccountService{

	AccountBean account = new AccountBean();
	
	
	@Override
	public String open(String name, int password) {
		// 1. 통장개설
		
		account.setName(name);
		account.setPassword(password);
		
		
		return account.toString();
	}

	@Override
	public String deposit(int money) {
		
		
		int totalMoney = account.getMoney()+money;
		account.setMoney(totalMoney);
		
		// 2. 입금
		return account.toString();
	}

	@Override
	public String withdraw(int money) {

		if(account.getMoney() >= money){
			int totalMoney = account.getMoney()-money;
			account.setMoney(totalMoney);
			return account.toString();
		}else{
			return "잔액부족";
		}
		// 3. 출금
		
	}

	@Override
	public String search() {
		// 4. 조회
		return account.toString();
	}


}
