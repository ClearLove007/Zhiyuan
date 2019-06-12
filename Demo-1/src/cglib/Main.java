package cglib;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class Main {

	public static void main(String[] args) {
		Target targe = new Target();
		
		Proxy_Class proxy_Class = new Proxy_Class();
		
		//1.创建echancer
		Enhancer enhancer = new Enhancer();
		
		//2.设置父类
		enhancer.setSuperclass(Target.class);
		
		//3.设置回调函数（MethodInterceptor）
		enhancer.setCallback(new MethodInterceptor() {
			
			@Override
			public Object intercept(Object arg0, Method method, Object[] arg2, MethodProxy arg3) throws Throwable {
				// TODO 自动生成的方法存根
				proxy_Class.before();
				Object object = method.invoke(targe, args);
				proxy_Class.ater();
				
				return object;
			}
		});
		
		Target proxy = (Target) enhancer.create();
		
		proxy.addUser();
		proxy.deleteUser();
		proxy.updateUser();
	}
}
