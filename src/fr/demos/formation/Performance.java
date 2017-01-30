package fr.demos.formation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;

public class Performance {

	public Object tracePerf(ProceedingJoinPoint pjp) throws Throwable {
		long debut = System.currentTimeMillis();
		System.out.println("begin " + pjp.getSignature() + " at :" + System.currentTimeMillis());
		Object o = pjp.proceed();
		System.out.println("end " + pjp.getSignature() + " at :" + (System.currentTimeMillis() - debut));
		return o;
	}

}
