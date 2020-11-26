package edu.nf.demo2;

/**
 * @author 0.0
 */
@WebFilter(order = 2)
public class FilterB implements Filter {
    @Override
    public void doFilter(HttServlertequest req, HttServlerteResponse resp, FilterChain chain) {
        System.out.println("FilterB处理请求...");
        //放行
        chain.doExecute(req,resp);
    }
}
