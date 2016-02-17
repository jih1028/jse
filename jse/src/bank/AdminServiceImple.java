package bank;

public class AdminServiceImple implements AdminService{

	AccountBean account = new AccountBean();
	int count = 0; //멤버변수지만 초기값이 필요한 경우에는 줄 수 있다.
	
	@Override
	public String open(String name, int password) {
		// 1. 통장개설
		
		account.setName(name);
		account.setPassword(password);
		
		
		return account.toString();
	}
	
	@Override
	public int countAll() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String searchAccountByAccountNo(int accountNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountBean[] searchAccountByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String closeAccount(int accountNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int searchCountByName(String name) {
		// TODO Auto-generated method stub
		return 0;
	}

}
