package me.unc.designpattern.structure.flyweight.example;

import java.util.HashMap;
import java.util.Map;

// 网站工厂类，根据需要返回压一个网站
public class WebSiteFactory {

    //集合， 充当池的作用
    private Map<String, ConcreteWebSite> pool = new HashMap<>();

    //根据网站的类型，返回一个网站, 如果没有就创建一个网站，并放入到池中,并返
    public WebSite getWebSiteCategory(String type) {
        //创建一个网站，并放入到池中
        if(!pool.containsKey(type)) {
            pool.put(type, new ConcreteWebSite(type));
        }
        //类型不同是才会创建i新的实例，并放入map
        return pool.get(type);
    }

    //获取网站分类的总数 (池中有多少个网站类型)
    public int getWebSiteCount() {
        return pool.size();
    }

}
