package app.aop.proxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 *  CGLib 提供的代理生成器
 */
public class CGLibLoveProxyGenerator implements MethodInterceptor {
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {

        System.out.println("你好啊，我是一个代理，帮你传个小姑娘的纸条：");
        // 调用原方法
        Object result = proxy.invokeSuper(obj, args);

        System.out.println("你们其实挺适合的。在一起就加油哦.");

        return result;

    }
}
