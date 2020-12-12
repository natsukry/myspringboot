package myspringboot.alpha.dao.second;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ItemDao {
    @Select("select value from item_value where name=#{name}")
    String getValue(@Param("name") String name);
}
