package control;

import dto.tbVendaDTO;
import java.sql.SQLException;
import java.util.List;
import model.VendaDAO;


public class VendaFacade {
    private VendaDAO vendaDAO = new VendaDAO();
    
    private tbVendaDTO vendaselecionada;
    private List<tbVendaDTO> vendas;


    public VendaFacade() {
    }

    public tbVendaDTO getVendaselecionada() {
        return vendaselecionada;
    }

    public void setVendaselecionada(tbVendaDTO vendaselecionada) {
        this.vendaselecionada = vendaselecionada;
    }

    public List<tbVendaDTO> getVendas() {
        return vendas;
    }
    
    public String preparaVenda(){
        vendaselecionada = new tbVendaDTO();
        return "VaiParaVenda";
    }
    
    public String finalizaVenda() throws SQLException, ClassNotFoundException{
        vendaDAO.adicionar(vendaselecionada);
        vendas = null;
        return "VoltaMenu";
    }
}
