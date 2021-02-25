public class VarArgs_Java {
    static int sum(int ...arr){
        int result = 0;
        for (int a:arr){
            result += a;
        }
        return result;
    }
    
    static int sum1(int x,String ...arr1){
        for(String a:arr1){
            System.out.println(x+" \" "+a);
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println("The sum of 0 is : "+sum());
        System.out.println("The sum of 1 and 2 is: "+sum(1,2));
        System.out.println("The sum of 1 and 2 and 3 is: "+sum(1,2,3));
        System.out.println(sum1(1,"Priyansh"));
        System.out.println(sum1(1,"Priyansh","Shukla"));
    }
}
