package com.example.my.pet.transport.server.utils;

import com.example.my.pet.transport.server.mapper.PlaceMapper;
import com.example.my.pet.transport.server.model.dto.OrderDTO;
import com.example.my.pet.transport.server.model.dto.WaybillDTO;
import com.example.my.pet.transport.server.model.entity.OrderDO;
import com.example.my.pet.transport.server.model.entity.WaybillDO;
import com.example.my.pet.transport.server.model.utils.Address;
import org.springframework.beans.BeanUtils;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class DistributeUtil {

    public static Map<Long , Queue<Long>> map = new HashMap<>();
    @Resource
    private static PlaceMapper placeMapper;

    public static void bindOrderAndTransporter(OrderDTO orderDTO, OrderDO orderDO) throws Exception{
        Address sendAddress = orderDTO.getSendAddress();
        Long placeId = placeMapper.getPlaceId(sendAddress.getProvinceCode(),
                sendAddress.getCityCode(), sendAddress.getAreaCode());
        if (!map.containsKey(placeId)){
            new Exception("发货地址负责网店已取消");
        }
        Queue<Long> distributeQueue = map.get(placeId);
        Long transporterId = distributeQueue.poll();
        BeanUtils.copyProperties(orderDTO,orderDO);
        orderDO.setSendAddress(orderDTO.getSendAddress().toString());
        orderDO.setReceiveAddress(orderDTO.getReceiveAddress().toString());
        orderDO.setTransporterId(transporterId);
        distributeQueue.offer(transporterId);
        map.put(placeId,distributeQueue);
    }

    public static void bindWaybillAndTransporter(WaybillDTO waybillDTO, WaybillDO waybillDO) throws Exception{
        Address receiveAddress = waybillDTO.getReceiveAddress();
        Long placeId = placeMapper.getPlaceId(receiveAddress.getProvinceCode(),
                receiveAddress.getCityCode(), receiveAddress.getAreaCode());
        if (!map.containsKey(placeId)){
            new Exception("收货货地址负责网店已取消");
        }
        Queue<Long> distributeQueue = map.get(placeId);
        Long transporterId = distributeQueue.poll();
        BeanUtils.copyProperties(waybillDTO,waybillDO);
        waybillDO.setSendAddress(waybillDTO.getSendAddress().toString());
        waybillDO.setReceiveAddress(waybillDTO.getReceiveAddress().toString());
        waybillDO.setTransporterId(transporterId);
        distributeQueue.offer(transporterId);
        map.put(placeId,distributeQueue);
    }
}
