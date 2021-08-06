package ifsp.lp3a5.mars;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class MarsApplication {

	public static void main(String[] args) {
		Logger log = LoggerFactory.getLogger(MarsApplication.class);
		SpringApplication.run(MarsApplication.class, args);
		log.info("### Application Runnning ###");
	}

}
