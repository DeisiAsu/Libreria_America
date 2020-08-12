import java.util.Scanner;
public class Tienda {
	
    public static void main(String[] args) {
		
		Productos producto = new Productos();
		Usuarios usuario = new Usuarios();
		
		String exit="exit";
		String programaEncendido= "ON";
		String cerrar ="cerrar";
		int intentos =0;
		
		
		do {
			
			Scanner datoUserName = new Scanner(System.in);
			System.out.println("");
			System.out.println(producto.Nombre_tienda);
			System.out.println("*-------------------*");
			System.out.print("user: ");
			String user = datoUserName.nextLine();
			
			for(int j = 0; j<2;j++) {    
			
				if(user.equals(usuario.userName[j])) {
					
					do {
					
					Scanner datoPassword = new Scanner(System.in); 
					System.out.print("password: ");
					String pass = datoPassword.nextLine();
					
					if(pass.contentEquals(usuario.password[j])) {
						
						
						
						do {
							Scanner datoCodigo = new Scanner(System.in);
							System.out.println("*-                  -*");
							System.out.print("codigo o producto: ");
							String rCodigo = datoCodigo.nextLine();
							System.out.println("*-                  -*");
							
							
							if(rCodigo.equalsIgnoreCase("exit")) {
								
								exit="salir";
							}else {
								
								for(int i = 0;i<producto.nombreProductos.length;i++) {
									
									if(rCodigo.equalsIgnoreCase(producto.nombreProductos [i])) {
										
										System.out.println("Código:       "+producto.codigo [i]);
										System.out.println("Nombre:       "+producto.nombreProductos [i]);
										System.out.println("Proveedor:    "+producto.proveedor [i]);
										System.out.println("Existencia:   "+producto.existencias [i]);
										System.out.println("Precio:       "+producto.precio[i]);
										System.out.println("Descripción:  "+producto.descripcion [i]);
									}
								}
								
                                 for(int i = 0;i<producto.codigo.length;i++) {
									
									if(rCodigo.equalsIgnoreCase(producto.codigo [i])) {
										
										System.out.println("Código:       "+producto.codigo [i]);
										System.out.println("Nombre:       "+producto.nombreProductos [i]);
										System.out.println("Proveedor:    "+producto.proveedor [i]);
										System.out.println("Existencia:   "+producto.existencias [i]);
										System.out.println("Precio:       "+producto.precio[i]);
										System.out.println("Descripción:  "+producto.descripcion [i]);
									}
								}
								
							}
						}while(exit.equalsIgnoreCase("exit"));//false
						

					}else {
						System.out.println("Contraseña incorrecta");
						
						intentos++;
					}
					
					}while(intentos<=2);
					
					intentos=0;
				}
				else if (user.equalsIgnoreCase("off")) {
					programaEncendido ="off";
				}
			
			}
			
		}while(programaEncendido.equalsIgnoreCase("ON"));//true
		
		System.out.println("Que tengas un buen día.");
	}
}
			   




