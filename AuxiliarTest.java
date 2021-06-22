// Direitos Autorais, PUCRS/Escola Politécnica
// Atualização: 2021-06-21
// https://github.com/Adilsontc/jgforca

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * A classe de teste AuxiliarTest.
 *
 * @author Adilson T Carmo (adilson.carmo@pucrs.br) 
 * @version 1.1 (2021-06-21) 
 */
public class AuxiliarTest
{
    /**
     * Construtor default para a classe de teste AuxiliarTest
     */
    public AuxiliarTest()
    {
    }

    /**
     * Define a .
     *
     * Chamado antes de cada método de caso de teste.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Chamado após cada método de teste de caso.
     */
    @AfterEach
    public void tearDown()
    {
    }
    
    /**
     * Ferifica se a palavra sorteada é diferente da palavra solicitada no método abaixo.
     */
    @Test
    public void sorteioPalavraDiferenteDaLista()
    {
        assertNotEquals("URUBU", Auxiliar.palavraSorteada());
    }
}
