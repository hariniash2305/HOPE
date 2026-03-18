class primitive{
    public static void main(String[] args) {
        byte a = 127;
        byte b = -128;
        System.out.println("Byte supports from "+b+ " to "+a);
        short sh1 = -32768;
        short sh2 = 32767;
        System.out.println("The range for short is " +sh1+ " to "+sh2); 
        int num1 = -2147483648;
        int num2 = 2147483647;
        System.out.println("The range for int is "+num1+" to "+num2);
        long l = 10000L;
        System.out.println(l);
        double d = 2000000.2599;
        System.out.println(d);
        char ch ='h';
        System.out.println(ch);
    }
}
