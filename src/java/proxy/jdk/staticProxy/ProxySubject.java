package proxy.jdk.staticProxy;

public class ProxySubject implements Subject {

    private Subject subject = new RealSubject();

    @Override
    public void setName(String name) {
        System.out.println("setName --- 前置操作");
        subject.setName(name);
        System.out.println("setName --- 后置操作");
    }

    @Override
    public String getName() {
        System.out.println("getName --- 前置操作");
        String name = subject.getName();
        System.out.println("getName --- 后置操作");
        return name;
    }
}
