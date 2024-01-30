package com.oracle.oBootHello.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oracle.oBootHello.domain.Member1;
import com.oracle.oBootHello.repository.MemberRepository;
import com.oracle.oBootHello.repository.MomoryMemberRepository;

@Service
public class MemberService {
	// 전통적
	// MemberRepository memberRepository = new MomoryMemberRepository();
	
	private final MemberRepository memberRepository;
	@Autowired
	// autowired는 빈으로 가져온것을 자동으로 멤버변수로 변환 
	public MemberService(MemberRepository memberRepository) { 
		this.memberRepository = memberRepository;
	 }
	 
	
	// 회원 가입
	public Long MemberSave(Member1 member1) {
		System.out.println("MemberService memberSave start...");
		memberRepository.save(member1);
		return member1.getId();
	}
	
	public List<Member1>allMembers(){
		System.out.println("MemberService allMembers start...");
		List<Member1>memList = null;
		memList = memberRepository.findAll();
		System.out.println("mamList.size()->"+memList.size());
		return memList;
		
	}
}
