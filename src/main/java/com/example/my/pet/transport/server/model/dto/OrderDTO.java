package com.example.my.pet.transport.server.model.dto;

import com.example.my.pet.transport.server.model.utils.Address;
import lombok.Data;

/**
 *  订单-用户交互对象
 *
 * @author dndaoir
 * @since 2021-10-22
 */
@Data
public class OrderDTO {

    /**
     * 订单id
     */
    private Long orderId;

    /**
     * 订单状态
     */
    private Integer orderStatus;

    /**
     * 寄件地址
     */
    private Address sendAddress;

    /**
     * 收件地址
     */
    private Address receiveAddress;

    /**
     * 运输员id
     */
    private Long transporterId;
}

