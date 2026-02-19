public class CheckoutService {

    public void finalizarCompra(Pedido p, TipoNavegador navegador) {

        if ((p.getValorTotal() > 500.00) && (p.getCliente().getTempoFidelidade() > 2) && (navegador == TipoNavegador.CHROME) && (!p.getCliente().possuiDebitosPendentes())){

            System.out.println("Cliente elegível para checkout VIP.");
        }

        double precoBase = p.getQuantidade() * p.getPrecoUnitario();
        double fatorDesconto;

        if (precoBase > 1000) {
            fatorDesconto = 0.90;
        } else {
            fatorDesconto = 0.98;
        }

        double precoComDesconto = precoBase * fatorDesconto;

        double precoFinal = precoComDesconto;

        p.setValorFinal(precoFinal);
        p.setStatus("FECHADO");

        System.out.println("Compra finalizada: " + p.getValorFinal());
        System.out.println("Email enviado para: " + p.getCliente().getEmail());
    }
}
