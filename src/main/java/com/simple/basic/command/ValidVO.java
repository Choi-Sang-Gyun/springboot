package com.simple.basic.command;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ValidVO {
 
    /*
    @NotNull - null값 제외 - Integer, Long, String 적용
    @NotEmpty - null값 제외, 공백 허용하지 않음 - Array, Map, String
    @NotBlank - null값 제외, 공백 허용하지 않음, 화이트 스페이스 허용하지 않음 - String
    (밑으로 갈수록 더 강한 제약)
     
     @Pattern - 정규표현식으로
     @Email - 기본으로 제공되는 이메일 검사
     @Size - 크기검사 등등
    
    */
    
    @NotBlank(message = "이름은 필수 입니다")
    private String name;
    
    @NotNull(message = "급여는 필수 입니다")
    private Integer salary;
    
    @Pattern(regexp="[0-9]{3}-[0-9]{4}-[0-9]{4}", message="010-0000-0000 유형입니다")
    private String phone;

    @NotBlank(message = "email 형식 이어야 합니다")
    @Email
    private String email;



}
