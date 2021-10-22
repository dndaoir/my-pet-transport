package com.example.my.pet.transport.server.model.entity;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 *  评论信息
 *
 * @author dndaoir
 * @since 2021-10-22
 */
@TableName("comment")
@Data
public class CommentDO {

    /**
     * 评论id
     */
    @TableId
    private Long commentId;

    /**
     * 回复评论id
     */
    private Long commentParentId;

    /**
     * 评论内容
     */
    private String commentContent;

    /**
     * 创建时间
     */
    private Date createdon;

    /**
     * 创建人id
     */
    private Long createdby;
}
