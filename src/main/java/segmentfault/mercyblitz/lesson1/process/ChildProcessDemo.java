package segmentfault.mercyblitz.lesson1.process;

import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;

/**
 * @Author tongning
 * @Date 2019/6/1 0001
 * function:<
 * <p>
 * >
 */
public class ChildProcessDemo {

    public static void main(String[] args) throws IOException {

        OperatingSystemMXBean operatingSystemMXBean = ManagementFactory.getOperatingSystemMXBean();

        System.out.println(operatingSystemMXBean.getName());
        Runtime.getRuntime().exec("calc");

//        Process process = Runtime.getRuntime().exec("dir");
//
//        InputStream inputStream = process.getInputStream();
//
//        int data = 0;
//        while ((data = inputStream.read()) > -1) {
//            System.out.println(data);
//        }


    }


}
