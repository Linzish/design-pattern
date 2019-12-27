package me.unc.designpattern.behavior.responsibilitychain.example;

//审批者抽象类
public abstract class Approver {

    protected Approver approver;  //下一个处理者

    protected String name;  //名字

    public Approver(String name) {
        this.name = name;
    }

    //下一个处理者
    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    //处理审批请求的方法，得到一个请求，由子类实现
    public abstract void processRequest(PurchaseRequest request);

}
