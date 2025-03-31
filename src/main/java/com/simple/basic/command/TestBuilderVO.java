package com.simple.basic.command;

import lombok.Builder;
import lombok.ToString;

@Builder //빌더 패턴의 활성화
@ToString
public class TestBuilderVO {

    //빌더 패턴이란 - 객체의 불변성을 위해서 상ㅇ하는 스프링 애용하는 문법

    //1.멤버변수
    private String name;
    private int age;

    /*
    //3.외부클래스가 생성될 때 내부클ㄹ래스인 builder를 매개변수로 받음
    private TestBuilderVO(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
    }


    //4.외부에서 객체생성을 요구할대 builder메서드를 호출하도록 함
    public static Builder builder() {
        return new Builder(); //내부클래스 반환
    }

    //2.내부클래스
    public static class Builder {
        private String name;
        private int age;


        //생성자 제한
        private Builder() {

        }
    //5. 빌더클래스에서는 set 메서드  에서만 생성하고, 자신을 반환시킴
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }
        
        //6buildㅇ=를 요청하시면 3번의 생성자를 통해서 멤버변수를
        public TestBuilderVO build() {
            return new TestBuilderVO(this);
        }







    } */


}
