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
 * 职位类
 * @TableName pos
 */
@TableName(value ="pos")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pos implements Serializable {
    /**
     * 职位id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 职位描述
     */
    private String des;

    /**
     * 职位名称
     */
    private String name;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}