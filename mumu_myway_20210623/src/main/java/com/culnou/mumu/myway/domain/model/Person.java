package com.culnou.mumu.myway.domain.model;

import lombok.Data;

@Data
public class Person {
	private String purpose;
	
	//個人は、個人が実現したい生きる目的を設定することができる。2021/6/24
	protected void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	
	public String getPurpose() {
		return purpose;
	}

}
