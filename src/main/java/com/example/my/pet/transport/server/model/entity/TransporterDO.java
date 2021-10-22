package com.example.my.pet.transport.server.model.entity;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 *  运输员信息
 *
 * @author dndaoir
 * @since 2021-10-22
 */
@TableName("transporter")
@Data
public class TransporterDO {

    /**
     * 运输员id
     */
    @TableId
    private Long transporterId;

    /**
     * 运输员姓名
     */
    private String transporterName;

    /**
     * 登录密码
     */
    private String transporterPassword;

    /**
     * 运输员手机号
     */
    private String transporterPhone;

    /**
     * 运输员头像地址
     */
    private String transporterAvatar;

    /**
     * 网点id
     */
    private Long placeId;

    /**
     * 登录验证码
     */
    private String transporterCheckCode;

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
