
//Hugo Said Taviras Parra Matricula:

public class Mainp {
	public static void main(String[] args) {
        Camisa camisa = new Camisa("Camisa", "Zara", "M");
        Calcetines calcetines = new Calcetines("Calcetines", "Nike", 42);
        Pantalones pantalones = new Pantalones("Pantalones", "Levi's", "Azul");
        Chamarra chamarra = new Chamarra("Chamarra", "Adidas", "Cuero");
        
        camisa.desplegarInformacion();
        calcetines.desplegarInformacion();
        pantalones.desplegarInformacion();
        chamarra.desplegarInformacion();
        
        Prenda prenda = new Prenda("Prenda genérica", "Genérica");
        prenda.desplegarInformacion();
    }

}
