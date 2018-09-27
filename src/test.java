
public class test {
    public static void main(String[] args){
        int one,two,three,four;
        String strTwo,strThree;
        int i = (int)(Math.random()*4);
        switch(i){
            case 1:
                do{
                    two = getMiddleNum();
                    strTwo = numAddSimbol(two);
                    three = getMiddleNum();
                    strThree = numAddSimbol(three);
                    four = (int)(Math.random()*20);
                }while((four-three-two)<0||(four-three-two)>=20);
                System.out.println("()"+strTwo+strThree+"="+four);
                break;
            case 2:
                do{
                    one = (int)(Math.random()*20);
                    three = getMiddleNum();
                    strThree = numAddSimbol(three);
                    four = (int)(Math.random()*20);
                }while((four-three-one)<=-20||(four-three-one)>=20);
                if((four-three-one)<0) {
                    System.out.println(one + "-()" + strThree + "=" + four);
                }else{
                    System.out.println(one + "+()" + strThree + "=" + four);
                }
                break;
            case 3:
                do{
                    one = (int)(Math.random()*20);
                    two = getMiddleNum();
                    strTwo = numAddSimbol(two);
                    four = (int)(Math.random()*20);
                }while((four-two-one)<=-20||(four-two-one)>=20);
                if((four-two-one)<0){
                    System.out.println(one+strTwo+"-()="+four);
                }else {
                    System.out.println(one + strTwo + "+()=" + four);
                }
                break;
            default:
                do{
                    one = (int)(Math.random()*20);
                    two = getMiddleNum();
                    strTwo = numAddSimbol(two);
                    three = getMiddleNum();
                    strThree = numAddSimbol(three);
                }while((one+two+three)<0||(one+two+three)>=20);
                System.out.println(one+strTwo+strThree+"=()");
                break;
        }

    }
    public static int getMiddleNum(){
        int m,n;
        m = (int)(Math.random()*20);
        n = (int)(Math.random()*-20);
        return m + n;
    }
    public static String numAddSimbol(int x){
        String a;
        if(x>=0){
            a = "+" + x;
        }else{
            a = "" + x;
        }
        return a;
    }

}
