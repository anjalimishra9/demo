package com.example.demo.api;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.demo.model.Operations;
import com.example.demo.service.OperationsService;

@WebMvcTest(OperationsController.class)
public class OperationsControllerTests {
	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private OperationsService operationsService;

	Operations RECORD_1 = new Operations("AAMP", "DE14378", "Hamburg Anckelmannsplatz", "Anckelmannsplatz", "ÜST",
			"Üst", "Betrieb", LocalDate.of(2020, 4, 1), null, 2, "Nord", LocalDate.of(2020, 10, 29));

	@Test
	public void getAllRecords_Success() throws Exception {
		Mockito.when(operationsService.getOperationsByRL100Code("aamp")).thenReturn(RECORD_1);

		mockMvc.perform(MockMvcRequestBuilders.get("/operations/aamp").contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(jsonPath("$", notNullValue()))
				.andExpect(jsonPath("$.rl100_Code", is("AAMP")))
				.andExpect(jsonPath("$.rl100_LangName", is("Hamburg Anckelmannsplatz")));
	}

	@Test
	public void getAllRecords_NotFound() throws Exception {
		Mockito.when(operationsService.getOperationsByRL100Code("aamp1")).thenReturn(null);

		mockMvc.perform(MockMvcRequestBuilders.get("/operations/aamp1").contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isNotFound());
	}

}
