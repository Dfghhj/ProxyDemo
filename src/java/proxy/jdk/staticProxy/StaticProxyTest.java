package proxy.jdk.staticProxy;

public class StaticProxyTest {

    public static void main(String[] args) {
        Subject subject = new ProxySubject();
        subject.setName("大大");
        System.out.println("=================");
        subject.getName();
    }

}
