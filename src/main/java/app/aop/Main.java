package app.aop;

import app.aop.proxy.CGLibLoveProxyGenerator;
import app.aop.proxy.JDKLoveProxyGenerator;
import net.sf.cglib.proxy.Enhancer;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        // JDK 动态代理的使用
        Person loveProxy = (Person) Proxy.newProxyInstance(
                Girl.class.getClassLoader(),
                Girl.class.getInterfaces(),
                new JDKLoveProxyGenerator(new Girl())
        );

        loveProxy.sayLove();


        System.out.println("--------------------");


        // CGLib 动态代理的使用
        Enhancer enhancer = new Enhancer();
        enhancer.setClassLoader(Dog.class.getClassLoader());
        enhancer.setSuperclass(Dog.class);
        enhancer.setCallback(new CGLibLoveProxyGenerator());

        Dog dogProxy = (Dog) enhancer.create();

        dogProxy.sayLove();
    }
}
