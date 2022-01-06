package springboot.book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import static org.springframework.boot.SpringApplication.run;
import static org.springframework.boot.autoconfigure.SpringBootApplication.*;

@EnableJpaAuditing // JPA Auditing 활성화
@SpringBootApplication // 스프링부트 자동 설정, 스프링 Bean 읽기&생성 자동 설정
public class Application { // 메인 클래스
    public static void main(String[] args) {
        run(Application.class, args);
    }
}
