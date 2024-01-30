package com.oracle.oBootHello.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.oracle.oBootHello.domain.Member1;

//@Repository
public class MomoryMemberRepository implements MemberRepository {
	private static Map<Long, Member1> store =new HashMap<Long, Member1>();
	private static Long sequence = 0L;
	// 초기화
	@Override
	public Member1 save(Member1 member1) {
		member1.setId(++sequence);
		store.put(member1.getId(), member1);
		System.out.println("MomoryMemberRepository sequence=>"+sequence);
		System.out.println("MomoryMemberRepository momber1.getName()->"+member1.getName());
		return member1;
	}
	// 이건 보고 
	@Override
	public List<Member1> findAll() {
		System.out.println("MomoryMemberRepository findAll start...");
		//store의 value(Member1)
		List<Member1>listMember = new ArrayList<>(store.values());
		System.out.println("MomoryMemberRepository findAll listMember.size()"+listMember.size());
		return listMember;
	}
	// listmember에 store values만 가져옴 Map 
}
