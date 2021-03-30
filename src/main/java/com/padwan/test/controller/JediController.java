package com.padwan.test.controller;


import com.padwan.test.dto.JediDTO;
import com.padwan.test.service.JediService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/jedi")
public class JediController {

    @Autowired
    private JediService service;

    @GetMapping(value = "")
    public ResponseEntity<Object> todos() {
        List<JediDTO> jedis = service.findAll();
        return new ResponseEntity(jedis, HttpStatus.OK);
    }


    @PostMapping(value = "")
    public ResponseEntity<Object> incluirJedi(@RequestBody JediDTO jediDTO) {
        JediDTO novoJedi = service.incluir(jediDTO);
        return new ResponseEntity(novoJedi, HttpStatus.OK);
    }


    @GetMapping(value = "/listMasterAndNoob")
    public ResponseEntity<Object> buscarMestreseAprendizes() {
        List<JediDTO> jedis = service.buscarMestreseAprendizes();
        return new ResponseEntity(jedis, HttpStatus.OK);
    }

    @GetMapping(value = "/midichloriansAlto")
    public ResponseEntity<Object> buscarMidichloriansAlto() {
        List<JediDTO> jedis = service.buscarMidichloriansAlto();
        return new ResponseEntity(jedis, HttpStatus.OK);
    }

    @GetMapping(value = "/jedicategoria")
    public ResponseEntity<Object> buscarJediCategoria() {
        List<Object> jedis = service.buscaJediCategoria();
        return new ResponseEntity(jedis, HttpStatus.OK);
    }



}
