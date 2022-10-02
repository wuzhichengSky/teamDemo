package com.wzc.teamdemo.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 老师类
 * @TableName tea
 */
@TableName(value ="tea")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tea implements Serializable {
    /**
     * 教师id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 姓名（昵称）
     */
    private String name;

    /**
     * 密码
     */
    private String password;

    /**
     * 性别
     */
    private Integer sex;

    /**
     * 联系方式
     */
    private String phone;

    /**
     * 工号
     */
    private String jNum;

    /**
     * 个人简介
     */
    private String des;

    /**
     * 职位id
     */
    private Integer posId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}