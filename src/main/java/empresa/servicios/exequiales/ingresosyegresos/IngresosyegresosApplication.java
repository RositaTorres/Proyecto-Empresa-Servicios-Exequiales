package empresa.servicios.exequiales.ingresosyegresos;

import empresa.servicios.exequiales.ingresosyegresos.entity.Empleado;
import empresa.servicios.exequiales.ingresosyegresos.entity.Empresa;
import empresa.servicios.exequiales.ingresosyegresos.entity.MovimientoDinero;
import empresa.servicios.exequiales.ingresosyegresos.entity.Rol;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;

@SpringBootApplication
public class IngresosyegresosApplication {

	public static void main(String[] args) {
		
		
		SpringApplication.run(IngresosyegresosApplication.class, args);

		Empresa Funeraria = new Empresa(1,"80098967","Servicios Excequiales","Avenida siempre viva 123","3145678900", true);
		System.out.println("Telefono anterior " + Funeraria.getTelefono());
		Funeraria.setTelefono("Nuevo Telefono " + "3204657892");
		System.out.println(Funeraria.getTelefono());

		//////_________________________________________________________

		Empleado Juan = new Empleado(1,"1020456798","Juan Perez",Funeraria,"Juan@correo.com","Calle  123","3214567890", new Rol(),true);
		System.out.println("Documento Errado " + Juan.getDocumento());
		Juan.setDocumento("Nueva empresa " + "10306579876");
		System.out.println(Juan.getDocumento());

		//////_________________________________________________________

		MovimientoDinero Ingreso = new MovimientoDinero(1,2323,"Ingreso",Juan);
		System.out.println("Ingreso " + Ingreso.getMontoMovimiento());
		Ingreso.setMontoMovimiento(200F);
		System.out.println(Ingreso.getMontoMovimiento());

	}


}
