package com.youramaryllis.ddd.contextMap.annotations;

import java.lang.annotation.*;

@Documented
@Target(ElementType.PACKAGE)
@Retention(RetentionPolicy.RUNTIME)
@Relationship
public @interface AntiCorruptionLayer {
    public String value();
}
