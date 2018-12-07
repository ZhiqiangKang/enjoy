package org.ziyuzile.demo.designPattern.state;

public class NormalVoteState implements VoteState {

    @Override
    public void vote(VoteManager voteManager, String user, String voteItem) {
        // 正常投票，记录到投票记录中
        voteManager.getMapVote().put(user, voteItem);
        System.out.println("恭喜投票成功");
    }
}
