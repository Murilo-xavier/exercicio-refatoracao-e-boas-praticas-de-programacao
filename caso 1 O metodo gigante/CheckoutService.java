public class CheckoutService {
    private final double VALOR_MINIMO_DA_COMPRA = 500.0;
    private final int TEMPO_FIDELIDADE_MINIMO = 2;

    private boolean clienteElegivel(Pedido pedido, TipoNavegador navegador) {

        boolean valorMinimoAtingido = pedido.getValorTotal() > VALOR_MINIMO_DA_COMPRA;
        boolean tempoFidelidade = pedido.getCliente().getTempoFidelidade() > TEMPO_FIDELIDADE_MINIMO;
        boolean navegadorCompativel = navegador == TipoNavegador.CHROME;
        boolean semDebitos = !pedido.getCliente().possuiDebitosPendentes();

        return valorMinimoAtingido && tempoFidelidade && navegadorCompativel && semDebitos;
    }

    public void finalizarCompra(Pedido pedido, TipoNavegador navegador) {

        if (clienteElegivel(pedido, navegador)) {
            System.out.println("Cliente elegível para checkout VIP.");
        }

        double precoBase = pedido.getQuantidade() * pedido.getPrecoUnitario();
        double fatorDesconto;

        if (precoBase > 1000) {
            fatorDesconto = 0.90;
        } else {
            fatorDesconto = 0.98;
        }

        double precoComDesconto = precoBase * fatorDesconto;

        double precoFinal = precoComDesconto;

        pedido.setValorFinal(precoFinal);
        pedido.setStatus("FECHADO");

        System.out.println("Compra finalizada: " + pedido.getValorFinal());
        System.out.println("Email enviado para: " + pedido.getCliente().getEmail());
    }
}
