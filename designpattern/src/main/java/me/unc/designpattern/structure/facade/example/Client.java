package me.unc.designpattern.structure.facade.example;

/**
 * 外观模式
 */
public class Client {
    public static void main(String[] args) {
        //创建外观类
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
        System.out.println("------------------------------");
        homeTheaterFacade.play();
        System.out.println("------------------------------");
        homeTheaterFacade.end();
    }
}
