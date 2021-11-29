package yuhan.mvc.aop1;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {
	
	public Object loggerAop(ProceedingJoinPoint joinPoint) throws Throwable {
		
		String signatureStr = joinPoint.getSignature().toShortString();
		
		System.out.println(signatureStr + "is start");
		
		long startTime = System.currentTimeMillis();
		try {
			Object object = joinPoint.proceed();
			return object;
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			long endTime = System.currentTimeMillis();
			System.out.println(signatureStr + "is finished");
			System.out.println(signatureStr + ": 경과 시간 : " + (endTime - startTime));
		}
		
		return null;
	}

}
