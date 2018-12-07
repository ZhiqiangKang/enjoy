package org.ziyuzile.demo.designPattern.state;

public class RepeatVoteState implements VoteState {

    @Override
    public void vote(VoteManager voteManager, String user, String voteItem) {
        // 重复投票，暂时不做处理
        System.out.println("请不要重复投票");
    }
}
