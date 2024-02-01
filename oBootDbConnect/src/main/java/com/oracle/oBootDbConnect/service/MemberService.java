package com.oracle.oBootDbConnect.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oracle.oBootDbConnect.domain.Member1;
import com.oracle.oBootDbConnect.repository.MemberRepository;

@Service
public class MemberService {
	private final MemberRepository memberRepository;
	@Autowired
	public MemberService(MemberRepository memberRepository) {
		this.memberRepository = memberRepository;
	}
	
	// 회원 가입
	public Long memberSave(Member1 member) throws SQLException {
		memberRepository.save(member);
		return member.getId();
	}
	// 전체회원 조회
	public List<Member1>findMembers(){
		System.out.println("MemberService findMembers start...");
		return memberRepository.findAll();
	}

}
