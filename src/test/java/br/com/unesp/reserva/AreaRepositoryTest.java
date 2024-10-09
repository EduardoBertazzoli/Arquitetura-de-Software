/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unesp.reserva;

import br.com.unesp.reserva.model.Area;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

/**
 *
 * @author Carlo
 */
@DataJpaTest
public class AreaRepositoryTest {
    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void testPersistArea() {
        Area area = new Area();
       
        area.setNome("Teste");
        area.setDescricao("Descrição de Teste");
        area.setTamanhoMetroQuadrado(100);
        area.setUtilizavel(true);

        Area savedArea = entityManager.persistFlushFind(area);
        assertNotNull(savedArea.getId());
    }
}

