package hello.springmvc.basic.requestmapping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class MappingController {

	@RequestMapping({ "/hello-basic", "hello-go" })
	public String helloBasic() {
		log.info("helloBasic");

		return "OK";
	}

	@RequestMapping(value = "/mapping-get-v1", method = RequestMethod.GET)
	public String mappingGetV1() {
		log.info("mappingGetV1");
		return "OK";
	}

	@GetMapping(value = "mapping-get-v2")
	public String mappingGetV2() {
		log.info("mapping-get-v2");
		return "OK";
	}

	@GetMapping("/mapping/{userId}")
	public String mappingPath(@PathVariable("userId") String data) {
		log.info("mappingPath userId = {}", data);
		return "OK";
	}

	@GetMapping("/mapping/users/{userId}/orders/{orderId}")
	public String mappingPath(@PathVariable String userId, @PathVariable Long orderId) {
		log.info("mappingPath userId={}, orderId={}", userId, orderId);
		return "OK";
	}

	@GetMapping(value = "/mapping-param", params = "mode=debug")
	public String mappingParam() {
		log.info("mappingParam");
		return "OK";
	}

	@GetMapping(value = "/mapping-header", headers = "mode=debug")
	public String mappingHeader() {
		log.info("mappingHeader");
		return "ok";
	}
	
	 @PostMapping(value = "/mapping-consume", consumes = "application/json")
	  public String mappingConsumes() {
	      log.info("mappingConsumes");
	      return "ok";
	  }
	 
	 @PostMapping(value = "/mapping-produce", produces = "text/html")
	  public String mappingProduces() {
	      log.info("mappingProduces");
	      return "ok";
	  }
}
