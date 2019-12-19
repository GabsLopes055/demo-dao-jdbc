package program;

import java.util.Date;

import model.entidades.Departamentos;
import model.entidades.Vendedor;

public class Program {

	public static void main(String[] args) {

		Departamentos departamento = new Departamentos("Gabriel", 2);

		Vendedor vendedor = new Vendedor(1, "GABRIEL", "GABRIEL@GMAIL.COM", new Date(), 2500.0, departamento);

		System.out.println(vendedor);

	}

}
