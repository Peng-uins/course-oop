package edu.nf.ocp;

public class Calculator {

    /**
     *
     * @param a 运算数a
     * @param b 运算数b
     * @param option 运算符
     * @return
     */
   /* public double cal(double a, double b ,String option){
        if("+".equals(option)){
            return a+b;
        }else if("-".equals(option)){
            return a-b;
        }else {
            return 0;
        }
    }*/

    /**
     * 单一的方法
     * @param a
     * @param b
     * @return
     */
    public double add(double a, double b){
        return a+b;
    }

    /**
     * 单一的方法
     * @param a
     * @param b
     * @return
     */
    public double sub(double a, double b){
        return a-b;
    }


}
