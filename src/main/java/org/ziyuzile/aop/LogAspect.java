package org.ziyuzile.aop;

import com.alibaba.fastjson.JSON;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.ziyuzile.util.DateUtil;

import javax.servlet.http.HttpServletRequest;

@Component
@Aspect
public class LogAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(LogAspect.class);

    @Pointcut("@annotation(org.ziyuzile.annotation.RequestLog)")
    public void requestPointcut() {}

    @Before("requestPointcut()")
    public void before(JoinPoint joinPoint) throws Throwable {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();

        String queryString = request.getQueryString();
        // 请求URL
        String requestURL = request.getRequestURL().toString();
        if(StringUtils.isNotBlank(queryString)){
            requestURL += "?" + queryString;
        }

        // HTTP请求类型
        String requestMethod = request.getMethod();
        // 类名
        String className = joinPoint.getTarget().getClass().getName();
        // 方法名
        String methodName =  joinPoint.getSignature().getName() + "()";
        // 方法参数
        String methodArgs = JSON.toJSONString(joinPoint.getArgs());

        LOGGER.info("*******************【REQUEST】*******************");
        LOGGER.info("Request URL:{}", requestURL);
        LOGGER.info("Request Method:{}", requestMethod);
        LOGGER.info("Request Time:{}", DateUtil.format(DateUtil.now(), DateUtil.yyyyMMddWithMinusSeperatedAndHHmmssSSSWithColonSeperated));
        LOGGER.info("Class Name:{}", className);
        LOGGER.info("Method Name:{}", methodName);
        LOGGER.info("Method Args:{}", methodArgs);
        LOGGER.info("*************************************************");
    }

    @AfterReturning(pointcut = "requestPointcut()", returning = "rtn")
    public void afterReturning(Object rtn) {
        LOGGER.info("*******************【RESPONSE】*******************");
        LOGGER.info("Response Content:{}", JSON.toJSONString(rtn));
        LOGGER.info("Response Time:{}", DateUtil.format(DateUtil.now(), DateUtil.yyyyMMddWithMinusSeperatedAndHHmmssSSSWithColonSeperated));
        LOGGER.info("*************************************************");
    }
}
