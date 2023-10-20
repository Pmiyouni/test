package com.ex.test.service;

import com.ex.test.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class TestService {
    @Autowired
    private TestRepository testRepository;

    public String insert(String name) {
        String name1 = testRepository.save(name);
        return name1;

    }
}