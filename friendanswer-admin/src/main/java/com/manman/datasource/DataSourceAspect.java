package com.manman.datasource;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;

/**
 * Created by Builder34 on 2017/3/29.
 */
public class DataSourceAspect {
    private static final Logger LOGGER = LoggerFactory.getLogger(DataSourceAspect.class);
    public void before(JoinPoint point){
        Object target = point.getTarget();
        String method = point.getSignature().getName();
        Class<? extends Object> classz = target.getClass();
        Class<?>[] parameterTypes = ((MethodSignature)point.getSignature()).getMethod().getParameterTypes();
        try {
            Method m = classz.getMethod(method,parameterTypes);
            if (m!=null && m.isAnnotationPresent(DataSource.class)){
                DataSource data = m.getAnnotation(DataSource.class);
                DataSourceSwitcherToken.putToken(data.value());
                //LOGGER.debug("use [{}] datasource now. ",data.value());
                LOGGER.info("use [{}] datasource now. ",data.value());
            }else{
                DataSourceSwitcherToken.putToken(DataSourceConstant.MASTER);
                LOGGER.warn("datasource choose is null, use [{}] datasource by default. ",DataSourceConstant.MASTER);
            }
        }catch (Exception e){
            LOGGER.error("error: ",e);
        }
    }
}
