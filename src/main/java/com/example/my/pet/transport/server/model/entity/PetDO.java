package com.example.my.pet.transport.server.model.entity;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 *  宠物信息
 *
 * @author dndaoir
 * @since 2021-10-22
 */
@TableName("pet")
@Data
public class PetDO {

    /**
     * 宠物id
     */
    @TableId
    private Long petId;

    /**
     * 宠物类别
     */
    private Integer petType;

    /**
     * 宠物名字
     */
    private String petName;

    /**
     * 宠物体型
     */
    private Integer petSize;

    /**
     * 宠物重量
     */
    private Double petWeight;

    /**
     * 有无过往病史（0.无，1.有）
     */
    private Integer medicalHistory;

    /**
     * 病史详情
     */
    private String medicalDetail;

    /**
     * 宠物照片地址
     */
    private String picture;

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
