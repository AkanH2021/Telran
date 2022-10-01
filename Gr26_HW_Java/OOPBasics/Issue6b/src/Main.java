import java.util.ArrayList;
import java.util.List;

public class Main {
    /* 1) Допустим, у нас есть магазин, В нашем магазине есть товары трех категорий: продукты, електроника
    (моб. телефоны и ноутбуки), одежда. У каждого товара есть цена и наименование.
Каждый товар можно купить (покупателю выставляется счет с ценой).
1. при покупке продуктов выставляется дополнительная цена за срочность доставки.
2. При покупке електроники, покупателю предлагается оформить дополнительную гарантию.
3. Телефоны продаются только с контрактом оператора.
4. На отдельные категории товаров иногда дейтствует скидка   */
    public static void main(String[] args) {

        Products p1 = new Products("Vegetables", 5.0, true);
        Products p2 = new Products("Fruits", 6.5, true);
        Products p3 = new Products("Beverages", 2.8, false);

        Dress d1 = new Dress("Costumes", 40.0, true);
        Dress d2 = new Dress("T-shirts", 10.0, false);
        Dress d3 = new Dress("Jackets", 65.0, true);

        Notebooks laptop1 = new Notebooks("Dell", 1100.0, true, false);
        Notebooks laptop2 = new Notebooks("HP", 1200.0, false, true);
        Notebooks laptop3 = new Notebooks("MacBook Pro", 1500.0, true, true);

        Phones phone1 = new Phones("Iphone", 850.0, false, true, true);
        Phones phone2 = new Phones("Samsung", 750.0, true, false, false);
        Phones phone3 = new Phones("Huawei", 650.0, true, false, true);

        List<Shop> catalogue = new ArrayList<>();
        catalogue.add(p1);
        catalogue.add(p2);
        catalogue.add(p3);
        catalogue.add(d1);
        catalogue.add(d2);
        catalogue.add(d3);
        catalogue.add(laptop1);
        catalogue.add(laptop2);
        catalogue.add(laptop3);
        catalogue.add(phone1);
        catalogue.add(phone2);
        catalogue.add(phone3);

        for (Shop shop : catalogue) {
            System.out.println(shop.toString());
        }
    }

}

