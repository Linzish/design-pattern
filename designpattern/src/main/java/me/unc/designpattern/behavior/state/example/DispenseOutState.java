package me.unc.designpattern.behavior.state.example;

/**
 * 奖品发放完毕的状态
 * 当 activity 改变成了 DispenseOutState，抽奖活动结束
 */
public class DispenseOutState extends State {

    private RaffleActivity activity;

    public DispenseOutState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("奖品发放完了，请下次在参与");
    }

    @Override
    public boolean raffle() {
        System.out.println("奖品发放完了，请下次在参与");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("奖品发放完了，请下次在参与");
    }
}
