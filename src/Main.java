public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 98;
        double height = 1.87;
        double bmi = service.calculate(weight, height);
        String bmiResult = String.format("%.0f", bmi);
        System.out.println("Ваши Вес : " + weight + " кг");
        System.out.println("Ваш Рост : " + height + " м");
        System.out.println("Индекс массы тела " + bmiResult + " кг/см2");

        }
}
