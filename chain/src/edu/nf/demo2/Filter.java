package edu.nf.demo2;

import com.sun.deploy.net.HttpRequest;

/**
 * @author 0.0
 */
public interface Filter {

    /**
     *
     * @param req 请求对象
     * @param resp 响应对象
     * @param chain 整个过滤链维护者，它提供一个doExecute方法，将请求放行，然后自动找出下一个过滤器
     *              继续处理请求
     */
    void doFilter(HttServlertequest req,HttServlerteResponse resp,FilterChain chain);

}
