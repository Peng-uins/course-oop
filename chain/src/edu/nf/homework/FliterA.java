package edu.nf.homework;

/**
 * @author 0.0
 */
@Bean("FliterA")
public class FliterA implements Filter {
    @Override
    public void doFilter(HttpServlertequest req, HttpServletResponse resp, FilterChain chain) {
        System.out.println("FilterA处理请求...");
        //FilterChain放行，将req和resp转到下一个过滤器中
        chain.doExecute(req,resp);
    }
}
