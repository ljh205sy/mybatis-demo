package tk.mybatis.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tk.mybatis.springboot.mapper.CountryMapper;

/**
 * Spring Boot 启动类
 * 如果不扫描model，那么添加了接口的注解@Mapper也可以使用，因为在application.properties中已经定义了mybatis.mapper-locations
 */
@SpringBootApplication(scanBasePackages= {"tk.mybatis.springboot.controller",
		"tk.mybatis.springboot.service"})
//@MapperScan(value = { 
//		"tk.mybatis.springboot.mapper", 
//		"tk.mybatis.simple.mapper" 
//	},
//	nameGenerator = MapperNameGenerator.class
//)

/**
 * 要么使用@Mapper 进行注解接口，要么使用@MapperScan进行扫描（二者选其一）
 * @author wh1107066
 *
 */

public class Application implements CommandLineRunner {

	@Autowired
	private CountryMapper countryMapper;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		countryMapper.selectAll();
	}

}
