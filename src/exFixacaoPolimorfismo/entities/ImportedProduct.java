package exFixacaoPolimorfismo.entities;

public class ImportedProduct extends Product{
    private Double customsFee;

    public ImportedProduct() {
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double totalPrice() {
        return getPrice() + customsFee;
    }

    @Override
    public final String priceTag() {
    return getName() + " $ " + String.format("%.2f", customsFee)
            + " (CustomsFree : $ "+ String.format("%.2f", customsFee) + ")";
    }
}
