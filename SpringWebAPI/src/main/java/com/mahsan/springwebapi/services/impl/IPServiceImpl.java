package com.mahsan.springwebapi.services.impl;

import com.mahsan.springwebapi.dto.IPDto;
import com.mahsan.springwebapi.services.IPService;
import com.mahsan.springwebapi.entities.IPInfoEntity;
import com.mahsan.springwebapi.repositories.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IPServiceImpl implements IPService {

    @Autowired
    IPRepository ipRepository;

    @Override
    public IPDto createIP(IPInfoEntity ip) {

        IPDto returnValue = new IPDto();
        BeanUtils.copyProperties(ip,returnValue);
        ipRepository.save(ip);
        return returnValue;

    }

    @Override
    public List<IPInfoEntity> getIP(String ip) {
        return ipRepository.findAllByIP(ip);
    }
}
