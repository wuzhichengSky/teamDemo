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
 * 部门类
 * @TableName dept
 */
@TableName(value ="dept")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dept implements Serializable {
    /**
     * 部门id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 部门描述
     */
    private String des;

    /**
     * 部门名称
     */
    private String name;

    /**
     * 部长
     */
    private String minister;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}