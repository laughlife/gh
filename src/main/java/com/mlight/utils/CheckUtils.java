package com.mlight.utils;

import java.util.List;

public class CheckUtils {
    /**
     * 验证传递过来的值是否为空。
     * @param obj
     * @return
     */
    public static boolean isEmpty(Object obj) {
        if (obj instanceof String) {
            return obj == null || ((String) obj).length() == 0;
        } else if (obj instanceof Object[]) {
            Object[] temp = (Object[]) obj;
            for (int i = 0; i < temp.length; i++) {
                if (!isEmpty(temp[i])) {
                    return false;
                }
            }
            return true;
        } else if (obj instanceof List) {
            return obj == null || ((List) obj).isEmpty();
        }
        return obj == null;
    }
}
