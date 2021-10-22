package com.example.my.pet.transport.server.model.entity;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 *  订单信息
 *
 * @author dndaoir
 * @since 2021-10-22
 */
@TableName("order")
@Data
public class OrderDO {

    /**
     * 订单id
     */
    @TableId
    private Long orderId;

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 订单状态（1.待揽件、2.已揽件、3.已取消、4.派送中、5.已完成）
     */
    private Integer orderStatus;

    /**
     * 运输方式
     */
    private Integer transportType;

    /**
     * 预约上门时间
     */
    private Date appointmentTime;

    /**
     * 揽件时间
     */
    private Date pickupTime;

    /**
     * 寄件码
     */
    private Integer shippingCode;

    /**
     * 寄件地址
     */
    private String sendAddress;

    /**
     * 寄件用户id
     */
    private Long memberId;

    /**
     * 寄件人姓名
     */
    private String sendName;

    /**
     * 寄件人手机号
     */
    private String sendPhone;

    /**
     * 收件地址
     */
    private String receiveAddress;

    /**
     * 收件人姓名
     */
    private String receiveName;

    /**
     * 收件人手机号
     */
    private String receivePhone;

    /**
     * 揽件人id
     */
    private Long transporterId;

    /**
     * 创建时间
     */
    private Date createdon;

    /**
     * 创建人id
     */
    private Long createdby;

    /**
     * 修改时间
     */
    private Date modifiedon;

    /**
     * 修改人id
     */
    private Long modifiedby;
}
