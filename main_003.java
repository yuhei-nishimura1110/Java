public class main_003 {
    public static void main(String[] args){
        //練習3-1
        /*
        wight = 60
        (age1 + age2) * 2 > 60
        (age % 2) != 1
        eqaal(name)
        */ 

        //練習3-2
        //A,C,D,E

        //練習3-3
        int isHungry = new java.util.Random().nextInt(3);
        String food = "からあげ";
        System.out.println("こんにちは");
        if (isHungry == 0) {
            System.out.println("お腹いっぱいです");
        } else{
            System.out.println("はらぺこです");
            System.out.println(food + "いただきます");
        };
        System.out.println("ごちそうさまでした");


        //練習3-4
        //{}をつける
        
        //練習3-5
        System.out.println("[メニュー]1 : 検索 2 : 登録 3 : 削除 4 : 変更＞");
        int selected = new java.util.Scanner(System.in).nextInt();
        switch (selected) {
            case 1:
                System.out.println("検索します");
            break;
            case 2:
                System.out.println("登録します");
            break;
            case 3:
                System.out.println("削除します");
            break;
            case 4:
                System.out.println("変更します");
            break;
            default:
                System.out.println("");
            break;

        }

        //練習3-6
        System.out.println("数あてゲーム");
        int ans = new java.util.Random().nextInt(9);
        for(int i = 0; i < 5; i++){
            System.out.println("0~9の数字を入力してください");
            int num = new java.util.Scanner(System.in).nextInt();
            if(num == ans){
                System.out.println("アタリ！");
                break;
            }else{
                System.out.println("違います");
            }
        }
        System.out.println("ゲームを終了します");
    }
}
