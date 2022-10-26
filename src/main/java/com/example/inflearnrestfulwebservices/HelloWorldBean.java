package com.example.inflearnrestfulwebservices;

import lombok.AllArgsConstructor;
import lombok.Data;

    // lombok ==> plugin을 사용하기 때문에 @Data를 사용할 수 있음
@Data
@AllArgsConstructor
public class HelloWorldBean {
    private String message;

// ==> @Data를 사용하기 때문에 get, set 안 만들어도 됨.
//    public String getMessage() {
//        return this.message;
//    }
//    public  void setMessage(String msg) {
//        this.message = msg;
//    }

    // ==> @AllArgsConstructor을 사용하기 때문에 아래 코드는 없애도 된다. 있으면 중복 error 발생.
//    public HelloWorldBean(String message) {
//        this.message = message;
//    }
}
