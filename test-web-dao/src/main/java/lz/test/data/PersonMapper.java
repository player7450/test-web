package lz.test.data;

import lz.test.dto.Person;

/**
 * @author 万二(Zheng Liu)
 * @date 2018/01/01
 */
public interface PersonMapper {
    Integer countPerson();
    Person get(Integer id);
}
