package com.culnou.mumu.myway.domain.model;

import java.util.UUID;

import lombok.Data;

@Data
public class Vision {
	
	private String id;
	
	private String name;
	
	private String description;
	
	private VisionId visionId;
	
	
	public Vision(String name, String description){
		//自己カプセル化
		this.setName(name);
		this.setDescription(description);
		//識別子オブジェクトの作成
		//集約がファクトリメソッドでエンティティを生成する場合、ファクトリメソッドで識別子オブジェクトを生成する
		UUID uuid = UUID.randomUUID();
		this.visionId = new VisionId(uuid.toString());
	}
	
	protected void setName(String name) {
		if(name == null) {
			throw new IllegalArgumentException("The name may not be set to null.");
		}
		this.name = name;
	}
	
	protected void setDescription(String description) {
		if(description == null) {
			throw new IllegalArgumentException("The description may not be set to null.");
		}
		this.description = description;
	}

}
