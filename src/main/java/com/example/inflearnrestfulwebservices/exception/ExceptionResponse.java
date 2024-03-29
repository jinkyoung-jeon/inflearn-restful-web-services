package com.example.inflearnrestfulwebservices.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
// 전체 모든 필드를 가지고 있는 생성자
@AllArgsConstructor
// 매개변수가 없는 디폴트 생성자
@NoArgsConstructor
public class ExceptionResponse {
    private Date timestamp;
    private String message;
    private String details;
}
