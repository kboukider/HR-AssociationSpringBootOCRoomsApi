package com.koussaila.apiOpenClassRooms;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.koussaila.apiOpenClassRooms.controller.EmployeeController;
import com.koussaila.apiOpenClassRooms.service.EmployeeService;

/*
 * exmple test unitaire
 * */

@WebMvcTest(controllers = EmployeeController.class)
public class EmployeeControllerUnitaireTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private EmployeeService employeeService;

    @Test
    public void testGetEmployees() throws Exception {
        mockMvc.perform(get("/employees"))
            .andExpect(status().isOk());
    }

}