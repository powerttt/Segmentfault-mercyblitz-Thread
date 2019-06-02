package segmentfault.mercyblitz.lesson1.process;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;

/**
 * @Author tongning
 * @Date 2019/6/1 0001
 * function:<
 * <p>
 * >
 */
public class ProcessDemo {

    public static void main(String[] args) {

        // Java 9 之前的实现
        getProcessIdInLegacyWay();

        getProcessId();

    }

    private static void getProcessId() {
//        long pid = ProcessPath.ProcessHandler.
    }

    private static void getProcessIdInLegacyWay() {

        RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();

        String name = runtimeMXBean.getName();
        String pid = name.substring(0, name.indexOf("@"));
        System.out.println("当前进程Id : " + pid);

    }

}
