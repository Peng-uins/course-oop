package edu.nf.demo2;

/**
 * @author 0.0
 */
public class Main {

    public static void main(String[] args) {
        HttServlertequest req = new HttServlertequest();
        HttServlerteResponse resp = new HttServlerteResponse();
        //创建FilterChain
        FilterChain chain = new FilterChain();
        chain.doExecute(req,resp);
    }
}
