package edu.nf.demo2;

@WebFilter(order = 3)
public class FilterC implements Filter {
    @Override
    public void doFilter(HttServlertequest req, HttServlerteResponse resp, FilterChain chain) {
        System.out.println("FilterC处理请求...");
        //放行
        chain.doExecute(req,resp);
    }
}
