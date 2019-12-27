package me.unc.designpattern.behavior.observer.weatherinterface;

/**
 * 观察者模式
 * 气象站设计方案1-普通方案
 */
public class Client {
    public static void main(String[] args) {
        //创建接入方
        CurrentConditions currentConditions = new CurrentConditions();
        //创建WeatherData，并将接入方currentConditions传递到创建WeatherData
        WeatherData weatherData = new WeatherData(currentConditions);
        //更新天气情况
        weatherData.setData(30, 150, 40);

        //天气情况变化
        System.out.println("=============天气情况变化===========");
        weatherData.setData(40, 160, 20);
    }
}
