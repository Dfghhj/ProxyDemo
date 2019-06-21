package proxy.jdk;

/**
 * @author ：dfghhj
 * @date ：Created in 2019/6/21 16:32
 * @description:
 */
public class Customer implements ICustomer {

    @Override
    public void buy(String s) {
        System.out.println("买了一件" + s);
    }
}
