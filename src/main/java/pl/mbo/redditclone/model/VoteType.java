package pl.mbo.redditclone.model;

public enum VoteType {
    UPVITE(1),
    DOWNVOTE(-1);

    VoteType(int direction){};
}
