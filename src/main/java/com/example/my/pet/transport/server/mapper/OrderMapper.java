package com.example.my.pet.transport.server.mapper;

import com.example.my.pet.transport.server.model.entity.OrderDO;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderMapper {

    void updateOreder(OrderDO orderDO);
}
