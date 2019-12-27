package me.unc.designpattern.structure.proxy.cglibproxy;

/**
 * Cglib代理
 */
public class Client {
    public static void main(String[] args) {
        //创建代理对象
        TeacherDao target = new TeacherDao();
        //获取到代理对象，并且将目标对象传递给代理对象
        ProxyFactory proxyFactory = new ProxyFactory(target);
        //获取代理对象
        TeacherDao proxyInstance = (TeacherDao) proxyFactory.getProxyInstance();
        //执行代理对象的方法，触发 intercept 方法，从而实现 对目标对象的调用
        String s = proxyInstance.teach();
        System.out.println(s);
    }
}
