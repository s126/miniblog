package app.aop.proxy;

import app.aop.Girl;
import app.aop.Person;

/**
 * 媒婆，爱的传递者
 */
public class LoveProxy implements Person {

    Girl z = null;

    public LoveProxy(Girl g) {
        this.z = g;
    }

    @Override
    public void sayLove() {
        z.sayLove();
        System.out.println("我们在一起吧。");
    }
}
