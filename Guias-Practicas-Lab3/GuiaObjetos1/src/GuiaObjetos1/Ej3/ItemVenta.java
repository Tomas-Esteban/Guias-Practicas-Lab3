package GuiaObjetos1.Ej3;

public class ItemVenta {
    public int id = 0;
    public String desc = "";
    public double cant = 0;
    public double pUnitario = 0;
    public double pTotal = pUnitario * cant;

    public ItemVenta( int id ,String desc, double cant, double pUnitario) {
        this.id = id;
        this.desc = desc;
        this.cant = cant;
        this.pUnitario = pUnitario;
    }
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getCant() {
        return cant;
    }

    public void setCant(double cant) {
        this.cant = cant;
    }

    public double getpUnitario() {
        return pUnitario;
    }

    public void setpUnitario(double pUnitario) {
        this.pUnitario = pUnitario;
    }

    @Override
    public String toString() {
        return "ItemVenta[" +
                "id=" + id + ", desc='" + desc + ", cant=" + cant + ", pUnitario=" + pUnitario + ", pTotal=" + pTotal +
                ']';
    }
}
