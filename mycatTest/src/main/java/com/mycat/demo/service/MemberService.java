package com.mycat.demo.service;

import com.mycat.demo.entity.Member;


import java.util.List;

public interface MemberService {

     int insert(Member member);

     int save(Member member);

     int updateById(Member member);

     List<Member> selectAll();

     int deleteById(Integer id);

     Member selectById(Integer id);

}
