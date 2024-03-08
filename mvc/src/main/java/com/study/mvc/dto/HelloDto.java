package com.study.mvc.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data

// 요청Dto엔 AllArgs, builder X
public class HelloDto {
    private String name;
    private int age;
}
