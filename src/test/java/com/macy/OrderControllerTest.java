package com.macy;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.macy.controller.OrderController;
import com.macy.entity.ContactEntity;
import com.macy.entity.OrderTotalsEntity;
import com.macy.entity.OrderXMLEntity;
import com.macy.entity.SourceEntity;
import com.macy.service.OrderService;

@WebMvcTest(OrderController.class)
public class OrderControllerTest {

	@Autowired
	MockMvc mockMvc;

	@MockBean
	OrderService orderService;

//	OrderXMLEntity entity1 = new OrderXMLEntity(1, "Digital", "SAN123", "Created", "2017-08-16T15:20:29.657-04:00",
//			"POOL", 110, "Order is created", 0, 0, new SourceEntity(0, null, null, null, null, null),
//			new OrderTotalsEntity(0, 0, 0), new ContactEntity(0, null, null, null, null, null, null, false, null, 0));
//	OrderXMLEntity entity2 = new OrderXMLEntity(2, "Digital", "SAN124", "Created", "2017-08-16T15:20:29.657-04:00",
//			"POOL", 110, "Order is created", 0, 0, new SourceEntity(0, null, null, null, null, null),
//			new OrderTotalsEntity(0, 0, 0), new ContactEntity(0, null, null, null, null, null, null, false, null, 0));

	@Test
	public void testUpdateOrderStatus() throws Exception {
		Mockito.when(orderService.updateXMLOrderStatus(1, "Confirmed")).thenReturn(true);
		mockMvc.perform(MockMvcRequestBuilders
				.put("/order/1").
				param("status", "Confirmed")
				.contentType(MediaType.APPLICATION_FORM_URLENCODED_VALUE))
		.andExpect(status().isOk())
		.andExpect(MockMvcResultMatchers.content().string("true"));

	}
}
