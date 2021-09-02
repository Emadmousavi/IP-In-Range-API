package com.mahsan.springwebapi.controllers;

import com.mahsan.springwebapi.dto.IPDto;
import com.mahsan.springwebapi.entities.IPInfoEntity;
import com.mahsan.springwebapi.services.impl.IPServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/ip")
public class IPController {

    @Autowired
    IPServiceImpl ipServiceImpl = new IPServiceImpl();

    @GetMapping(path = "/{ip}")
    public List<IPDto> getIP(@PathVariable String ip)
    {
        List<IPDto> returnValue= new ArrayList<IPDto>();
        List<IPInfoEntity> results = new ArrayList<IPInfoEntity>();
        IPDto tmp = new IPDto();
        results = ipServiceImpl.getIP(ip);

        for (int i=0;i<results.size();i++)
        {
            BeanUtils.copyProperties(results.get(i),tmp);
            returnValue.add(tmp);
        }

        return returnValue;
    }

    @PostMapping
    public IPDto createIP(@RequestBody IPInfoEntity request)
    {
        IPDto returnValue = new IPDto();
        returnValue = ipServiceImpl.createIP(request);
        return returnValue;


    }

    @PutMapping
    public String updateIP()
    {
        return "updateIP was called";
    }

    @DeleteMapping
    public String deleteIP()
    {
        return "deleteIP was called";
    }
}