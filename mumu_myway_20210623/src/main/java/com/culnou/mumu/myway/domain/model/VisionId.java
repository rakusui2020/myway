package com.culnou.mumu.myway.domain.model;

import java.io.Serializable;

public final class VisionId implements Serializable, Cloneable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String id;
	
	public VisionId(String id) {
		//自己カプセル化する。
		this.setId(id);
	}
	
	protected void setId(String id) {
		if(id == null) {
			throw new IllegalArgumentException("The id may not be set to null.");
		}
		this.id = id;
	}
	
	//副作用のないメソッド。
	public String getId() {
		return this.id;
	}

}
