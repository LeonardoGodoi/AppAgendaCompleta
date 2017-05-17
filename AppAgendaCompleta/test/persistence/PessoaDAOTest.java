/** 
    Document   : index
    Created on : 05/05/2017, 01:31:06
    Author     : Leogodoi
*/
package persistence;

import bean.Pessoa;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Leogodoi
 */
public class PessoaDAOTest {
    
    public PessoaDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Teste de método getPessoa, da classe PessoaDAO.
     */
    @Test
    public void testIncluir() {
        System.out.println("incluir");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("JoaoTrinta");
        pessoa.setEmail("jt@gmail.com");
        pessoa.setEndereco("Rua Z, nº357, Braz");
        pessoa.setTelefone("998855787");
        PessoaDAO instance = new PessoaDAO();
        boolean expResult = true;
        boolean result = instance.incluir(pessoa);
        assertEquals(expResult, result);
    }

    /**
     * Teste de método getPessoa, da classe PessoaDAO.
     */
    @Test
    public void testAlterar() {
        System.out.println("alterar");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("JoaoTrinta");
        pessoa.setEmail("jt@gmail.com");
        pessoa.setEndereco("Rua Z, nº357, Braz");
        pessoa.setTelefone("998855787");
        PessoaDAO instance = new PessoaDAO();
        boolean expResult = true;
        boolean result = instance.alterar(pessoa);
        assertEquals(expResult, result);
        
    }

    /**
     * Teste de método getPessoa, da classe PessoaDAO.
     */
    @Test
    public void testExcluir() {
        System.out.println("excluir");
        int id = XXX;
        pessoa.setNome("JoaoTrinta");
        pessoa.setEmail("jt@gmail.com");
        pessoa.setEndereco("Rua Z, nº357, Braz");
        pessoa.setTelefone("998855787");
        PessoaDAO instance = new PessoaDAO();
        boolean expResult = true;
        boolean result = instance.excluir(id);
        assertEquals(expResult, result);
        
    }

    /**
     * Teste de método getPessoa, da classe PessoaDAO.
     */
    @Test
    public void testGetPessoa_int() {
        System.out.println("getPessoa");
        int id = 0;
        PessoaDAO instance = new PessoaDAO();
        Pessoa expResult = null;
        Pessoa result = instance.getPessoa(id);
        assertEquals(expResult, result);
        
    }

    /**
     * Teste de método getPessoa, da classe PessoaDAO.
     */
    @Test
    public void testGetPessoa_0args() {
        System.out.println("getPessoa");
        PessoaDAO instance = new PessoaDAO();
        List<Pessoa> expResult = null;
        List<Pessoa> result = instance.getPessoa();
        assertEquals(expResult, result);
        
    }
    
}
