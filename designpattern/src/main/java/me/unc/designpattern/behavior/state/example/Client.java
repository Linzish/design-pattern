package me.unc.designpattern.behavior.state.example;

/**
 * 状态模式
 */
public class Client {
    public static void main(String[] args) {
        //创建活动对象，奖品只有一个
        RaffleActivity activity = new RaffleActivity(1);

        //我们连续抽3次
        for (int i = 0; i < 20; i++) {
            System.out.println("--------第" + (i + 1) + "次抽奖----------");
            // 参加抽奖，第一步点击扣除积分
            activity.deductMoney();
            //第二步抽奖
            activity.raffle();
        }
    }
}
