package org.ziyuzile.demo.designPattern.state;

import java.util.HashMap;
import java.util.Map;

public class VoteManager {

    // 持有状体处理对象
    private VoteState voteState;

    // 记录用户投票的结果，Map<用户名称，投票的选项>
    private Map<String,String> voteMap = new HashMap<String,String>();

    // 记录用户投票次数，Map<用户名称，投票的次数>
    private Map<String,Integer> voteCountMap = new HashMap<String,Integer>();

    public Map<String, String> getMapVote() {
        return voteMap;
    }

    public void vote(String user, String voteItem) {

        // 1.为该用户增加投票次数
        // 从记录中取出该用户已有的投票次数
        Integer voteCount = voteCountMap.get(user);
        voteCount = voteCount == null ? 1 : (voteCount + 1);

        voteCountMap.put(user, voteCount);

        // 2.判断该用户的投票类型，就相当于判断对应的状态
        // 到底是正常投票、重复投票、恶意投票还是上黑名单的状态
        if(voteCount == 1){
            voteState = new NormalVoteState();
        } else if(voteCount > 1 && voteCount < 5){
            voteState = new RepeatVoteState();
        } else if(voteCount >= 5 && voteCount < 8){
            voteState = new SpiteVoteState();
        } else if(voteCount >= 8){
            voteState = new BlackVoteState();
        }

        voteState.vote(this, user, voteItem);
    }
}
