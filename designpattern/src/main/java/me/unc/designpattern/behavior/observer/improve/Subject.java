package me.unc.designpattern.behavior.observer.improve;

//发布接口， 让WeatherData来实现
public interface Subject {

    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();

}
