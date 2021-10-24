package com.example.my.pet.transport.server.model.entity;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 *  运单信息
 *
 * @author dndaoir
 * @since 2021-10-22
 */
@TableName("waybill")
@Data
public class WaybillDO {

    /**
     * 运单id
     */
    @TableId
    private Long waybillId;

    /**
     * 运单号
     */
    private String waybillNo;

    /**
     * 订单id
     */
    private Long orderId;

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 收件码
     */
    private Integer receivingCode;

    /**
     * 宠物id
     */
    private Long petId;

    /**
     * 设备编号
     */
    private String deviceImei;

    /**
     * 运单运输方式
     */
    private Integer waybillType;

    /**
     * 运单状态：1.待派送、2.派送中、已签收
     */
    private Integer waybillStatus;

    /**
     * 寄件地址
     */
    private String sendAddress;

    /**
     * 收件地址
     */
    private String receiveAddress;

    /**
     *派件人id
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
