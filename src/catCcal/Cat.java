package catCcal;

public class Cat {
    static Float getMinKcalsSum(String firstDishKcal, String secondDishKcal, String firstDesert, String secondDesert) {
        float minDishKcal = Float.min(Float.parseFloat(firstDishKcal),Float.parseFloat(secondDishKcal)); // вычислите минимальную калорийность основного блюда
        float minDesertKcal = Float.min(Float.parseFloat(firstDesert), Float.parseFloat(secondDesert)); // вычислите минимальную калорийность десерта
        return minDishKcal + minDesertKcal;
    }

    static void checkKcal(float catKcal) {
        Float calories = catKcal;


        if (calories == null) {
            System.out.println("Что-то пошло не так");
        } else {
            System.out.println("Калорийность рациона Пикселя за день: " + catKcal);
            if (catKcal > 100) {
                System.out.println("Пиксель сегодня не уложился в норму.");
            } else {
                System.out.println("Лимит не превышен!");
            }
        }
    }
}

