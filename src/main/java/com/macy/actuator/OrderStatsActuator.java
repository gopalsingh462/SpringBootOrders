package com.macy.actuator;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import com.macy.repository.OrderMessageJsonRepository;
import com.macy.repository.OrderMessageXMLRepository;

@Component
@Endpoint(id="orderstats")
public class OrderStatsActuator {
	@Autowired
	OrderMessageJsonRepository orderMessageJsonRepository;
	
	@Autowired
	OrderMessageXMLRepository orderMessageXMLRepository;
	
	@ReadOperation
	public Map<String, Long> getOrderStats() {
		Map<String, Long> map = new HashMap<>();
		map.put("Json Orders Consumed", orderMessageJsonRepository.count());
		map.put("XML Orders Consumed", orderMessageXMLRepository.count());
		return map;
	}
}
