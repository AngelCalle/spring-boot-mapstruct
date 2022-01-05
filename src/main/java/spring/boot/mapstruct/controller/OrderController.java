package spring.boot.mapstruct.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import spring.boot.mapstruct.dto.OrderDto;
import spring.boot.mapstruct.entity.OrderEntity;
import spring.boot.mapstruct.mapper.OrderMapper;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class OrderController {

	private final OrderMapper orderMapper;

	// localhost:8080/api/dto			{ "id": 321, "name": "Caramelo Entity" }
	@GetMapping("/dto")
	public ResponseEntity<OrderDto> order() {
		OrderEntity order = new OrderEntity();
		order.setId(321L);
		order.setName("Caramelo Entity");
		order.setType("delete");
		OrderDto dto = orderMapper.mapToDto(order);
		return ResponseEntity.ok(dto);
	}

	// localhost:8080/api/entity		{ "id": 321, "name": "Caramelo Dto", "type": null }
	@GetMapping("/entity")
	public ResponseEntity<OrderEntity> orderDto() {
		OrderDto orderDto = new OrderDto();
		orderDto.setId(321L);
		orderDto.setName("Caramelo Dto");
		OrderEntity dto = orderMapper.mapToEntity(orderDto);
		return ResponseEntity.ok(dto);
	}

}