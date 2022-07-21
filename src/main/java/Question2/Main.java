package Question2;

public class Main {

    public static void main(String[] args) {
	// write your code here

        LinkedList linkedList = new LinkedList();

        Meal meal = new Meal("rice", 0.00,7.90,9.08);
        Meal meal1 = new Meal("Beans", 0.00,7.90,9.08);
        Meal meal2 = new Meal("Indomie", 0.00,7.90,9.08);
//        linkedList.add(meal);
        linkedList.add(meal1);
        linkedList.add(meal2);

        System.out.println(linkedList);
        System.out.println(linkedList.size());
        System.out.println(linkedList.find(linkedList.head, meal));

//        Meal z = meals.remove(2);
//
//        System.out.println(z);
//
//        System.out.println(meals);
//        System.out.println(meals.size);


    }
}
