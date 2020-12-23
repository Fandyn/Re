package com.kon.teatime.mapper;

import com.kon.teatime.entity.Mio;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MioMapper {
    @Select("select * from mio")
    List<Mio> findAll();


    @Select("select * from mio where id = #{id}")
    Mio findOneById(@Param("id") Integer id);
}
