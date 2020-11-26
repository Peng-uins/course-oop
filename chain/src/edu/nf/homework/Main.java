package edu.nf.homework;



/**
 * @author 0.0
 */
public class Main {

    public static void main(String[] args) {
        HttpServlertequest req = new HttpServlertequest();
        HttpServletResponse resp = new HttpServletResponse();
        //创建FilterChain
        FilterChain chain = new FilterChain();
        chain.doExecute(req,resp);
    }
}
