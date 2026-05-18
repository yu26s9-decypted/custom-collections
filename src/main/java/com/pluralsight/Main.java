import com.pluralsight.collection.FixedList;

public static void main(String[] args) {
    FixedList<Integer> num = new FixedList<>(4);
    num.add(12);
    System.out.println(num.getItems());
    num.add(14);
    num.add(15);
    num.add(33);

    System.out.println(num.getItems());
    num.add(45);
    System.out.println(num.getItems());
    try {
        num.add(55);
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }


}
