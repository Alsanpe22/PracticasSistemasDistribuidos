import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;

import CalculadoraApp.Calculadora;
import CalculadoraApp.CalculadoraHelper;

public class Client {

	private static Calculadora calcImpl;

	public static void main(String[] args) {

		try {

			org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args, null);
			org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
			NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

			String name = "calculadora";
			calcImpl = CalculadoraHelper.narrow(ncRef.resolve_str(name));

			// Executando métodos 
            System.out.println("Metodo Multiplicacion");
            float resultadoMultiplicacao = calcImpl.multiplicar(21, 2);
            System.out.println("Resultado:  " + resultadoMultiplicacao);
            
            // Executando métodos 
            System.out.println("Metodo Division");
            float resultadoDivisao = calcImpl.dividir(29, 7);
            System.out.println("Resultado:  " + resultadoDivisao);

			System.out.println("Raiz");
            double resultadoRaiz = calcImpl.raiz(29);
            System.out.println("Resultado:  " + resultadoRaiz);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}