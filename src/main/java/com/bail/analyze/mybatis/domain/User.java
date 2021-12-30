package com.bail.analyze.mybatis.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * user
 * @author 
 */
@Data
public class User implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 姓名
     */
    private String userName;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 出生日期
     */
    private Date birthday;

}