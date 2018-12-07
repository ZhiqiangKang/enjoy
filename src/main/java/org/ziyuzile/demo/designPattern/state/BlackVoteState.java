package org.ziyuzile.demo.designPattern.state;

public class BlackVoteState implements VoteState {

    @Override
    public void vote(VoteManager voteManager, String user, String voteItem) {
        // 记录黑名单中，禁止登录系统
        System.out.println("进入黑名单，将禁止登录和使用本系统");
    }
}
