import javax.swing.*;

public class Swing2 {
    public static void main(String[] argss){
        String num = JOptionPane.showInputDialog("Digite um numero:");
        Byte num1 = Byte.parseByte(num);
        Short num2 = Short.parseShort(num);
        Integer num3 = Integer.parseInt(num);
        Long num4 = Long.parseLong(num);
        Float num5 = Float.parseFloat(num);
        Double num6 = Double.parseDouble(num);


        JOptionPane.showMessageDialog(null, "Os numeros convertidos sao?\n" + num1 + "\n" + num2 +
                "\n" + num3 + "\n" + + num4 + "\n" + num5 + "\n" + num6);

    }
}
