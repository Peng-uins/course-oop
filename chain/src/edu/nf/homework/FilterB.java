package edu.nf.homework;



/**
 * @author 0.0
 */
@Bean("FilterC")
public class FilterB implements Filter {
    @Override
    public void doFilter(HttpServlertequest req, HttpServletResponse resp, FilterChain chain) {
        System.out.println("FilterB处理请求...");
        //放行
        chain.doExecute(req,resp);
    }
}
