package com.shopping.api;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.shopping.api.controller.PromotionController;
import com.shopping.api.dto.PromotionDto;
import com.shopping.api.service.PromotionService;

@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = PromotionController.class)
public class PromotionControllerTest {
	@Autowired
	private MockMvc mvc;

	@Autowired
	private ObjectMapper objectMapper;

	@MockBean
	private PromotionService promotionService;

	@Test
	public void createPromotionTest() throws Exception {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		
		PromotionDto promotionDto = new PromotionDto("행사명", 1500, df.parse("2022-06-01"), df.parse("2022-06-30"));

		String content = objectMapper.writeValueAsString(promotionDto);
		String url = "/promotion";

		mvc.perform(
				post(url).contentType(MediaType.APPLICATION_JSON).content(content).accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andDo(print());
	}

	@Test
	public void deletePromotionTest() throws Exception {
		String url = "/promotion/7";

		mvc.perform(delete(url).contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andDo(print());
	}
}
