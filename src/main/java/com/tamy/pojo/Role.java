package com.tamy.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Role implements Serializable {
    private Integer rid;
    private String roleName;
}
