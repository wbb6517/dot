package org.example.dotstart.hutool.core.util;

import cn.hutool.core.util.RuntimeUtil;

import java.util.List;

public class RuntimeUtilTest {
    public static void main(String[] args) {
        String execForStr = RuntimeUtil.execForStr("java -version");
        List<String> strings = RuntimeUtil.execForLines("java -version");
        Process exec = RuntimeUtil.exec("java -version");
        RuntimeUtil.destroy(exec);


//        List<String> resultLines = RuntimeUtil.getResultLines(exec);
        String result = RuntimeUtil.getResult(exec);
        String resulte = RuntimeUtil.getErrorResult(exec);
        RuntimeUtil.addShutdownHook(() -> {
            System.out.println("JVM 退出时执行");
        });
        int processorCount = RuntimeUtil.getProcessorCount();
        long freeMemory = RuntimeUtil.getFreeMemory();
        long totalMemory = RuntimeUtil.getTotalMemory();
        long usableMemory = RuntimeUtil.getUsableMemory();

        int pid = RuntimeUtil.getPid();


    }
}
