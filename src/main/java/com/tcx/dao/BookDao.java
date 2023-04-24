package com.tcx.dao;


import com.tcx.domain.Book;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface BookDao {

    @Insert("insert into book (type,name,description) values(#{type},#{name},#{description})")
    public boolean save(Book book);

    @Update("update book set type=#{type},name=#{name},description=#{description} where id = #{id}")
    public boolean update(Book book);

    public boolean delete(Integer id);

    public Book getById(Integer id);

    public List<Book> getAll();
}
