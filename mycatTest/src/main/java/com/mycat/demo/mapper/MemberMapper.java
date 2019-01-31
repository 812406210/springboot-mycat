package com.mycat.demo.mapper;

import com.mycat.demo.entity.Member;


import java.util.List;

public interface MemberMapper {

    int insert(Member member);

    int save(Member member);

    int updateById(Member member);

    List<Member> selectAll();

    String getToken(String appId);


    int deleteById(Integer id);


    Member selectById(Integer id);
}
