package app.aop.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 定义我们的代理器，它的作用是在运行的时候，生产适当的代理
 */
public class JDKLoveProxyGenerator implements InvocationHandler {

    Object z = null;

    public JDKLoveProxyGenerator(Object g) {
        this.z = g;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 用反射的方式，调用 z 里的原方法
        Object result = method.invoke(z, args);
        System.out.println("你们真的能够在一起。");
        return result;
    }
}
