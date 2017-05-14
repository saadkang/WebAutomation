package utility.ExtentReport;

import org.apache.commons.lang.StringUtils;
import org.apache.xalan.xsltc.compiler.util.Util;
import utility.ExtentReport.TestLogger;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.InvocationHandler;

/**
 * Created by mrahman on 3/6/17.
 */
public class LogFactory{

//    public LogEnforcement makeLogEnforcement() {
//        return (LogEnforcement) Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{LogEnforcement.class},
//                new LogEnforcementInvocationHandler(new LogEnforcementImpl()));
//    }
//    private static class LogEnforcementImpl implements LogEnforcement {
//        private boolean enabled = false;
//
//        @Override
//        public void setEnabled(boolean enable) {
//            this.enabled = enable;
//        }
//
//        @Override
//        public boolean getEnabled() {
//
//            return this.enabled;
//        }
//
////        @Override
////        public void trace() {
////            System.out.println("Test log trace");
////        }
//        @Override
//        public void trace() {
//            TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
//
//
//        }
//        public String converToString(String st){
//            String splitString ;
//            splitString = StringUtils.join(StringUtils.splitByCharacterTypeCamelCase(st), ' ');
//            return splitString;
//        }
//    }
//
//    private static class LogEnforcementInvocationHandler implements InvocationHandler {
//
//            private LogEnforcementImpl logEnforcementImpl;
//
//            public LogEnforcementInvocationHandler(LogEnforcementImpl fooImpl) {
//                this.logEnforcementImpl = fooImpl;
//            }
//
//            @Override
//            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                if (method.getDeclaringClass() == LogEnforcement.class &&
//                        !method.getName().equals("getEnabled") &&
//                        !method.getName().equals("setEnabled")) {
//
//                    if (!this.logEnforcementImpl.getEnabled()) {
//                        return null;
//                    }
//                }
//
//                return method.invoke(this.logEnforcementImpl, args);
//            }
//    }
//
//    public static void main(String[] args) {
//        LogEnforcement log = LogEnforcement.newLogEnforcement();
//        log.setEnabled(true);
//        log.trace();
//    }
}

