package com.kon.teatime.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data                   //使用这个注解，就不用再去手写Getter,Setter,equals,canEqual,hasCode,toString等方法了，注解后在编译时会自动加进去
@AllArgsConstructor     //有参构造
@NoArgsConstructor      //无参构造
public class User implements Serializable{

    private Integer id;

    /**
     * 用户名称
     */
    private String username;

    /**
     * 生日
     */
    private LocalDateTime birthday;

    /**
     * 性别
     */
    private String sex;

    /**
     * 地址
     */
    private String address;


    @Override
    public String toString() {
        return "User{" +
                "userId=" + id +
                ", userName='" + username + '\'' +
                ", userAddress='" + address + '\'' +
                ", userSex='" + sex + '\'' +
                ", userBirthday=" + birthday +
                '}';
    }
}