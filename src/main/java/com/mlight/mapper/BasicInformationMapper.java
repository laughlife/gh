package com.mlight.mapper;

import com.mlight.model.BasicInformation;
import com.mlight.model.BasicInformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasicInformationMapper {
    long countByExample(BasicInformationExample example);

    int deleteByExample(BasicInformationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BasicInformation record);

    int insertSelective(BasicInformation record);

    List<BasicInformation> selectByExample(BasicInformationExample example);

    BasicInformation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BasicInformation record, @Param("example") BasicInformationExample example);

    int updateByExample(@Param("record") BasicInformation record, @Param("example") BasicInformationExample example);

    int updateByPrimaryKeySelective(BasicInformation record);

    int updateByPrimaryKey(BasicInformation record);
}