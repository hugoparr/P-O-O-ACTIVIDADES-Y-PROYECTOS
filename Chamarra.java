
public class Chamarra extends Prenda{
	private String material;

    public Chamarra(String tipo, String marca, String material) {
        super(tipo, marca);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public void desplegarInformacion() {
        super.desplegarInformacion();
        System.out.println("Material: " + material);
    }

}
