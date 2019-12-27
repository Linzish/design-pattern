package me.unc.designpattern.behavior.observer.improve;

import java.util.ArrayList;
import java.util.List;

/**
 * 核心类
 * 1.包含最新的天气情况信息
 * 2.含有C观察者对象，是由ArrayList管理
 * 3.当数据更新时，就主动调用ArrayList，这样他们（接入方）就看到最新的信息
 */
public class WeatherData implements Subject {

    private float temperature;
    private float pressure;
    private float humidity;
    private List<Observer> observers;

    //如果需要添加新的第三方需要再组合

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    //当数据有更新时，就调用setData
    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        //将最新的信息推送给接入方
        dataChange();
    }

    public void dataChange() {
        //调用接入方的update
        notifyObservers();
    }

    //注册一个观察者
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    //移除一个观察者
    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    //遍历所有观察者，并通知
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(getTemperature(), getPressure(), getHumidity());
        }
    }
}
