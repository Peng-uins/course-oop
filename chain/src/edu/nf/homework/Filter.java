package edu.nf.homework;



/**
 * @author 0.0
 */
public interface Filter {

    void doFilter(HttpServlertequest req , HttpServletResponse resp, FilterChain chain);
}
