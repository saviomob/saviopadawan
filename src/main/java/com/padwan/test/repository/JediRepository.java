package com.padwan.test.repository;

import com.padwan.test.dto.JediDTO;
import com.padwan.test.entity.Jedi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JediRepository extends JpaRepository<Jedi, Integer> {


    @Query(value = "select * from jedi  where jedi.midichlorians > 9000", nativeQuery = true)
    List<Jedi> obterMidichloriansAlto();

    @Query(value = "SELECT count(id),status FROM JEDI group by status;", nativeQuery = true)
    List<Object> buscarJediCategoria();

    @Query(value = "select * from jedi ", nativeQuery = true)
    List<Jedi> obterMestreseAprendizes();
    
}
