public class tabuada2 {
    public static void main(String[] args){

        String tabua = "";

        for (int i = 1; i <= 10; i++){
            for (int z = 1; z <= 5; z++){
                tabua += (z + " x " + i + " = " + z*i + "   \t");
            }
            tabua += "\n";
        }

        System.out.print(tabua);
    }
}
