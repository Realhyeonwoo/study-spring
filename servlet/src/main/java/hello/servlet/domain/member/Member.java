package hello.servlet.domain.member;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Member {
	
	private Long id;
	private String username;
	private int age;
	
	Member() {};
	
	public Member(String username, int age) {
		this.username = username;
		this.age = age;
	}
}
