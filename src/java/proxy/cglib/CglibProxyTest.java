package proxy.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * @author ：feifeng
 * @date ：Created in 2019/12/5 17:08
 * @description:
 */
public class CglibProxyTest {

    public static void main(String[] args) {
        CglibProxy proxy = new CglibProxy(new RealSubject());
        Enhancer enhancer = new Enhancer();
        //设置父类,因为Cglib是针对指定的类生成一个子类，所以需要指定父类
        enhancer.setSuperclass(RealSubject.class);
        enhancer.setCallback(proxy);// 设置回调
        RealSubject result = (RealSubject)enhancer.create();//创建并返回代理对象
        result.say("hahaha");
    }

}
