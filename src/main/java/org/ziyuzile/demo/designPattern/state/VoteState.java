package org.ziyuzile.demo.designPattern.state;

public interface VoteState {
    void vote(VoteManager voteManager, String user, String voteItem);
}
