package hello.hellospring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;

@Service
public class MemberService {
	private final MemberRepository memberRepository;
	
	@Autowired
	public MemberService(MemberRepository memberRepository) {
		this.memberRepository = memberRepository;
	}
	
	/*
	회원가입
	*/
	public Long join(Member member) {
		//같은 이름이 있는 중복 회원 확인
		memberRepository.findByName(member.getName())
			.ifPresent(m-> {
				throw new IllegalStateException("이미 존재하는 회원입니다.");
			});
		
		memberRepository.save(member);
		return member.getId();
	}
	
	/*
	전체 회원 조회
	*/
	public List<Member> findMembers() {
		return memberRepository.findAll();
	}
	
	public Optional<Member> findOne(Long memberId) {
		return memberRepository.findById(memberId);
	}
}
