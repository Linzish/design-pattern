package me.unc.designpattern.structure.composite.example;

/**
 * 组合模式示例
 * 编写程序展示一个学校院系结构：需求是这样，要在一个页面中展示出学校的院系组成，一个学校有多个学院， 一个学院有多个系。
 *
 * 传统方案解决学校院系展示存在的问题分析：
 * 1) 将学院看做是学校的子类，系是学院的子类，这样实际上是站在组织大小来进行分层次的
 * 2) 实际上我们的要求是 ：在一个页面中展示出学校的院系组成，一个学校有多个学院，一个学院有多个系，
 *  因此这种方案，不能很好实现的管理的操作，比如对学院、系的添加，删除，遍历等
 * 3) 解决方案：把学校、院、系都看做是组织结构，他们之间没有继承的关系，而是一个树形结构，可以更好的实现 管理操作。 => 组合模式
 *
 */
public class Client {
    public static void main(String[] args) {
        //从大到小创建对象
        //学校
        OrganizationComponent university = new University("清华大学", "世界一流大学");
        //学院
        OrganizationComponent computerCollege = new College("计算机学院", "计算机学院");
        OrganizationComponent infoEngineerCollege = new College("信息工程学院", "信息工程学院");

        //创建各个学院的系（专业）
        computerCollege.add(new Department("软件工程", "软件工程不错"));
        computerCollege.add(new Department("网络工程", "网络工程不错"));
        computerCollege.add(new Department("计算机科学与技术", "计算机科学与技术是老牌专业"));

        infoEngineerCollege.add(new Department("通信工程", "通信工程不好学"));
        infoEngineerCollege.add(new Department("信息工程", "信息工程很好学"));

        //将学院加入学校
        university.add(computerCollege);
        university.add(infoEngineerCollege);

        //按学校打印
        university.print();

        //按学院打印
        //computerCollege.print();
        //infoEngineerCollege.print();
    }
}
