package proxy.jdk.staticProxy;

public class RealSubject implements Subject {

    private String name;

    @Override
    public void setName(String name) {
        System.out.println("Named " + name);
        this.name = name;
    }

    @Override
    public String getName() {
        System.out.println("Name is " + this.name);
        return this.name;
    }
}
