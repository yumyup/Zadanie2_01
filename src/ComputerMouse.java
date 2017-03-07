/**
 * Created by Helmut on 2017-03-07.
 */
public class ComputerMouse {
    public static void main(String[] args) {

    Controller mouse1 = new Controller("microsyf", "AKX 10", "bateria", "czarna", "grafika", 150);
    Controller mouse2 = new Controller("Logitech", "SUX 69", "kabel", "biała", "biuro", 15);
        System.out.printf("%s %s %s %s %s %.2f zł. \n",  "Myszka: " + mouse1.manufacturer, mouse1.symbol, mouse1.power, mouse1.colour, mouse1.destiny, mouse1.price, " zł");
        System.out.printf("%s %s %s %s %s %.2f zł. ", "Myszka: " + mouse2.manufacturer, mouse2.symbol, mouse2.power, mouse2.colour, mouse2.destiny, mouse2.price, " zł");

    }
}
