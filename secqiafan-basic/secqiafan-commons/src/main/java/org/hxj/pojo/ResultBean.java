package org.hxj.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.ibatis.annotations.ConstructorArgs;

import java.io.Serializable;

/**
 * 同意定义了返回json接口描述类型
 */

@Data
@AllArgsConstructor
public class ResultBean<T> implements Serializable {

    private String statusCode;
    private T data;


}