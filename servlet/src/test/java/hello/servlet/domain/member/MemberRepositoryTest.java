package hello.servlet.domain.member;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class MemberRepositoryTest {
	
	MemberRepository memberRepository = MemberRepository.getInstance();
	
	@AfterEach
	void afterEach() {
		memberRepository.clearStore();
	}
	
	@Test
	void save() {
		//given
		Member member = new Member("hello", 20);
		
		//when
		Member saveMember = memberRepository.save(member);
		
		//then
		Member findMember = memberRepository.findById(saveMember.getId());
		Assertions.assertThat(findMember).isEqualTo(saveMember);
	}
	
	@Test
	void findAll() {
		//given
		Member member1 = new Member("user1", 21);
		Member member2 = new Member("user2", 22);
		
		memberRepository.save(member1);
		memberRepository.save(member2);
		
		//when
		List<Member> result = memberRepository.findAll();
		
		//then
		Assertions.assertThat(result.size()).isEqualTo(2);
	}
}
