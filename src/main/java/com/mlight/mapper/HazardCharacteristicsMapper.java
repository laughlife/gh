package com.mlight.mapper;

import com.mlight.model.HazardCharacteristics;
import com.mlight.model.HazardCharacteristicsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HazardCharacteristicsMapper {
    long countByExample(HazardCharacteristicsExample example);

    int deleteByExample(HazardCharacteristicsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HazardCharacteristics record);

    int insertSelective(HazardCharacteristics record);

    List<HazardCharacteristics> selectByExample(HazardCharacteristicsExample example);

    HazardCharacteristics selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HazardCharacteristics record, @Param("example") HazardCharacteristicsExample example);

    int updateByExample(@Param("record") HazardCharacteristics record, @Param("example") HazardCharacteristicsExample example);

    int updateByPrimaryKeySelective(HazardCharacteristics record);

    int updateByPrimaryKey(HazardCharacteristics record);
}