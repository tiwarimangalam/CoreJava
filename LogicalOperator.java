public class LogicalOperator {
    public static void main(String[] args) {
        int a=5;
        int b=4;
        int res=a&b;
        System.out.println("And operator: "+res);
        res=a|b;
        System.out.println("Or operator: "+res);
        res=a^b;
        System.out.println("Xor operator: "+res);
       // boolean b=a&&b;
        if(a==5 && b==4)
        {
            System.out.println("Both are same");
        }
        else
        {
            System.out.println("Different");
        }
    }
}
