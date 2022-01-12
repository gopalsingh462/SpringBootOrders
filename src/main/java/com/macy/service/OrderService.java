package com.macy.service;

import com.macy.dto.FulFillmentOrder;
import com.macy.dto.OrderJsonDto;
import java.util.List;

public interface OrderService {
	public boolean updateXMLOrderStatus(Integer orderId, String status);
	public List<OrderJsonDto> getJsonOrders();
	public List<FulFillmentOrder> getXmlOrders();
}
