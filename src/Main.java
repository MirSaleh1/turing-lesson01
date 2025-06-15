//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main(String[] args) {
    int a=3;

        System.out.println(a==1?"Yanvar":a==2?"Fevral":a==3?"MArt":a==4?"Aprel":a==5?"may":a==6?"iyun":a==7?"iyul":a==8?"avqust":a==9?"sentyabr":a==10?"oktyabr":a==11?"Noyabr":a==12?"dekabr":"1-12 araliqinda reqem secin");
    int b=a;
        System.out.println(b==1||b==2||b==12?"Qis":b > 2 && b < 6?"Yaz":b>5 && b<10?"Yay":b>9 && b<12?"payiz":"Duz gun reqem qeyd edin");

        }
    }
