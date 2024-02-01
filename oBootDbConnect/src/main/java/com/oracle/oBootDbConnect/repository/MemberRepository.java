package com.oracle.oBootDbConnect.repository;

import java.sql.SQLException;
import java.util.List;

import com.oracle.oBootDbConnect.domain.Member1;

public interface MemberRepository {

	Member1 save (Member1 member1) throws SQLException;
	List<Member1>findAll();
}
