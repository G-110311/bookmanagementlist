package com.kqb.dao;

import com.kqb.entity.Book;

import java.util.List;

/**
 * 查询图书功能接口
 */
public interface IQueryBook {
    /**
     * 查询所有图书的信息
     * @param books 操作的集合
     */
    void selectBook(List<Book> books);

    /**
     * 查询指定图书的信息
     * @param books 操作的集合
     * @param booksName 查询图书的书名
     */
    void selectByBookName(List<Book> books,String booksName);

}
