package com.kon.teatime.entity;


import lombok.Data;

import java.io.Serializable;

@Data
public class Mio implements Serializable {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
