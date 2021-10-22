package com.example.my.pet.transport.server.model.entity;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 物流节点信息
 *
 * @author dndaoir
 * @since 2021-10-22
 */
@TableName("waybill_node")
@Data
public class WaybillNodeDO {

    /**
     * 运单节点id
     */
    @TableId
    private Long waybillNodeId;

    /**
     * 运单节点时间
     */
    private Date waybillNodeTime;

    /**
     * 运单节点运输状态：1.已揽件、2.运输中、3.已签收
     */
    private Integer waybillNodeStatus;

    /**
     * 运输类型
     */
    private Integer transportType;

    /**
     * 运输工具信息
     */
    private String conveyanceInfo;

    /**
     * 始发站
     */
    private String startStation;

    /**
     * 终点站
     */
    private String endStation;

    /**
     * 预计到达时间
     */
    private Date estimateTime;

    /**
     * 创建时间
     */
    private Date createdon;

    /**
     * 创建人id
     */
    private Long createdby;
}
