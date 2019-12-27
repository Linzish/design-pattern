package me.unc.designpattern.behavior.observer.improve;

//观察者接口，由观察者来实现
public interface Observer {

    void update(float temperature, float pressure, float humidity);

}
