package groupTasks;

public class ExcelSheetColumnNumber {
    public static void main(String[] args) {
        System.out.println(findColumnNo("ZY"));
    }
    public static int findColumnNo(String columnNo){
        if (columnNo.length()==0 || columnNo==null) return 0;
        int  length=columnNo.length();

     int total=0;
      int i=0;

        while(length>0){

            total+=(int)(Math.pow(26,length-1))*(columnNo.charAt(i)-64);
            length--; i++;
        }
   return total;
    }
}
