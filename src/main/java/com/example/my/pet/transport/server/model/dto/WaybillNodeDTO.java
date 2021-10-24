package com.example.my.pet.transport.server.model.dto;

import com.baomidou.mybatisplus.annotation.TableId;

import java.util.Date;

public class WaybillNodeDTO {

    /**
     * 运单id
     */
    private Long waybillId;

    /**
     * 运单号
     */
    private String waybillNo;

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
}
