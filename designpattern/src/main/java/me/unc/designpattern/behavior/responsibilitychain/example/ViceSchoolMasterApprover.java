package me.unc.designpattern.behavior.responsibilitychain.example;

//副校长级别审批者
public class ViceSchoolMasterApprover extends Approver {

    public ViceSchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getPrice() > 1000 && request.getPrice() <= 30000) {
            System.out.println("请求编号 id = " + request.getId() + " 被 " +
                    this.name + " 处理 ");
        } else {
            //处理金额不在权限范围内
            //将请求传给下一个处理者
            approver.processRequest(request);
        }
    }
}
