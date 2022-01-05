package spring.boot.mapstruct.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import spring.boot.mapstruct.dto.OrderDto;
import spring.boot.mapstruct.entity.OrderEntity;

@Mapper(componentModel = "spring")
public interface OrderMapper {

	OrderDto mapToDto(OrderEntity order);
	
	@Mapping(target = "type", ignore = true)
	OrderEntity mapToEntity(OrderDto orderDto);

}
