/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seguritech.hospital.controllers;

import com.seguritech.hospital.domain.Rol;
import com.seguritech.hospital.service.RolService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 *
 * @author Werner
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RolControllerTest {

    private MockMvc mockMvc;

    private RolController rolController;

    @Mock
    private RolService rolService;

    public RolControllerTest() {
    }

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        Rol rol = new Rol();
        rol.setId(1L);
        rol.setDescripcion("ADMINISTRADOR");
        Mockito.when(rolService.findOne(1L)).thenReturn(rol);

        rolController = new RolController(rolService);
        
        mockMvc = MockMvcBuilders.standaloneSetup(rolController).build();
    }
//
//    @Test
//    public void testListAll_0args() {
//        System.out.println("listAll");
//        List<Rol> listAll = rolController.listAll();
//        assertEquals(2, listAll.size());
//    }
//

    @Test
    public void testGetRol_isOkWhenRolIsFound() throws Exception {
        System.out.println("getRol");
        final long id = 1;

        mockMvc.perform(get("/rol/" + id)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").isNumber())
                .andExpect(jsonPath("$.id").value(id))
                .andExpect(jsonPath("$.descripcion").isString());
    }

    @Test
    public void testGetRol_isError404WhenRolIsNotFound() throws Exception {
        System.out.println("getRol");
        final long id = 2;

        mockMvc.perform(get("/rol/" + id)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isNotFound())
                .andExpect(content().string(""));
    }

//    { "id": numerico,
//        "descripcion": string
//                }
//
//    @Test
//    public void testListAll_String() {
//        System.out.println("listAll");
//        String descripcion = "";
//        RolController instance = new RolController();
//        List<Rol> expResult = null;
//        List<Rol> result = instance.listAll(descripcion);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testCreate() throws Exception {
//        System.out.println("create");
//        Rol rol = null;
//        RolController instance = new RolController();
//        ResponseEntity<Rol> expResult = null;
//        ResponseEntity<Rol> result = instance.create(rol);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testUpdate() throws Exception {
//        System.out.println("update");
//        Rol rol = null;
//        RolController instance = new RolController();
//        ResponseEntity<Rol> expResult = null;
//        ResponseEntity<Rol> result = instance.update(rol);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testDeleteRol() {
//        System.out.println("deleteRol");
//        Long id = null;
//        RolController instance = new RolController();
//        ResponseEntity<Rol> expResult = null;
//        ResponseEntity<Rol> result = instance.deleteRol(id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
}
