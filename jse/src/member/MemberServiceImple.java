package member;

import bank.AccountBean;

public class MemberServiceImple implements MemberService{

	MemberBean member;
	
	public MemberServiceImple() {
		member = new MemberBean();
	}
	


	private int count = 0;
	

	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	private MemberBean[] memberList = new MemberBean[100];
	public String join(MemberBean member) {
		// 회원가입

		memberList[count] = new MemberBean();
		memberList[count].setUserid(member.getUserid());
		memberList[count].setName(member.getName());
		memberList[count].setPassword(member.getPassword());
		memberList[count].setAddr(member.getAddr());
		memberList[count].setBirth(member.getBirth());
		
		return memberList[count++].toString();
	}


	public MemberBean searchById(String id) {
		// 아이디로 회원정보 검색
		MemberBean member = null;
		for (int i = 0; i < this.getCount(); i++) {
			if(memberList[i].getUserid().equals(id)){
				member = memberList[i];
			}
		}
		
		return member;
	}


	public MemberBean[] searchByName(String name) {
		//3. 이름으로 회원 정보 조회
		MemberBean[] tempMember = null;
		int j=0;
		int tempCount = this.searchCountByName(name);
		MemberBean[] tempList = new MemberBean[tempCount];
		for (int i = 0; i < this.getCount(); i++) {
			if(name.equals(memberList[i].getName())){
				tempList[j] = memberList[i];
				j++;
			}
		}
		
		return tempList;
	}


	public String remove(String id) {
		String result ="";
		
		for (int i = 0; i < this.getCount(); i++) {
			if(id.equals(memberList[i].getUserid()) ){
				memberList[i] = memberList[this.getCount()-1];
				memberList[this.getCount()-1] = null;
				this.setCount(getCount()-1);
				result = "삭제성공";
			}
			else{
				result = "해당 멤버 없음";
		
			}
		}	
		return result;
	}


	public int countAll() {
		//전체 멤버수 조회
		return this.getCount();
	}


	public int searchCountByName(String name) {
		// 이름으로 아이디 수 조회( 3번 기능을 수행하기 위해 필요한 메소드)
		int tempCount = 0;
		for (int i = 0; i < this.getCount(); i++) {
			if(name.equals(memberList[i].getName())){
				tempCount++;
			}
		}
		return tempCount;
	}


	
	@Override
	public String login(String userId, String password) {
		// 로그인
		return null;
	}

	@Override
	public String update(MemberBean member) {
		// 정보수정
		return null;
	}

}
