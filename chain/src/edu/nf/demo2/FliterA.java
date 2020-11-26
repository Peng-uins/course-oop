package edu.nf.demo2;

/**
 * @author 0.0
 */
@WebFilter(order = 1)
public class FliterA implements Filter {

    @Override
    public void doFilter(HttServlertequest req, HttServlerteResponse resp, FilterChain chain) {
        System.out.println("FilterA处理请求...");
        //FilterChain放行，将req和resp转到下一个过滤器中
        chain.doExecute(req,resp);
    }
}
