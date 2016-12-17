package com.zymapp.zymframe.common.tools;

/**
 * Created by zymapp on 2016/12/18.
 */

public class KeyUtils {

    static {
        System.loadLibrary("zymKeyNativeLib");
    }
    public native static String getKey();

}
