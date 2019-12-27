package me.unc.designpattern.structure.proxy.dynamicproxy;

/**
 * JDK动态代理
 */
public class Client {
    public static void main(String[] args) {
        //创建目标对象
        ITeacherDao target = new TeacherDao();

        //给目标对象，创建代理对象，可以转成接口
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(target).getProxyInstance();

        //内存中会动态生成代理对象 com.sun.proxy.$Proxy0
        System.out.println("proxyInstance = " + proxyInstance.getClass());

        //通过代理对象，调用目标对象
        //proxyInstance.teach();
        proxyInstance.sayHello("cxk");
    }
}
