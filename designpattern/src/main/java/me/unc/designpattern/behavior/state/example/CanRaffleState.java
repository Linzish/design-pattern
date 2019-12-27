package me.unc.designpattern.behavior.state.example;

import java.util.Random;
import java.util.Set;

/**
 * 可以抽奖的状态
 */
public class CanRaffleState extends State {

    private RaffleActivity activity;

    public CanRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    //已经扣除了积分，不能再扣
    @Override
    public void deductMoney() {
        System.out.println("已经扣取了积分");
    }

    //可以抽奖，根据实际情况，改成新的状态
    @Override
    public boolean raffle() {
        System.out.println("正在抽奖，稍等！");
        Random r = new Random();
        int num = r.nextInt(10);
        //10%中奖机会
        if (num == 0) {
            // 改变活动状态为发放奖品
            activity.setState(activity.getDispenseState());
            return true;
        } else {
            System.out.println("很遗憾没有抽中奖品");
            //改变状态为不能抽奖
            activity.setState(activity.getNoRaffleState());
            return false;
        }
    }

    @Override
    public void dispensePrize() {
        System.out.println("没中奖，不能发放奖品");
    }
}
