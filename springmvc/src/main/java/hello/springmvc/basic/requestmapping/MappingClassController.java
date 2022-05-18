package hello.springmvc.basic.requestmapping;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/mapping/users")
public class MappingClassController {

	@GetMapping("/users")
	public String getUserList() {
		log.info("getUserList");
		return "user-list";
	}
	
	@PostMapping("/users")
	public String addUser(@RequestParam String username, @RequestParam int age) {
		log.info("username={}, age={}", username, age);
		return "user-add";
	}
	
	@GetMapping("/users/{userId}")
	public String findUser(@PathVariable String userId) {
		log.info("userId = {}", userId);
		return "user-find";
	}
	
	@PatchMapping("/users/{userId}")
	public String updateUser(@PathVariable String userId) {
		log.info("userId = {}", userId);
		return "user-update";
	}
	
	@DeleteMapping("/users/{userId}")
	public String deleteUser(@PathVariable String userId) {
		log.info("userId = {}", userId);
		return "user-delete";
	}
	
}
