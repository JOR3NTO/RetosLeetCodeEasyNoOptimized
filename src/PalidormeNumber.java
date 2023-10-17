public class PalidormeNumber {

    public static void main(String[] args) {
        int numero = 121;
        String num1 = Integer.toString(numero);
        String num2 = "";

        for (int i = num1.length()-1; i > 0; i--) {
            num2 += num1.charAt(i);
        }

        if(num1.equals(num2)){
            System.out.println("Palindromo" + num1 + num2);
        }else{
            System.out.println("No es palindromo");
        }
    }
    
}
