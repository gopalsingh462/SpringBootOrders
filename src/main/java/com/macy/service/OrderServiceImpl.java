package com.macy.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.macy.dto.FulFillmentOrder;
import com.macy.dto.OrderJsonDto;
import com.macy.entity.OrderJsonEntity;
import com.macy.entity.OrderXMLEntity;
import com.macy.exception.InvalidOrderIdException;
import com.macy.repository.OrderMessageJsonRepository;
import com.macy.repository.OrderMessageXMLRepository;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	OrderMessageJsonRepository orderMessageJsonRepository;
	
	@Autowired
	OrderMessageXMLRepository orderMessageXMLRepository;
	
	@Autowired
	ModelMapper modelMapper;
	
	
	@Override
	public boolean updateXMLOrderStatus(Integer orderId, String status) {
		Optional<OrderXMLEntity> optional = orderMessageXMLRepository.findById(orderId);
		if(optional.isPresent()) {
			OrderXMLEntity entity = optional.get();
			entity.setOrderStatus(status);
			orderMessageXMLRepository.save(entity);
			return true;
		}else {
			throw new InvalidOrderIdException();
		}
	}

	@Override
	public List<OrderJsonDto> getJsonOrders() {
		List<OrderJsonEntity> list = orderMessageJsonRepository.findAll();
		return convertJsonOrderEntityListToDtoList(list);
	}

	@Override
	public List<FulFillmentOrder> getXmlOrders() {
		List<OrderXMLEntity> list = orderMessageXMLRepository.findAll();
		return convertXmlOrderEntityListToDtoList(list);
	}
	
	private List<OrderJsonDto> convertJsonOrderEntityListToDtoList(List<OrderJsonEntity> list) {
		List<OrderJsonDto> list1 = new ArrayList<>();
		for(OrderJsonEntity entity: list) {
			list1.add(modelMapper.map(entity, OrderJsonDto.class));
		}
		return list1;
	}
	
	private List<FulFillmentOrder> convertXmlOrderEntityListToDtoList(List<OrderXMLEntity> list) {
		List<FulFillmentOrder> list1 = new ArrayList<>();
		for(OrderXMLEntity entity: list) {
			list1.add(modelMapper.map(entity, FulFillmentOrder.class));
		}
		return list1;
	}


}
