package com.mlight.service.impl;

import com.mlight.service.DictionariesService;
import com.mlight.utils.SqlUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/1/24.
 */

@Service
public class DictionariesServiceImpl implements DictionariesService {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List findDicByTableName(String dicName) {
        String sql = "select * from "+dicName+" order by dm asc";
        List list = this.getJdbcTemplate().queryForList(sql);
        return list;
    }
}
