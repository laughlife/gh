package com.mlight.controller;

import com.alibaba.fastjson.JSONObject;
import com.mlight.service.DictionariesService;
import com.mlight.utils.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by Administrator on 2018/1/24.
 */
@Controller
@RequestMapping(value = "/dictionaries")
public class DictionariesController {
    @Autowired
    private DictionariesService dictionariesService;

    public DictionariesService getDictionariesService() {
        return dictionariesService;
    }

    public void setDictionariesService(DictionariesService dictionariesService) {
        this.dictionariesService = dictionariesService;
    }

    @RequestMapping("/queryDictionaries.action")
    public void queryDictionaries(HttpServletRequest request, HttpServletResponse response) {
        String dicName = request.getParameter("dicName");
        List list = this.getDictionariesService().findDicByTableName(dicName);
        String message = JSONObject.toJSONString(list);
        WebUtils.response(message, response);
    }
}
