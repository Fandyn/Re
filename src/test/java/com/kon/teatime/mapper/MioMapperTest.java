package com.kon.teatime.mapper;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kon.teatime.entity.Mio;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;


@SpringBootTest
class MioMapperTest {

    @Autowired
    private MioMapper mioMapper;

    @Test
    void findAll() {
        List<Mio> mios = mioMapper.findAll();
        for (Mio m:mios
             ) {
            System.out.println(m);
            System.out.println("");
        }
    }

    @Test
    void findOneById() {
        Mio mio = mioMapper.findOneById(2);
        System.out.println(mio);
    }

    @Test
    void pageH(){
//        执行分页
        PageHelper.startPage(3, 2);
//        执行查询
        List<Mio> mios = mioMapper.findAll();
//        封装PaheInfo对象
        PageInfo<Mio> mioPageInfo = new PageInfo<>(mios);
//        输出
        for (
                Mio m : mioPageInfo.getList()
        ) {
            System.out.println(m);
        }
    }



}