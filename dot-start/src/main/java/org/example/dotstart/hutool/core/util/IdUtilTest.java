package org.example.dotstart.hutool.core.util;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;

public class IdUtilTest {
    public static void main(String[] args) {
        String s = IdUtil.randomUUID();
        String s1 = IdUtil.simpleUUID();
        String s2 = IdUtil.fastUUID();
        String s3 = IdUtil.fastSimpleUUID();
        String s4 = IdUtil.objectId();
        Snowflake snowflake = IdUtil.createSnowflake(1, 1);
        Snowflake snowflake1 = IdUtil.getSnowflake(1, 1);
        Snowflake snowflake2 = IdUtil.getSnowflake(1);
        Snowflake snowflake3 = IdUtil.getSnowflake();

        long dataCenterId = IdUtil.getDataCenterId(1);
        long workerId = IdUtil.getWorkerId(1, 1);

        String s5 = IdUtil.nanoId();
        String s6 = IdUtil.nanoId(3);

        long snowflakeNextId = IdUtil.getSnowflakeNextId();
        String snowflakeNextIdStr = IdUtil.getSnowflakeNextIdStr();

    }
}
