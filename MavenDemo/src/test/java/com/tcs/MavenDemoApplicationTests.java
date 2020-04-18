package com.tcs;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MavenDemoApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	public void testMain() {
		MavenDemoApplication app = new MavenDemoApplication();
		app.main(new String[] {});
	}

}
