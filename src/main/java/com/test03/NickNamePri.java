package com.test03;

public class NickNamePri {
	
	private NickName nickName;
	
	public NickNamePri() {
		
	}

	public NickName getNickName() {
		return nickName;
	}

	public void setNickName(NickName nickName) {
		this.nickName = nickName;
	}

	@Override
	public String toString() {
		return "NickNamePri [nickName=" + nickName + "]";
	}		
}
