package com.kon.teatime.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data                   //使用这个注解，就不用再去手写Getter,Setter,equals,canEqual,hasCode,toString等方法了，注解后在编译时会自动加进去
@AllArgsConstructor     //有参构造
@NoArgsConstructor      //无参构造
public class People {
    private Integer id;
    private String name;

}
