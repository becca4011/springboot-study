package springboot.book.dto;
import org.junit.Test;
import springboot.book.web.dto.HelloResponseDto;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {
    @Test
    public void 롬복_기능_테스트() {
        // given
        String name = "test";
        int amount = 1000;

        // when
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        // then
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
        // assertThat : 테스트 검증 라이브러리
        // isEqualTo : assertj의 동등 비교 메소드 (같을 때만 성공)
    }
}
