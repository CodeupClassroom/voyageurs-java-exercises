package oop;

public class RestaurantTest {

    public static void main(String[] args) {

        // first version
//            RestaurantDish dish = new RestaurantDish();
//            dish.costInCents = 3000;
//            dish.nameOfDish = "Pasta";
//            dish.wouldRecommend = true;
//            dish.eat();

        // second version

            RestaurantDishV2 dish2 = new RestaurantDishV2(3000, "Pasta", true);
            System.out.println(dish2.getNameOfDish());
            dish2.setCostInCents(2000);
            System.out.println(dish2.getCostInCents());
    }
}
