import CalculadoraApp.CalculadoraPOA;

public class CalculadoraHP extends CalculadoraPOA {

	@Override
	public float sumar(float n1, float n2) {
		return (n1 + n2);
	}

	@Override
	public float restar(float n1, float n2) {
		return (n1 - n2);
	}

	@Override
	public float multiplicar(float n1, float n2) {
		return (n1 * n2);
	}

	@Override
	public float dividir(float n1, float n2) {
		return (n1 / n2);
	}

	@Override
	public double raiz(double n1) {
		return (Math.sqrt(n1));
	}

}