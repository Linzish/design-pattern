package me.unc.designpattern.behavior.visitor.example;

public class Wait extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println(" 男人给的评价该歌手为待定 !");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println(" 女人给的评价该歌手为待定 !");
    }
}
