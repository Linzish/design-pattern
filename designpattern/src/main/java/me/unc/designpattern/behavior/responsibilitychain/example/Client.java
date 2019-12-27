package me.unc.designpattern.behavior.responsibilitychain.example;

/**
 * 责任链模式
 */
public class Client {
    public static void main(String[] args) {
        //创建一个请求
        PurchaseRequest request = new PurchaseRequest(1, 20300f, 1);

        //创建相关审批人
        DepartmentApprover departmentApprover = new DepartmentApprover("张主任");
        CollegeApprover collegeApprover = new CollegeApprover("李院长");
        ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("王副校");
        SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("刘校长");


        //创建责任链
        //需要将各个审批级别的下一个设置好 (处理人构成环形: )
        departmentApprover.setApprover(collegeApprover);
        collegeApprover.setApprover(viceSchoolMasterApprover);
        viceSchoolMasterApprover.setApprover(schoolMasterApprover);

        schoolMasterApprover.setApprover(departmentApprover);

        //提交请求
        departmentApprover.processRequest(request);
//        schoolMasterApprover.processRequest(request);

    }
}
