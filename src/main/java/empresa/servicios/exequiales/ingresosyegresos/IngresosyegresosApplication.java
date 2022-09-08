package empresa.servicios.exequiales.ingresosyegresos;

import empresa.servicios.exequiales.ingresosyegresos.entity.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IngresosyegresosApplication {

	public static void main(String[] args) {

		SpringApplication.run(IngresosyegresosApplication.class, args);


	Empresa Funeraria = new Empresa(1, "80098967", "Servicios Excequiales", "Avenida siempre viva 123", "3145678900", true);
		System.out.println("Telefono anterior "+Funeraria.getTelefono());
		Funeraria.setTelefono("Nuevo Telefono "+"3204657892");
		System.out.println(Funeraria.getTelefono());

	//////_________________________________________________________

	Empleado Juan = new Empleado(1, "1020456798", "Juan Perez", Funeraria, "Juan@correo.com", "Calle  123", "3214567890", new Rol(), true);
		System.out.println("Documento Errado "+Juan.getDocumento());
		Juan.setDocumento("Nueva Documento "+"10306579876");
		System.out.println(Juan.getDocumento());

	//////_________________________________________________________

	MovimientoDinero Compra = new MovimientoDinero(1, 300000, "Sala de Velacion",Juan, new Empresa(),new Plan(),new Producto() );
		System.out.println("Compra "+Compra.getMontoMovimiento());
		Compra.setMontoMovimiento(200F);
		System.out.println("Cambio de precio "+Compra.getMontoMovimiento());

	//////_________________________________________________________

	Plan Basico = new Plan (1, "Basico Cundinamarca" , true,"Cenizario", 500000);
		System.out.println("Cambio Nombre Plan" +Basico.getNombrePlan());
		Basico.setNombrePlan("Basico Bogota");
		System.out.println(Basico.getNombrePlan());

	//////_________________________________________________________

	Producto cofre = new Producto (1,"Cofre Azul",500000,true);
		System.out.println("Cambio precio del producto" +cofre.getValorProducto());
		cofre.setValorProducto(1200000);
		System.out.println(cofre.getValorProducto());

	}
}

