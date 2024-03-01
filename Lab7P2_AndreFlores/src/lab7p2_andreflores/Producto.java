package lab7p2_andreflores;

public class Producto {
    private String id;
    private String name;
    private String category;
    private String price;
    private String aisle;
    private String bin;

    public Producto(String id, String name, String category, String price, String aisle, String bin) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.aisle = aisle;
        this.bin = bin;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAisle() {
        return aisle;
    }

    public void setAisle(String aisle) {
        this.aisle = aisle;
    }

    public String getBin() {
        return bin;
    }

    public void setBin(String bin) {
        this.bin = bin;
    }

    

}
