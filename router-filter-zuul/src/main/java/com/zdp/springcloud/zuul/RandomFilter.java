package com.zdp.springcloud.zuul;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

/**
 * @author <a href="mailto:zhoudapeng8888@126.com">zhoudapeng</a>
 * Date 2018/6/6
 * Time 下午2:59
 */
@Component
public class RandomFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        try {
            RequestContext context = RequestContext.getCurrentContext();
            if (System.currentTimeMillis() % 2 == 0) {
                context.setSendZuulResponse(false);
                context.setResponseStatusCode(500);
                context.setResponseBody("something is wrong!");
            }
        }catch (Exception e) {
        }
        return null;

    }
}
