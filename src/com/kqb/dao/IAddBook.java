package com.kqb.dao;


import com.kqb.entity.Book;

import java.util.List;

/**
 * 添加图书接口
 */
public interface IAddBook {
    /**
     * 添加图书的信息
     * @param books 操作的集合
     * @param book 添加的图书信息
     */
   void add(List<Book> books,Book book);
}
