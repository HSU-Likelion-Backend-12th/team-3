package hello.hellospring.config;

import hello.hellospring.repository.*;
import hello.hellospring.service.MemberService;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
	private final MemberRepository memberRepository;

	public SpringConfig(@Qualifier("springDataJpaMemberRepository") MemberRepository memberRepository) {
		this.memberRepository = memberRepository;
	}

	@Bean
	public MemberService memberService() {
		return new MemberService(memberRepository);
	}
}
