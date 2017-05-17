package controller;

import bean.Pessoa;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import persistence.PessoaDAO;

/**
 *
 * @author Leogodoi
 */
public class PessoaSV extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String action = request.getParameter("action");

        if (action.equals("novo")) {
            request.setAttribute("objPessoa", new Pessoa());
            request.getRequestDispatcher("frmpessoa.jsp").forward(request, response);
        } else if (action.equals("listar")) {
            request.setAttribute("lstPessoa", new PessoaDAO().getPessoa());
            request.getRequestDispatcher("lstpessoa.jsp").forward(request, response);
        } else if (action.equals("salvar")) {
            if (save(request)) {
                request.setAttribute("msg", "Operacao realizada com sucesso");
            } else {
                request.setAttribute("msg", "Erro ao realizar");
            }
            request.setAttribute("objPessoa", new Pessoa());
            request.getRequestDispatcher("frmpessoa.jsp").forward(request, response);
        } else if (action.equals("editar")) {
            int id = Integer.parseInt(request.getParameter("id"));
            request.setAttribute("objPessoa", new PessoaDAO().getPessoa(id));
            request.getRequestDispatcher("frmpessoa.jsp").forward(request, response);
        } else if (action.equals("excluir")) {
            int id = Integer.parseInt(request.getParameter("id"));
            new PessoaDAO().excluir(id);
            request.setAttribute("lstPessoa", new PessoaDAO().getPessoa());
            request.getRequestDispatcher("frmpessoa.jsp").forward(request, response);

        }
    }

    private boolean save(HttpServletRequest request) {
        Pessoa pessoa = new Pessoa();
        pessoa.setId(Integer.parseInt(request.getParameter("id")));
        pessoa.setNome(request.getParameter("nome"));
        pessoa.setEmail(request.getParameter("email"));
        pessoa.setTelefone(request.getParameter("telefone"));
        pessoa.setEndereco(request.getParameter("endereco"));

        if (pessoa.getId() == 0) {
            return new PessoaDAO().incluir(pessoa);
        } else {
            return new PessoaDAO().alterar(pessoa);

        }
    }

}
