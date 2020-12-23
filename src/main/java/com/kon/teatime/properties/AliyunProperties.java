package com.kon.teatime.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "aliyun")
@Component          //将该类注入spring容器中
@Data
public class AliyunProperties {

    private String z;

    private String y;

    private String x;

}
