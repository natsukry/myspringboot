package myspringboot.alpha;

import myspringboot.alpha.dao.master.CatDao;
import myspringboot.alpha.dao.second.ItemDao;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class AlphaApplicationTests {
    @Resource
    CatDao catDao;
    @Resource
    ItemDao itemDao;
    @Test
    void testCatDao(){
        System.out.println(catDao.getDes("a"));
    }
    @Test
    void testItemDao(){
        System.out.println(itemDao.getValue("a"));
    }
    @Test
    void contextLoads() {
    }

}
