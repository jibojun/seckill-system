package com.seckill.web.filter;

import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.util.ContentCachingRequestWrapper;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: Bojun Ji
 * @Description:
 * @Date: 2018/8/16_11:16 PM
 */
public final class HttpRequestFilter extends OncePerRequestFilter {

    /**
     * change request to use content caching request wrapper
     *
     * @param request
     * @param response
     * @param filterChain
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        ContentCachingRequestWrapper requestWrapper = new ContentCachingRequestWrapper(request);
        filterChain.doFilter(requestWrapper, response);
    }
}
