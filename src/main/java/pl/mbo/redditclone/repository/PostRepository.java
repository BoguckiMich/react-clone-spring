package pl.mbo.redditclone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mbo.redditclone.model.Post;
import pl.mbo.redditclone.model.Subreddit;
import pl.mbo.redditclone.model.User;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
     List<Post> findAllBySubreddit(Subreddit subreddit);

     List<Post> findByUser(User user);
}
