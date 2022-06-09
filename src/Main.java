public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double massIndex = service.calculate(75.3, 1.86);
        System.out.printf("%.2f", massIndex);
    }
}
