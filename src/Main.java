public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();

        double height = 1.87; //Рост человека
        int weight = 98; //Вес человека

        double index = (int) (service.calculate(height, weight));

        System.out.println("Индекс массы тела = " + Math.round(index));
    }
}
