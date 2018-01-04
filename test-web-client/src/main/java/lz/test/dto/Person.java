package lz.test.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 万二(Zheng Liu)
 * @date 2017/10/27
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private Long id;
    private String name;
    private Integer age;

}
