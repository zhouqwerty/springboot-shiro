package com.qwerty.study.shiro;

import com.qwerty.study.shiro.realm.MyShiroRealm;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShiroApplicationTests {

	@Autowired
	private MyShiroRealm myShiroRealm;

	@Test
	public void contextLoads() {
//		System.out.println(new MyShiroRealm().getUserInfoService());
	}

}
