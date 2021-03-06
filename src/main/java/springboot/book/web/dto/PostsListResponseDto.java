package springboot.book.web.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import org.jetbrains.annotations.NotNull;
import springboot.book.domain.posts.Posts;

import java.time.LocalDateTime;

@Getter
public class PostsListResponseDto {
    private Long id;
    private String title;
    private String author;
    private LocalDateTime modifiedDate;

    public PostsListResponseDto(@NotNull Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.author = entity.getAuthor();
        this.modifiedDate = entity.getModifiedDate();
    }
}
