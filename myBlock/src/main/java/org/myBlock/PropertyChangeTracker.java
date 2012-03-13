package org.myBlock;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class PropertyChangeTracker {

        private Logger logger = Logger.getLogger(getClass());
       
        @Before("execution(void org.myBlock.MyBean.set*(*))")
        public void trackChange(JoinPoint point) {
                String name = point.getSignature().getName();
                Object newValue = point.getArgs()[0];
                System.out.println(name + " about to change to " + newValue + "on " + point.getTarget());
                //logger.info(name + " about to change to " + newValue + "on " + point.getTarget());
        }
} 