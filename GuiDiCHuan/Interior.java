package GuiDiCHuan;

import java.util.Comparator;
import java.util.Objects;

public class Interior extends Product implements Comparator<Product> {
    private String Interior_Name;
    private Float Interior_Total;


    public Interior(String interior_Nameterior){
        this.Interior_Name=interior_Nameterior;
    }
    public Interior(String product_id, String product_name, Float product_price, int product_total, String interior_Name, Float interior_Total) {
        super(product_id, product_name, product_price, product_total);
        Interior_Name = interior_Name;
        Interior_Total = interior_Total;
    }

    public String getInterior_Name() {
        return Interior_Name;
    }

    public void setInterior_Name(String interior_Name) {
        Interior_Name = interior_Name;
    }

    public Float getInterior_Total() {
        return Interior_Total;
    }

    public void setInterior_Total(Float interior_Total) {
        Interior_Total = interior_Total;
    }

    @Override
    public String toString() {
        return super.toString()+"Interior{" +
                "Interior_Name='" + Interior_Name + '\'' +
                ", Interior_Total=" + Interior_Total +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(Interior_Name,Interior_Total,getProduct_name(),getProduct_total(),getProduct_id(),getProduct_price());
    }

    @Override
    public int compare(Product o1, Product o2) {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Interior other = (Interior) obj;
        return Objects.equals(Interior_Name, other.Interior_Name);
    }



    @Override
    public int compare(Interior o1,Interior o2) {
        return o1.Interior_Name.compareTo(o2.Interior_Name);
    }

}
