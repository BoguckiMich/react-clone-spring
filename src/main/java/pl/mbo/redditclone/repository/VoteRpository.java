package pl.mbo.redditclone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mbo.redditclone.model.Post;
import pl.mbo.redditclone.model.User;
import pl.mbo.redditclone.model.Vote;

import java.util.Optional;

public interface VoteRpository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}
