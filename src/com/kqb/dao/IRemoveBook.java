package com.kqb.dao;

import com.kqb.entity.Book;

import java.util.List;

/**
 * 删除图书信息
 */
public interface IRemoveBook {
    /**
     * 删除指定图书的信息
     * @param books 操作的图书集合
     * @param bookName 删除图书的图书名
     */
    void remove(List<Book> books,String bookName);

}
