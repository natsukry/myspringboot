package myspringboot.alpha.dao.master;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CatDao {
    @Select("select des from cat_tbl where name = #{name}")
    String getDes(@Param("name") String name);
}
