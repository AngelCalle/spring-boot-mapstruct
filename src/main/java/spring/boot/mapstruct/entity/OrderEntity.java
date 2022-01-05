package spring.boot.mapstruct.entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class OrderEntity {

	private Long id;
	private String name;
	private String type;

}
