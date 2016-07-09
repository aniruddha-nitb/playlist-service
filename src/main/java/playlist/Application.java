package playlist;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class Application {

	@Bean
	JdbcTemplate jdbcTemplate(DataSource dataSource) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
//		log.info("Creating tables");
//		jdbcTemplate.execute("drop table BOOKINGS if exists");
//		jdbcTemplate.execute("create table BOOKINGS("
//				+ "ID serial, FIRST_NAME varchar(5) NOT NULL)");
		return jdbcTemplate;
	}
	
	@Bean
	TrackService trackService() {
		return new TrackService();
	}
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
