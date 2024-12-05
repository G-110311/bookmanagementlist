package com.kqb.dao.impl;

import com.kqb.dao.IQueryBook;
import com.kqb.entity.Book;

import java.util.List;

public class IQueryImpl implements IQueryBook {
    private static IQueryImpl iqueryImpl;
    private IQueryImpl(){}
    public static IQueryImpl getIqueryImpl(){
        if (iqueryImpl==null){
            return  new IQueryImpl();
        }
        return iqueryImpl;
    }
    //查看所有图书信息
    @Override
    public void selectBook(List<Book> books) {
        books.forEach(book -> System.out.println(book));
    }
//查看指定图书信息
    @Override
    public void selectByBookName(List<Book> books, String booksName) {
        books.forEach(book -> {

        });
        boolean boo=false;
        for(Book book:books){
            if (book.getBookName().equals(booksName)){
                System.out.println(book);
            }
        }
        if (!boo){
            System.out.println("本馆暂未收藏此书");
        }
    }
}
