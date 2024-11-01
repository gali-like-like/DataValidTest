package org.datavalid.entity;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class User {

    @NotNull(message = "用户id不能为空")
    private Long id;

    @NotNull(message = "用户名不能为空")
    private String name;

    @Min(value = 1,message = "必须大于等于1")
    private Integer age;

}
