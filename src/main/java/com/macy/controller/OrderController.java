package com.macy.controller;

import java.util.HashMap;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.macy.dto.FulFillmentOrder;
import com.macy.dto.OrderJsonDto;
import com.macy.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	OrderService orderService;

	@PutMapping(value = "{id}", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public boolean updateOrderStatus(@RequestParam HashMap<String, String> formData, @PathVariable("id") Integer id) {
		String status = formData.get("status");
		return orderService.updateXMLOrderStatus(id, status);
	}

	@GetMapping(value = "getjsonorders", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<OrderJsonDto> getAllJsonOrders() {
		return orderService.getJsonOrders();
	}

	@GetMapping(value = "getxmlorders", produces = MediaType.APPLICATION_XML_VALUE)
	public List<FulFillmentOrder> getAllXmlOrders() {
		return orderService.getXmlOrders();
	}

}
