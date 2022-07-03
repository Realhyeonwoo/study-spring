
package hello.itemservice.domain.item;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

import lombok.Data;

@Data
public class ItemUpdateForm {
	
	@NotBlank
	private Long id; 
	
	@NotBlank
	private String itemName;
	
	@NotNull
	@Range(min = 100, max = 100000)
	private Integer price;
	
	private Integer quantity;
}
