package task01;

public class Translate {
    private String number;
    private int romanNumber;
    public Translate(String number) {
        this.number = number;
    }
    public int getNumber() {
        int romanNumber2=0;
        for (int i=0; i<number.length(); i++) {
            char ch = number.charAt(i);
            int romanNumber1= 0;


            switch (ch) {
                case 'I':romanNumber1=1;break;
                case 'V':romanNumber1=5;break;
                case 'X':romanNumber1=10;break;
                case 'L':romanNumber1=50;break;
                case 'C':romanNumber1=100;break;
                case 'D':romanNumber1=500;break;
                case 'M':romanNumber1=1000;break;
            }
            if(romanNumber1<romanNumber2) {
                romanNumber-=romanNumber1;
            }
            else{
                romanNumber+=romanNumber1;
            }
            romanNumber2=romanNumber1;

        }

        return romanNumber;

    }
}
