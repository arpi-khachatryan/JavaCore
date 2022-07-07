package chapters.chapter12.enumPractice;

public enum Apple {
    JONATHAN(250),
    GOLDEN_DEL(150),
    RED_DEL(300),
    WINESAP(400),
    CORTLAND();

    private int price;

    Apple(int price) {
        this.price = price;
    }

    Apple() {
        price = -1;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
