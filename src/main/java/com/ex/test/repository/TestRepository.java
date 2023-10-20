package com.ex.test.repository;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestRepository {
    String save(String name);
}
