package com.example.my.pet.transport.server.model.entity;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.util.Date;

/**
 *  app版本信息
 *
 * @author dndaoir
 * @since 2021-10-22
 */
@TableName("app_version")
@Data
public class AppVersionDO {

    /**
     * app版本自增id
     */
    @TableId
    private Long appId;

    /**
     * app编号
     */
    private Long appCode;

    /**
     *  app版本号
     */
    private Long appVersion;

    /**
     * 创建时间
     */
    private Date createdon;

    /**
     * 创建人id
     */
    private Long createdby;

}
