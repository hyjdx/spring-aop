package com.benny.study.aop;
 
import com.benny.study.annotation.Benny;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Configuration;

/**
 * 注解切面
 */
@Aspect
@Configuration
public class Audience {
	// 定义切点
//	@Pointcut("execution(* *..*.*(..))")
//	public void doSame(){
//
//	}
	@Pointcut("@annotation(com.benny.study.annotation.Benny)")
	public void doSame(){

	}
	@Before("doSame() && @annotation(benny)")
	public void takeSeats(Benny benny){
		System.out.println("before do some "+benny.value());
	}

	@AfterReturning("doSame() && @annotation(benny)")
	public void applaud(Benny benny){
		System.out.println("after do some");
	}

	@AfterThrowing("doSame() && @annotation(benny)")
	public void demandRefund(Benny benny){
		System.out.println("after do some throw ");
	}

	@Around("doSame() && @annotation(benny)")
	public Object aroundYoung(ProceedingJoinPoint pjp,Benny benny) throws Throwable {
		System.out.println("around use @Benny "+benny.value());
		try {
			return pjp.proceed();
		}catch (Exception e){
			e.printStackTrace();
		}
		return pjp.proceed();
	}
}