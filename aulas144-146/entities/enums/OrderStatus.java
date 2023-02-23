package entities.enums;

/*
	Em Java, uma classe do tipo enum é uma classe especial que representa um conjunto fixo de constantes. 
	Cada uma dessas constantes é uma instância da classe enum e é representada como um valor separado.
*/

public enum OrderStatus {
	PENDING_PAYMENT,
	PROCESSING,
	SHIPPED,
	DELIVERED;
}
