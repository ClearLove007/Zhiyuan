package spring_banzidong_daili;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class Proxy_Class implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		// TODO �Զ����ɵķ������
		System.out.println("qian");
		Object object = methodInvocation.proceed();
		System.out.println("hou");
		
		return object;
	}

}
