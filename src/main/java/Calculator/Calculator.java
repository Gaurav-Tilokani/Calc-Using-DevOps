package Calculator;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Calculator {

    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public Calculator() {
    }

    public static void main(String[] args) {
//         System.out.println("hii");
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double result = calculator.naturalLog(a);
        System.out.println(result);
    }

    public Double naturalLog(Double a) {
        double result = Math.log(a);
        logger.info("[RESULT - NATURAL LOG] - " + result);
        return result;
    }
}
