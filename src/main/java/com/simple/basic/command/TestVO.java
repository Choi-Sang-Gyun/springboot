package com.simple.basic.command;

import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor //기본생성자
@AllArgsConstructor //멤버변수를 받는 생성자
//@Getter //getter
//@Setter //setter
//@ToString //tostring메서드 오버라이딩
@Data //getter + setter + toString
public class TestVO {

    //단축키는 alt + insert

    private String id;
    private String pw;
    private String name;
    private int salary;
    private String address;
    private LocalDateTime hiredate;

}
