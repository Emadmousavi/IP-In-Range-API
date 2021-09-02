package com.mahsan.springwebapi.services;

import com.mahsan.springwebapi.dto.IPDto;
import com.mahsan.springwebapi.entities.IPInfoEntity;

import java.util.List;

public interface IPService {

    IPDto createIP(IPInfoEntity ip);
    List<IPInfoEntity> getIP(String ip);
}
