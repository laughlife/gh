package com.mlight.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2018/1/26.
 */
public class DateUtils {
    /**
     * 格式化日期
     * @param date time
     * @param pattern like yyyy-MM-dd HH:mm:ss
     * @return
     */
    public static String formatDate(Date date,String pattern){
        if(date != null){
            DateFormat df = new SimpleDateFormat(pattern);
            return String.valueOf(df.format(date));
        }else{
            return "";
        }
    }
}
