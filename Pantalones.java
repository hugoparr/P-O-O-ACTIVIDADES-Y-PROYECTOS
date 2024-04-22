
public class Pantalones extends Prenda{
    private String color;

    public Pantalones(String tipo, String marca, String color) {
        super(tipo, marca);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void desplegarInformacion() {
        super.desplegarInformacion();
        System.out.println("Color: " + color);
    }

}
