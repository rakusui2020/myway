package com.culnou.mumu.myway.domain.model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PersonTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/*
	 * 個人は、個人が実現したい生きる目的を設定することができる。2021/6/24
	 */
	@Test
	public void testSetPurpose() {
		Person person = new Person();
		person.setPurpose("This is my purpose.");
		assertEquals("This is my purpose.", person.getPurpose());
	}
	
	
	/*
	 * 個人は、目的の到達点であるビジョンを設定することができる。2021/6/25
	 */
	//ビジョン設定のテスト
	@Test
	public void testCreateVision() {
		String name;
		String description;
		Vision vision;
		name = "my vision";
		description = "my vision";
		vision = new Vision(name, description);
		System.out.println("*** visionId " + vision.getVisionId().getId());
		assertEquals(name, vision.getName());
		assertEquals(description, vision.getDescription());
		assertNotNull(vision.getVisionId());
	}
	//自己カプセル化のセッターの例外テスト：NULLを防いで正しく初期化できる
	@Test(expected = IllegalArgumentException.class)
	public void testSetName() {
		String name;
		String description;
		Vision vision;
		name = null;
		description = "my vision";
		vision = new Vision(name, description);
	}
	//自己カプセル化のセッターの例外テスト：NULLを防いで正しく初期化できる
	@Test(expected = IllegalArgumentException.class)
	public void testSetDescription() {
		String name;
		String description;
		Vision vision;
		name =  "my vision";
		description = null;
		vision = new Vision(name, description);
	}
	
	
	
		

}
