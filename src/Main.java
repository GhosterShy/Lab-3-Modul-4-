import java.util.Arrays;
import java.util.List;

class Invoice {
    private int id;
    private List<Item> items;
    private double taxRate;

    public Invoice(int id, List<Item> items, double taxRate) {
        this.id = id;
        this.items = items;
        this.taxRate = taxRate;
    }

    public int getId() {
        return id;
    }

    public List<Item> getItems() {
        return items;
    }

    public double getTaxRate() {
        return taxRate;
    }
}

class InvoiceCalculator {


    public double calculateTotal(Invoice invoice) {
        double subTotal = 0;
        for (Item item : invoice.getItems()) {
            subTotal += item.getPrice();
        }
        return subTotal + (subTotal * invoice.getTaxRate());
    }
}

 class InvoiceRepository {


    public void saveToDatabase(Invoice invoice) {
        System.out.println("Invoice with ID " + invoice.getId() + " saved to the database.");

    }
}

class Item {
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}



public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("Laptop", 1000);
        Item item2 = new Item("Mouse", 50);
        List<Item> items = Arrays.asList(item1, item2);

        // Создаем счет-фактуру
        Invoice invoice = new Invoice(1, items, 0.1);

        // Рассчитываем сумму
        InvoiceCalculator calculator = new InvoiceCalculator();
        double total = calculator.calculateTotal(invoice);
        System.out.println("Total invoice amount: " + total);

        // Сохраняем счет в базу данных
        InvoiceRepository repository = new InvoiceRepository();
        repository.saveToDatabase(invoice);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
}