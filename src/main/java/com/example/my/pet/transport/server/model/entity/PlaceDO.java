package com.example.my.pet.transport.server.model.entity;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 *  网点信息
 *
 * @author dndaoir
 * @since 2021-10-22
 */
@TableName("place")
@Data
public class PlaceDO {

    /**
     * 网点id
     */
    @TableId
    private Long placeId;

    /**
     * 网点名称
     */
    private String placeName;

    /**
     * 所在省code
     */
    private Long provinceCode;

    /**
     * 所在市code
     */
    private Long cityCode;

    /**
     * 所在区县code
     */
    private Long areaCode;

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
