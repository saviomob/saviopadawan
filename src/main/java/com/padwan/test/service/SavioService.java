package com.padwan.test.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SavioService {

    public List<String> skills(){
        List<String> skills = new ArrayList<>();
        skills.add("determinado");
        skills.add("em busca crescente de melhoria");
        skills.add("ouvinte");
        skills.add("primeiro procuro depois peço ajuda");
        skills.add("tempo disponível");
        skills.add("facil sociabilizacão");
        skills.add("gostar de gente que trabalha mais do que eu");
        return skills;
    }

}
