package com.bookStore.demo.service;

import com.bookStore.demo.entity.MyBookList;
import com.bookStore.demo.repository.MyBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyBookListService {

    @Autowired
    private MyBookRepository myBookRepository;

    public void saveMyBooks(MyBookList myBookList) {
        myBookRepository.save(myBookList);
    }

    public List<MyBookList> getAllMyBooks() {
        return myBookRepository.findAll();
    }

}
