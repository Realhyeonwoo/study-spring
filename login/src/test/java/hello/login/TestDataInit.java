//package hello.login;
//
//import javax.annotation.PostConstruct;
//
//import org.springframework.stereotype.Component;
//
//import hello.login.domain.item.Item;
//import hello.login.domain.item.ItemRepository;
//import hello.login.domain.member.Member;
//import hello.login.domain.member.MemberRepository;
////import hello.login.domain.member.MemberRepository;
//import lombok.RequiredArgsConstructor;
//
//@Component
//@RequiredArgsConstructor
//public class TestDataInit {
//
//	private final ItemRepository itemRepository;
//	private final MemberRepository memberRepository;
//	
//	@PostConstruct
//	public void init() {
//		itemRepository.save(new Item("itemA", 10000, 10));
//		itemRepository.save(new Item("itemB", 20000, 20));
//		
//		Member member = new Member();
//		member.setLoginId("test");
//		member.setPassword("test!");
//		member.setName("testName");
//		memberRepository.save(member);
//	}
//}
