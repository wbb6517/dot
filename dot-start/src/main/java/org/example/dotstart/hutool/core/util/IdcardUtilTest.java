package org.example.dotstart.hutool.core.util;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.util.IdcardUtil;

public class IdcardUtilTest {
    public static void main(String[] args) {
        String s = IdcardUtil.convert18To15("110101199003074557");
        String s1 = IdcardUtil.convert15To18(s);

        boolean validCard = IdcardUtil.isValidCard(s);
        boolean validCard1 = IdcardUtil.isValidCard18(s1);
        boolean validCard2 = IdcardUtil.isValidCard15(s1);


        String birthByIdCard = IdcardUtil.getBirthByIdCard(s1);
        String birthByIdCard1 = IdcardUtil.getBirth(s1);
        DateTime birthDate = IdcardUtil.getBirthDate(s1);
        int ageByIdCard = IdcardUtil.getAgeByIdCard(s1);


        int genderByIdCard = IdcardUtil.getGenderByIdCard(s1);
        String provinceCodeByIdCard = IdcardUtil.getProvinceCodeByIdCard(s1);
        String provinceCodeByIdCard1 = IdcardUtil.getProvinceByIdCard(s1);
        String provinceCodeByIdCard2 = IdcardUtil.getCityCodeByIdCard(s1);
        String provinceCodeByIdCard3 = IdcardUtil.getDistrictCodeByIdCard(s1);

        String info = IdcardUtil.hide(s1, 3, 16);

        IdcardUtil.Idcard idcardInfo = IdcardUtil.getIdcardInfo("320322197709086552");
    }
}
