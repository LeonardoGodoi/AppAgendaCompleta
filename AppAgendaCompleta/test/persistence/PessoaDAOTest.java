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
     * Test of incluir method, of class PessoaDAO.
     */
    @Test
    public void testIncluir() {
        System.out.println("incluir");
        Pessoa pessoa = null;
        PessoaDAO instance = new PessoaDAO();
        boolean expResult = false;
        boolean result = instance.incluir(pessoa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of alterar method, of class PessoaDAO.
     */
    @Test
    public void testAlterar() {
        System.out.println("alterar");
        Pessoa pessoa = null;
        PessoaDAO instance = new PessoaDAO();
        boolean expResult = false;
        boolean result = instance.alterar(pessoa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of excluir method, of class PessoaDAO.
     */
    @Test
    public void testExcluir() {
        System.out.println("excluir");
        int id = 0;
        PessoaDAO instance = new PessoaDAO();
        boolean expResult = false;
        boolean result = instance.excluir(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPessoa method, of class PessoaDAO.
     */
    @Test
    public void testGetPessoa_int() {
        System.out.println("getPessoa");
        int id = 0;
        PessoaDAO instance = new PessoaDAO();
        Pessoa expResult = null;
        Pessoa result = instance.getPessoa(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPessoa method, of class PessoaDAO.
     */
    @Test
    public void testGetPessoa_0args() {
        System.out.println("getPessoa");
        PessoaDAO instance = new PessoaDAO();
        List<Pessoa> expResult = null;
        List<Pessoa> result = instance.getPessoa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
