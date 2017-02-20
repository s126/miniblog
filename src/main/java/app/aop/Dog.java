package app.aop;

public class Dog implements Animal {
    @Override
    public void sayLove() {
        System.out.println("我爱你，小黑");
    }
}
