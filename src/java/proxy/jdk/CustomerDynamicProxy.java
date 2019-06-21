package proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author ：dfghhj
 * @date ：Created in 2019/6/21 16:37
 * @description:
 */
public class CustomerDynamicProxy implements InvocationHandler {

    private Object object;

    public CustomerDynamicProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("动态代理前置操作");
        method.invoke(object, args);
        System.out.println("动态代理后置操作");
        return null;
    }

    public static void main(String[] args) {
        ICustomer customer = new Customer();
        InvocationHandler invocationHandler = new CustomerDynamicProxy(customer);
        ICustomer proxy = (ICustomer) Proxy.newProxyInstance(
                customer.getClass().getClassLoader(),
                customer.getClass().getInterfaces(),
                invocationHandler);
        proxy.buy("裤子");
    }
}
