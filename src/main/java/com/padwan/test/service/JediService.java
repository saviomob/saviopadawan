package com.padwan.test.service;

import com.padwan.test.dto.JediDTO;
import com.padwan.test.entity.Jedi;
import com.padwan.test.entity.JediConsultaCategoria;
import com.padwan.test.entity.StatusEnum;
import com.padwan.test.repository.JediRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JediService {

    @Autowired
    private JediRepository repository;

    public List<JediDTO> findAll() {
        List<Jedi> jedis = repository.findAll();
        List<JediDTO> listJedis = new ArrayList<>();
        jedis.forEach(it -> listJedis.add(new JediDTO(it)));
        return listJedis;
    }

    public JediDTO incluir(JediDTO jediDTO) {
        Jedi jedi = new Jedi();
        jedi.setId(jediDTO.getId());
        jedi.setNome(jediDTO.getNome());
        jedi.setMentor(jediDTO.getMentor());
        jedi.setStatus(jediDTO.getStatus());
        jedi.setMidichlorians(jediDTO.getMidichlorians());
        return new JediDTO(repository.save(jedi));
    }

    public List<JediDTO> buscarMestreseAprendizes(){
        List<Jedi> jedis = repository.obterMestreseAprendizes();
        List<JediDTO> listJedis = new ArrayList<>();
        jedis.forEach(it -> listJedis.add(new JediDTO(it)));
         return listJedis;
    }

    public List<JediDTO> buscarMidichloriansAlto(){
        List<Jedi> jedis = repository.obterMidichloriansAlto();
        List<JediDTO> listJedis = new ArrayList<>();
        jedis.forEach(it -> listJedis.add(new JediDTO(it)));
        return listJedis;
    }

    public List<JediConsultaCategoria> buscaJediCategoria(){
        List<Object> jedis = repository.buscarJediCategoria();
        List<JediConsultaCategoria> listJedis = new ArrayList<>();
        jedis.forEach(it -> listJedis.add(new JediConsultaCategoria(Integer.valueOf(it.toString()), Integer.valueOf(it.toString()))));
        return jedis;
    }



}
