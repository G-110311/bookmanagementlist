package com.kqb.dao.impl;

import com.kqb.dao.IAddBook;
import com.kqb.dao.IRemoveBook;
import com.kqb.dao.IUpdateBook;
import com.kqb.entity.Book;

import java.util.List;

public class IAddIRemoveIUpdadeImpl implements IAddBook, IRemoveBook, IUpdateBook {
    private  static IAddIRemoveIUpdadeImpl iAddIRemoveIUpdade;
    private IAddIRemoveIUpdadeImpl(){}
    public  static IAddIRemoveIUpdadeImpl getiAddIRemoveIUpdade(){
        if (iAddIRemoveIUpdade==null){
            return new IAddIRemoveIUpdadeImpl();
        }
        return iAddIRemoveIUpdade;
    }

    @Override
    public void add(List<Book> books, Book book) {
        if (!books.contains(book)){
            books.add(book);
            System.out.println("添加成功");
        }else {
            System.out.println("操作成功，本馆已收藏此书无需再次添加");
        }
    }

    @Override
    public void remove(List<Book> books, String bookName) {
        boolean boo=false;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getBookName().equals(bookName)){
                books.remove(books.get(i));
                boo=true;
                System.out.println("删除成功");
            }
        }
        if (!boo){
            System.out.println("操作失败，本馆暂未收藏此书");
        }else {
            IQueryImpl.getIqueryImpl().selectBook(books);
        }
    }

    @Override
    public void setBooksByName(String bookName, List<Book> books, Book book) {
        boolean boo=false;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getBookName().equals(bookName)){
                books.set(i,book);
                System.out.println("修改成功");

            }
        }
        if (!boo){
            System.out.println("操作失败，本馆暂未收藏此书");
        }
    }
}
