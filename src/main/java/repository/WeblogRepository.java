package repository;

import model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeblogRepository extends JpaRepository<Post, Long> {

}
