public class main_002 { 
    public static void main(String[] args) {
        //練習2－1
        int x = 5;
        int y = 10;
        String ans = "x+yは" + (x + y);
        System.out.println(ans);

        //練習2－2
        //2,5,7

        //練習2－３
        
        System.out.println("ここから練習2-3です。");
        System.out.println("ようこそ占いの館へ");
        System.out.println("あなたの名前を入力してください。＞");
        String name = new java.util.Scanner(System.in).nextLine();
        System.out.println("あなたの年齢を入力してください＞");
        int ageString = new java.util.Scanner(System.in).nextInt();
        int fortune = new java.util.Random().nextInt(4);
        fortune = 1 + fortune;
        System.out.println(ageString + "歳の"+ name + "さん、あなたの運気番号は" + fortune + "です");
        System.out.println("(1:大吉 2:中吉 3:吉 4:凶)" );


    }
}
