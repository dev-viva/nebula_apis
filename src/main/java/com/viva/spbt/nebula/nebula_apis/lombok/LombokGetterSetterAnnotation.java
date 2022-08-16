package com.viva.spbt.nebula.nebula_apis.lombok;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
@Setter
public class LombokGetterSetterAnnotation {
    @Autowired
    private long userId;
    @Autowired
    private String userName;
}
