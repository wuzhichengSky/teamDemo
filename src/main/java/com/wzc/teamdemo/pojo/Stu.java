package com.wzc.teamdemo.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 学生类
 * @TableName stu
 */
@TableName(value ="stu")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value="学生")
public class Stu implements Serializable {
    /**
     * 学生id
     */
    @ApiModelProperty("学生id")
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 姓名（昵称）
     */
    @ApiModelProperty("姓名（昵称）")
    private String name;

    /**
     * 密码
     */
    @ApiModelProperty("密码")
    private String password;

    /**
     * 性别
     */
    @ApiModelProperty("性别")
    private Integer sex;

    /**
     * 联系方式
     */
    @ApiModelProperty("联系方式")
    private String phone;

    /**
     * 年级
     */
    @ApiModelProperty("年级")
    private String grade;

    /**
     * 班级
     */
    @ApiModelProperty("班级")
    private String cla;

    /**
     * 学号
     */
    @ApiModelProperty("学号")
    private String num;

    /**
     * 个人简介
     */
    @ApiModelProperty("个人简介")
    private String des;

    /**
     * 部门id
     */
    @ApiModelProperty("部门id")
    private Integer deptId;

    /**
     * 项目id
     */
    @ApiModelProperty("项目id")
    private Integer proId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}