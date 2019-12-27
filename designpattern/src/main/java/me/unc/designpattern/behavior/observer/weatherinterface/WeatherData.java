package me.unc.designpattern.behavior.observer.weatherinterface;

/**
 * 核心类
 * 1.包含最新的天气情况信息
 * 2.含有CurrentConditions 对象
 * 3.当数据更新时，就主动调用CurrentConditions对象update方法（含display），这样他们（接入方）就看到最新的信息
 */
public class WeatherData {

    private float temperature;
    private float pressure;
    private float humidity;
    private CurrentConditions currentConditions;

    //如果需要添加新的第三方需要再组合

    public WeatherData(CurrentConditions currentConditions) {
        this.currentConditions = currentConditions;
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
        currentConditions.update(getTemperature(), getPressure(), getHumidity());
    }
}
