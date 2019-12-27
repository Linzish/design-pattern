package me.unc.designpattern.behavior.observer.improve;

/**
 * 观察者模式
 * 观察者模式解决天气预报需求
 * 如果需要添加观察者，只需要在实现接口增加一个，再注册到WeatherData
 */
public class Client {
    public static void main(String[] args) {
        //创建一个WeatherData
        WeatherData weatherData = new WeatherData();
        //创建一个观察者
        CurrentConditions currentConditions = new CurrentConditions();
        weatherData.registerObserver(currentConditions);

        System.out.println("通知各个注册的观察者，看看信息");
        //更新天气情况
        weatherData.setData(30, 150, 40.9f);

        //天气情况变化
        System.out.println("=============天气情况变化===========");
        weatherData.setData(40, 160, 20);

        System.out.println("=============百度加入群聊===========");
        //添加观察者
        BaiduSite baiduSite = new BaiduSite();
        weatherData.registerObserver(baiduSite);
        weatherData.setData(30.3f, 110, 20);

        //测试移除观察者
        System.out.println("============= currentConditions 退出群聊===========");
        weatherData.removeObserver(currentConditions);
        weatherData.setData(30.3f, 110, 43.2f);
    }
}
