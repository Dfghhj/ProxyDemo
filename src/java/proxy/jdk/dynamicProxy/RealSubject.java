package proxy.jdk.dynamicProxy;

public class RealSubject implements Subject {

    @Override
    public void doSports(String sportName) {
        System.out.println("开始：" + sportName);
    }

}
