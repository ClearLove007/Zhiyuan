package aspect.xml;

import org.aspectj.lang.ProceedingJoinPoint;

public class Proxy_Class {

	public void before() {
		System.out.println("before");
	}

	public void after() {
		System.out.println("after");
	}
	
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("before");
		Object o = joinPoint.proceed();
		System.out.println("after");
		return o;
	}
	
	public void myAfter() {
		System.out.println("finally after");
	}
}
