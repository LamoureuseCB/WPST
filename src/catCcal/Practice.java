package catCcal;

public class Practice {
    public static void main(String[] args) {
        String pixelKcalDay = "43"; // столько калорий съел Пиксель до похода к бабушке
        String beefKcal = "30.2"; // калорийность говядины
        String chickenKcal = "23.8"; // калорийность курицы
        String creamKcal = "32.1"; // калорийность сливок
        String milkKcal = "13.5"; // калорийность молока
        Cat catPixel = new Cat();

        float pixelChoice = catPixel.getMinKcalsSum(beefKcal, chickenKcal, creamKcal, milkKcal);
        float totalKcal = Float.parseFloat(pixelKcalDay) + pixelChoice;
        catPixel.checkKcal(totalKcal);
    }
}

