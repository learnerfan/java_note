
class TestOne{
    public static void main(String[] args){
        System.out.println("hello");
        FreshJuice freshJuice = new FreshJuice();
        freshJuice.test();
        int num = 50;
        num = num ++ * 2;
        System.out.println(num);

        int num2 = 2147483647;
        long temp = num2 + 2L;
        System.out.println(temp);
        char c = 'A';
        int num3 = 10;
        switch(c){
            case 'B':
            num3 ++;
            case 'A':
            num3 ++;
            case 'Y':
            num3 ++;
                break;
            default:
            num3 --;                
        }
        System.out.println(num3);

        int num4 = 0;
        for(int x = 0 ; x < 10 ; x++){
            num4 += x;
            if(x % 3 == 0){
                break;
            }
        }
        System.out.println(num4);
    }
}
