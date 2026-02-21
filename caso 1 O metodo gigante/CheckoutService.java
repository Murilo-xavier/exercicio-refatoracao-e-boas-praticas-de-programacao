public class CheckoutService {
    private static final double VALOR_MINIMO_DA_COMPRA = 500.0;
    private static final int TEMPO_FIDELIDADE_MINIMO = 2;
    private static final double DESCONTO_VIP = 0.90f;
    private final double DESCONTO_REGULAR = 0.98f;

    private boolean clienteElegivel(Pedido pedido, TipoNavegador navegador) {

        boolean valorMinimoAtingido = pedido.getValorTotal() >= VALOR_MINIMO_DA_COMPRA;
        boolean tempoFidelidade = pedido.getCliente().getTempoFidelidade() >= TEMPO_FIDELIDADE_MINIMO;
        boolean navegadorCompativel = navegador == TipoNavegador.CHROME;
        boolean semDebitos = !pedido.getCliente().possuiDebitosPendentes();

        return valorMinimoAtingido && tempoFidelidade && navegadorCompativel && semDebitos;
    }

    private double calcularPrecoBase(Pedido pedido) {
        double precoBase = pedido.getQuantidade() * pedido.getPrecoUnitario();
        return precoBase;
    }

    private double aplicarDesconto(double precoBase) {
        double fatorDesconto;

        if (precoBase > 1000) {
            fatorDesconto = DESCONTO_VIP;
        } else {
            fatorDesconto = DESCONTO_REGULAR;
        }

        return precoBase * fatorDesconto;
    }

    private void notificarClienteEmail(Pedido pedido) {
        System.out.println("Email de confirmação enviado para: " + pedido.getCliente().getEmail());
    }
    
    public void finalizarCompra(Pedido pedido, TipoNavegador navegador) {
        double precoBase = calcularPrecoBase(pedido);
        double precoFinal = precoBase;

        if (clienteElegivel(pedido, navegador)) {
            System.out.println("Cliente elegível para checkout VIP.");
            precoFinal = aplicarDesconto(precoBase);
        }else {
            System.out.println("Cliente não elegível para checkout VIP. Preço normal aplicado.");
        }

        pedido.setValorFinal(precoFinal);
        pedido.setStatus("FECHADO");

        System.out.println("Compra finalizada: " + pedido.getValorFinal());
        notificarClienteEmail(pedido);
    }
}
