package springboot.book.web;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import springboot.book.web.dto.HelloResponseDto;

@RestController // 컨트롤러를 JSON을 반환하는 컨트롤러로 만들어줌
public class HelloController {
    @GetMapping("/hello") // Get 요청을 받을 수 있는 API를 만들어줌
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name, @RequestParam("amount") int amount) {
        return new HelloResponseDto(name, amount);
    }
    // @RequestParam : 외부에서 API로 넘긴 파라미터를 가져오는 이노데이션 (@RequestParam("name")으로 넘긴 파라미터를 String name에 저장)
}
