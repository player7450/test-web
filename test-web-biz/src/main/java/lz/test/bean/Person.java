package lz.test.bean;

import lombok.Builder;
import lombok.Data;

/**
 * @author 万二(Zheng Liu)
 * @date 2017/10/27
 */
@Data
@Builder
public class Person {
    private Long id;
    private String name;
    private Integer age;

}
