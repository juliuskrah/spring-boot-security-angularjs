package demo

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner

import com.jipasoft.boot.ResourceApplication;

@RunWith(SpringJUnit4ClassRunner)
@SpringApplicationConfiguration(classes = ResourceApplication)
@WebAppConfiguration
class ResourceApplicationTests {

	@Test
	void contextLoads() {
	}

}
