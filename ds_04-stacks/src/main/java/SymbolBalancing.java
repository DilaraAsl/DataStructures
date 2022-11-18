public class SymbolBalancing {
    public static void main(String[] args) {
        String str="(A+B)- ((C*D)/ {}F*(B/2)])";
        str=str.replaceAll("[^()[||^{}[||^\\[\\]]]]", "");
        System.out.println(str);
    }
}
