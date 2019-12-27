package me.unc.designpattern.structure.proxy.staticproxy;

//静态代理对象
public class TeacherDaoProxy implements ITeacherDao {

    private ITeacherDao target;  //代理目标对象，通过接口来聚合

    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("代理对象开始代理....（某些开始操作）");  //模拟开始操作
        target.teach();
        System.out.println("代理结束....");   //模拟结束操作
    }
}
