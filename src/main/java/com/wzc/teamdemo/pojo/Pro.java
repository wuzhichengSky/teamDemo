package com.wzc.teamdemo.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 项目类
 * @TableName pro
 */
@TableName(value ="pro")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pro implements Serializable {
    /**
     * 项目id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 项目描述
     */
    private String des;

    /**
     * 开始时间
     */
    private Date begin;

    /**
     * 结束时间
     */
    private Date end;

    /**
     * 项目状态
     */
    private String status;

    /**
     * 总负责人
     */
    private String manager;

    /**
     * 指导老师
     */
    private String instructor;

    /**
     * 队长
     */
    private String capt;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}