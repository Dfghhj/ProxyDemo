package proxy.jdk.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PlaygroundInvocationHandler implements InvocationHandler {

    private String canDo;

    private Object object;

    public PlaygroundInvocationHandler(Object object, String canDo) {
        this.object = object;
        this.canDo = canDo;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String willDo = null;
        if (args != null && args.length > 0) {
            willDo = (String) args[0];
        }
        if (canDo.equals(willDo)) {
            return method.invoke(object, args);
        }
        throw new RuntimeException("该场地不允许" + willDo);
    }
}
