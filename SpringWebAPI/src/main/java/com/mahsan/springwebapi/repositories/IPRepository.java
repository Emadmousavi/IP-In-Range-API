package com.mahsan.springwebapi.repositories;

import com.mahsan.springwebapi.entities.IPInfoEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPRepository extends CrudRepository<IPInfoEntity, Long> {

    @Query(value ="select * from ipinfo_model p where (INET_ATON(?1) BETWEEN INET_ATON(p.startIP) AND INET_ATON(p.endIP))" ,nativeQuery = true)
    List<IPInfoEntity> findAllByIP(String ip);
}
