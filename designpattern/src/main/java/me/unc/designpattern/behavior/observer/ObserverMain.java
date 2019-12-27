package me.unc.designpattern.behavior.observer;

/**
 * 观察者模式
 *
 * 问题引入：天气预报项目需求
 * 1) 气象站可以将每天测量到的温度，湿度，气压等等以公告的形式发布出去(比如发布到自己的网站或第三方)。
 * 2) 需要设计开放型 API，便于其他第三方也能接入气象站获取数据。
 * 3) 提供温度、气压和湿度的接口
 * 4) 测量数据更新时，要能实时的通知给第三方
 *
 * 天气预报设计方案 1-普通方案
 * @see me.unc.designpattern.behavior.observer.weatherinterface.Client
 *  问题分析
 * 1) 其他第三方接入气象站获取数据的问题
 * 2) 无法在运行时动态的添加第三方 (新浪网站)
 * 3) 违反 ocp 原则=>观察者模式 。在 WeatherData 中，当增加一个第三方，都需要创建一个对应的第三方的公告板对象，
 *  并加入到 dataChange, 不利于维护，也不是动态加入
 *
 * 观察者模式原理
 * 1) 观察者模式类似订牛奶业务
 * 2) 奶站/气象局：Subject
 * 3) 用户/第三方网站：Observer
 *
 * 角色分析：
 *  Subject：登记注册、移除和通知
 *  1) registerObserver 注 册
 *  2) removeObserver 移 除
 *  3) notifyObservers() 通知所有的注册的用户，根据不同需求，可以是更新数据，让用户来取，
 *   也可能是实施推送， 看具体需求定
 *  Observer：接收输入
 *  观察者模式：对象之间多对一依赖的一种设计方案，被依赖的对象为 Subject，依赖的对象为 Observer，
 *  Subject 通知 Observer 变化,比如这里的奶站是 Subject，是 1 的一方。用户时 Observer，是多的一方。
 *
 * 观察者模式解决天气预报需求
 * @see me.unc.designpattern.behavior.observer.improve.Client
 *
 * 观察者模式的好处
 * 1) 观察者模式设计后，会以集合的方式来管理用户(Observer)，包括注册，移除和通知。
 * 2) 这样，我们增加观察者(这里可以理解成一个新的公告板)，就不需要去修改核心类 WeatherData
 *  不会修改代 码， 遵守了 ocp 原则。
 *
 * 观察者模式在 Jdk 应用
 * 模式角色分析：
 *  Observable 的作用和地位等价于 我们前面讲过 Subject
 *  Observable 是类，不是接口，类中已经实现了核心的方法 ,即管理 Observer 的方法 add.. delete .. notify...
 *  Observer 的作用和地位等价于我们前面讲过的 Observer, 有 update
 *  Observable 和 Observer 的使用方法和前面讲过的一样，只是 Observable 是类，通过继承来实现观察者模式
 *
 */
public class ObserverMain {
}
