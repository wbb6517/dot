package org.example.dotstart.hutool.core.util;

import cn.hutool.core.util.CoordinateUtil;

public class CoordinateUtilTest {
    public static void main(String[] args) {
        boolean b = CoordinateUtil.outOfChina(120.0, 30.0);
        CoordinateUtil.Coordinate coordinate1 = CoordinateUtil.wgs84ToGcj02(120.0, 30.0);
        CoordinateUtil.Coordinate coordinate2 = CoordinateUtil.wgs84ToBd09(120.0, 30.0);
        CoordinateUtil.Coordinate coordinate3 = CoordinateUtil.gcj02ToWgs84(120.0, 30.0);
        CoordinateUtil.Coordinate coordinate4 = CoordinateUtil.gcj02ToBd09(120.0, 30.0);
        CoordinateUtil.Coordinate coordinate5 = CoordinateUtil.bd09ToGcj02(120.0, 30.0);
        CoordinateUtil.Coordinate coordinate6 = CoordinateUtil.bd09toWgs84(120.0, 30.0);
        CoordinateUtil.Coordinate coordinate7 = CoordinateUtil.wgs84ToMercator(120.0, 30.0);
        CoordinateUtil.Coordinate coordinate8 = CoordinateUtil.mercatorToWgs84(120.0, 30.0);
    }
}
