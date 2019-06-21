package proxy.jdk;

/**
 * @author ：dfghhj
 * @date ：Created in 2019/6/21 16:34
 * @description:
 */
public class CustomerStaticProxy implements ICustomer {

    private ICustomer customer = new Customer();

    @Override
    public void buy(String s) {
        System.out.println("静态代理前置操作");
        customer.buy(s);
        System.out.println("静态代理后置操作");
    }

    public static void main(String[] args) {
        CustomerStaticProxy customerStaticProxy = new CustomerStaticProxy();
        customerStaticProxy.buy("衣服");
    }
}
