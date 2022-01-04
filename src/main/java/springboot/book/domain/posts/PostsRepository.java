package springboot.book.domain.posts;
import org.springframework.data.jpa.repository.JpaRepository;

// Entity Repository (Entity 클래스와 같은 위치에 있어야 함)
public interface PostsRepository extends JpaRepository<Posts, Long> {
}
