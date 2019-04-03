package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @ClassName ProxyPerformanceTest
 * @Author yaochaochen
 * @Date 2019-04-03 14:50
 **/
public class ProxyPerformanceTest {

    public static void main(String[] args) {
        Target target = new TargetImp();
        
        Target dynamiacProxy = JdkDynamicProxyTest.newProxyInstance(target);
        Target cgllibProxy = CglibProxyTest.newProxyInstance(TargetImp.class);
        //预热下
        int preRunCount = 10000;
        runWithoutMonitor(target, preRunCount);
        runWithoutMonitor(cgllibProxy, preRunCount);
        runWithoutMonitor(dynamiacProxy, preRunCount);

        Map<String, Target> tests = new LinkedHashMap<String, Target>();
        tests.put("Native  ", target);
        tests.put("Dynamic ", dynamiacProxy);
        tests.put("Cglib  ", cgllibProxy);
        int repeatCount = 3;
        int runCount = 1000000;
        runTest(repeatCount, runCount, tests);
        runCount = 50000000;
        runTest(repeatCount, runCount, tests);
        
    }
    private  static void runWithoutMonitor(Target target, int runCount) {
        
        for (int i = 0; i<runCount; i++) {
            target.test(runCount);
        }
    }
    private static void  runWithoutMonitor(Target target, int runCount, String tag) {
        long start = System.currentTimeMillis();

        for (int i = 0; i<runCount; i++) {
            target.test(runCount);
        }
        long end = System.currentTimeMillis();
        System.out.println("[" +tag+"] Total Time:" + (end-start)+ "ms");
    }
    
    
    private static void runTest(int repeatCount, int runCount, Map<String,Target> tests) {
        System.out.println(
                String.format("\n===== run test : [repeatCount=%s] [runCount=%s] [java.version=%s] =====",
                        repeatCount, runCount, System.getProperty("java.version")));
        for (int i = 0; i < repeatCount; i++) {
            System.out.println(String.format("\n--------- test : [%s] ---------", (i + 1)));
            for (String key : tests.keySet()) {
                runWithoutMonitor(tests.get(key), runCount, key);
            }
        }
    }
}
