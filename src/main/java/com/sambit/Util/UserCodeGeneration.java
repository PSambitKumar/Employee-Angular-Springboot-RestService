package com.sambit.Util;

public class UserCodeGeneration {

    public static String UserCodeGenreationMethod(int maxUserSlNo){
        String userCode = "USER" + String.format("%08d", maxUserSlNo);
        return userCode;
    }
}
