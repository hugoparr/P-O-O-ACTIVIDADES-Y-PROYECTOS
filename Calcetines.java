
public class Calcetines extends Prenda {
	private int size;

    public Calcetines(String tipo, String marca, int size) {
        super(tipo, marca);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void desplegarInformacion() {
        super.desplegarInformacion();
        System.out.println("Tamaño: " + size);
    }

}
