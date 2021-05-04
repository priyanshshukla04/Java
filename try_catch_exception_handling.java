public class try_catch_exception_handling {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
//        try {
//            System.out.println("inside try block...");
//            int sol = arr[3]/arr[1];
//            System.out.println(sol);
//        }
//        try {
//            int sol = arr[3]/0;
//            System.out.println("inside try block...");
//            System.out.println(sol);
//        }
//        try {
//            int sol = arr[3]/arr[7];
//            System.out.println("inside try block...");
//            System.out.println(sol);
//        }
        try {
            System.out.println("Inside nested try...");
            try {
                String str1 = "hhb";
                int sol = Integer.parseInt(str1);
                System.out.println("inside try block...");
                System.out.println(sol);
            }catch (Exception e){
                System.out.println(e);
            }
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Exception caught...");
            System.out.println(e);
        }
    }
}
