package me.unc.designpattern.behavior.observer.improve;

/**
 * 显示当前天气情况（可以理解成事气象站自己的网站）
 */
public class CurrentConditions implements Observer {
    //温度，湿度，气压
    private float temperature;
    private float pressure;
    private float humidity;

    //更新天气情况，是由WeatherData来调用，是由推送模式
    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    //显示
    public void display() {
        System.out.println("***Today mTemperature: " + temperature + "***");
        System.out.println("***Today mPressure: " + pressure + "***");
        System.out.println("***Today mHumidity: " + humidity + "***");
    }

}
