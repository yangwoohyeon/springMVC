package hello.servlet.basic;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter //Lombok을 이용해서 Getter, Setter 자동 생성
public class HelloData {
    private String username;
    private int age;

}
