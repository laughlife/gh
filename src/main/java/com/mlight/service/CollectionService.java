package com.mlight.service;

import com.mlight.model.BasicInformation;
import com.mlight.model.HazardCharacteristics;
import com.mlight.utils.Page;

import java.util.List;

/**
 * Created by Administrator on 2018/1/23.
 */
public interface CollectionService {
    int saveBasicInformation(BasicInformation basicInformation);

    int saveHazardCharacteristics(HazardCharacteristics hazardCharacteristics);

    List queryBasicInformation(int page,int pageSize);

    public String queryDicByDm(String dicName,String dm);

    String getIdByName(String name);

    public BasicInformation queryBasicInformationById(Integer id);

    public HazardCharacteristics queryHazardCharacteristicsById(Integer id);
}
