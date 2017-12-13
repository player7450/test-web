package lz.test.aspect;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 万二(Zheng Liu)
 * @date 2017/12/11
 */
public class ServiceAspect {

    private static final Logger logger = LoggerFactory.getLogger(ServiceAspect.class);
    private static final Logger profileLog = LoggerFactory.getLogger("serviceProfile");

    private static final Gson gson = new GsonBuilder().disableHtmlEscaping().create();
    private static final String SPLITSIGN = "##";

    /**
     * around advice
     * @param joinPoint
     * @return
     * @throws Throwable
     */
    public Object serviceAround(ProceedingJoinPoint joinPoint) throws Throwable {
        String className = joinPoint.getSignature().getDeclaringTypeName();
        String methodName = joinPoint.getSignature().getName();

        String reqMsg = String.format("method=%s.%s%sargs=%s",
                className, methodName, SPLITSIGN, gson.toJson(joinPoint.getArgs()));
        profileLog.info(reqMsg);

        Object obj = joinPoint.proceed();
        profileLog.info(reqMsg + SPLITSIGN + "response=" + gson.toJson(obj));

        return obj;
    }

    public void afterThrowing(JoinPoint joinPoint, Throwable e) {
        logger.error("afterThrowing", e);
    }

}
