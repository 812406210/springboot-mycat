package com.mycat.demo.service.serviceImpl;

import com.mycat.demo.entity.Member;
import com.mycat.demo.mapper.MemberMapper;
import com.mycat.demo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberMapper memberMapper;

    @Transactional
    @Override
    public int insert(Member member) {
        return memberMapper.insert(member);
    }

    @Override
    public int save(Member member) {
        return memberMapper.insert(member);
    }

    @Override
    public int updateById(Member member) {
        return memberMapper.updateById(member);
    }

    @Override
    public List<Member> selectAll() {
        return memberMapper.selectAll();
    }

    @Override
    public int deleteById(Integer id ) {
        return memberMapper.deleteById(id);
    }

    @Override
    public Member selectById(Integer id) {
        return memberMapper.selectById(id);
    }
}