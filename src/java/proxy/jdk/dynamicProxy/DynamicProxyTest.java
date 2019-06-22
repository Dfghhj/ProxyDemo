package proxy.jdk.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxyTest {

    public static void main(String[] args) {
        Subject subject = new RealSubject();
        InvocationHandler bc = new PlaygroundInvocationHandler(subject, "打篮球");
        Subject bcProxy = (Subject) Proxy.newProxyInstance(subject.getClass().getClassLoader(),
                subject.getClass().getInterfaces(),
                bc);
        bcProxy.doSports("打篮球");
        try {
            bcProxy.doSports("踢足球");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("=========================");
        InvocationHandler ff = new PlaygroundInvocationHandler(subject, "踢足球");
        Subject ffProxy = (Subject) Proxy.newProxyInstance(subject.getClass().getClassLoader(),
                subject.getClass().getInterfaces(),
                ff);
        try {
            ffProxy.doSports("打篮球");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        ffProxy.doSports("踢足球");
    }
}
