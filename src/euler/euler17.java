package euler;

/**
 * Created by Bozerg on 2/20/2017.
 */
public class euler17 {
    final static int and="and".length();
    final static int one="one".length();
    final static int two="two".length();
    final static int three="three".length();
    final static int four="four".length();
    final static int five="five".length();
    final static int six="six".length();
    final static int seven="seven".length();
    final static int eight="eight".length();
    final static int nine="nine".length();
    final static int ten="ten".length();
    final static int eleven="eleven".length();
    final static int twelve="twelve".length();
    final static int thirteen="thirteen".length();
    final static int fourteen="fourteen".length();
    final static int fifteen="fifteen".length();
    final static int sixteen="sixteen".length();
    final static int seventeen="seventeen".length();
    final static int eighteen="eighteen".length();
    final static int nineteen="nineteen".length();
    final static int twenty="twenty".length();
    final static int thirty="thirty".length();
    final static int forty="forty".length();
    final static int fifty="fifty".length();
    final static int sixty="sixty".length();
    final static int seventy="seventy".length();
    final static int eighty="eighty".length();
    final static int ninety="ninety".length();
    final static int hundred="hundred".length();
    final static int thousand="thousand".length();

    public static void main(String args[]) {
        int sum = 0;
        int[] num = new int[4];
        for(int i=1;i<=1000;i++){
            int number=i;
            int count=3;
            while(number>0){
                num[count]=number%10;
                count--;
                number=number/10;
            }
            sum = sum + getCharacters(num);
        }
        System.out.println(sum);
    }

    public static int getCharacters(int[] num){
        int sum=0;
        if (num[1] > 0) {
            sum = sum + hundred;
        }
        if(num[0] > 0){
            sum = sum + thousand;
        }
        if(num[0] > 0 || num[1] > 0){
            if(num[2]!=0 || num[3]!=0){
                sum = sum + and;
            }

            if (num[1] == 1) {
                sum = sum + one;
            } else if (num[1] == 2) {
                sum = sum + two;
            } else if (num[1] == 3) {
                sum = sum + three;
            } else if (num[1] == 4) {
                sum = sum + four;
            } else if (num[1] == 5) {
                sum = sum + five;
            } else if (num[1] == 6) {
                sum = sum + six;
            } else if (num[1] == 7) {
                sum = sum + seven;
            } else if (num[1] == 8) {
                sum = sum + eight;
            } else if (num[1] == 9) {
                sum = sum + nine;
            }

            if (num[0] == 1) {
                sum = sum + one;
            } else if (num[0] == 2) {
                sum = sum + two;
            } else if (num[0] == 3) {
                sum = sum + three;
            } else if (num[0] == 4) {
                sum = sum + four;
            } else if (num[0] == 5) {
                sum = sum + five;
            } else if (num[0] == 6) {
                sum = sum + six;
            } else if (num[0] == 7) {
                sum = sum + seven;
            } else if (num[0] == 8) {
                sum = sum + eight;
            } else if (num[0] == 9) {
                sum = sum + nine;
            }
        }
        if (num[2] == 1) {
            if(num[3] == 0){
                sum = sum + ten;
            } else if (num[3] == 1) {
                sum = sum + eleven;
            } else if (num[3] == 2) {
                sum = sum + twelve;
            } else if (num[3] == 3) {
                sum = sum + thirteen;
            } else if (num[3] == 4) {
                sum = sum + fourteen;
            } else if (num[3] == 5) {
                sum = sum + fifteen;
            } else if (num[3] == 6) {
                sum = sum + sixteen;
            } else if (num[3] == 7) {
                sum = sum + seventeen;
            } else if (num[3] == 8) {
                sum = sum + eighteen;
            } else if (num[3] == 9) {
                sum = sum + nineteen;
            }
        }
        else {
            if (num[3] == 1) {
                sum = sum + one;
            } else if (num[3] == 2) {
                sum = sum + two;
            } else if (num[3] == 3) {
                sum = sum + three;
            } else if (num[3] == 4) {
                sum = sum + four;
            } else if (num[3] == 5) {
                sum = sum + five;
            } else if (num[3] == 6) {
                sum = sum + six;
            } else if (num[3] == 7) {
                sum = sum + seven;
            } else if (num[3] == 8) {
                sum = sum + eight;
            } else if (num[3] == 9) {
                sum = sum + nine;
            }

            if (num[2] == 1) {
                sum = sum + ten;
            } else if (num[2] == 2) {
                sum = sum + twenty;
            } else if (num[2] == 3) {
                sum = sum + thirty;
            } else if (num[2] == 4) {
                sum = sum + forty;
            } else if (num[2] == 5) {
                sum = sum + fifty;
            } else if (num[2] == 6) {
                sum = sum + sixty;
            } else if (num[2] == 7) {
                sum = sum + seventy;
            } else if (num[2] == 8) {
                sum = sum + eighty;
            } else if (num[2] == 9) {
                sum = sum + ninety;
            }

        }
        //System.out.println(num[0] + "" + num[1] + "" + num[2] + "" + num[3] + "  :  " + sum);
        return sum;
    }
}
