package com.mlight.utils;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class WebUtils {

    /**
     * 输出数据
     *
     * @param message
     * @param response
     */
    public static void response(String message, HttpServletResponse response) {
        if (!CheckUtils.isEmpty(message)) {
            try {
                response.setStatus(HttpServletResponse.SC_OK);
                response.setContentType("text/html; charset=UTF-8");
                PrintWriter pw = response.getWriter();
                pw.write(message);
                pw.flush();
                pw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
