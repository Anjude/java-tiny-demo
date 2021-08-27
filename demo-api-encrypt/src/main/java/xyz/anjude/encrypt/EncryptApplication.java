package xyz.anjude.encrypt;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * EncryptApplication  TODO
 *
 * @author whr
 * @date 2021/8/27 15:53
 */
@MapperScan("xyz.anjude.**.mapper")
@SpringBootApplication
public class EncryptApplication {
    public static void main(String[] args) {
        SpringApplication.run(EncryptApplication.class, args);
    }
}
