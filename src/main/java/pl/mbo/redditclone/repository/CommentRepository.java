package pl.mbo.redditclone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mbo.redditclone.model.Comment;
import pl.mbo.redditclone.model.Post;
import pl.mbo.redditclone.model.User;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findByUser(User user);
}
