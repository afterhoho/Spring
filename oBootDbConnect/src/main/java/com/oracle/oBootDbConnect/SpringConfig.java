package com.oracle.oBootDbConnect;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.oracle.oBootDbConnect.repository.MemberRepository;
import com.oracle.oBootDbConnect.repository.MemoryMemberRepository;
import com.oracle.oBootDbConnect.repository.jdbcMemberRepository;

@Configuration
public class SpringConfig {
	private final DataSource dataSource;
	public SpringConfig(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	@Bean
	public MemberRepository memberRepository() {
		return new jdbcMemberRepository(dataSource);
		//return new MemoryMemberRepository();
	}
}
