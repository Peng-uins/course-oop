package edu.nf.demo1;

/**
 * @author 0.0
 * 直接主管，审批限额为2000元
 */
public class HandlerA extends AbstractHandler {

    @Override
    public void execute(int money) {
            //2000元内直接审批通过，否则交给下一个审批人
            if(money<=2000){
                System.out.println("主管审批通过");
            }else{
                //获取下一个审批人,现判断有没有审批人
                if(getHandler()!=null){
                    getHandler().execute(money);
                }
            }
    }
}
