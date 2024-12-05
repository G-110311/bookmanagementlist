package com.kqb.dao;

import com.kqb.entity.Book;

import java.util.List;

/**
 * 修改图书信息接口
 */
public interface IUpdateBook {
    /**
     * 根据图书名修改图书的信息
     * @param bookName 要修改的图书名
     * @param books 操作的图书集合
     * @param book 要替换的图书信息
     */
   void setBooksByName(String bookName, List<Book>books,Book book);
}
