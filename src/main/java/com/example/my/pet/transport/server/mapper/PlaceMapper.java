package com.example.my.pet.transport.server.mapper;

import com.example.my.pet.transport.server.model.dto.OrderDTO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaceMapper {

    Long getPlaceId(@Param("provinceCode") Long provinceCode,
                    @Param("cityCode") Long cityCode,
                    @Param("areaCode") Long areaCode);
}
