package com.test04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="nick")
public class NickNamePri {
	
	@Autowired
	private NickName a;

	public NickNamePri() {		
	}
	
	
	public NickName getA() {
		return a;
	}

	public void setA(NickName a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "NickNamePri [a=" + a + "]";
	}
	
	
}
