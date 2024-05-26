public class main_005 {
    public static void main(String[] args) {
        introduceOneself();
        email("メールの宛先アドレス","メールのタイトル","メールの本文");
        email("メールの宛先アドレス","メールの本文");
        double traiang = calcTriangArea(1,100);
        double circle = calcCircleArea(5.0);
        System.out.println("三角形の面積は" + traiang + "㎝です");
        System.out.println("円の面積は" + circle + "平方㎝です");



        
    }
    public static void introduceOneself(){
        String name = "湊雄輔";
        int age = 22;
        double height = 169.9;
        char zodiac = '辰';
        System.out.println(
            "私の名前は" + name + "です。歳は" + age + "歳です。身長は" + height + "㎝です。十二支は" + zodiac + "です。"
        );

    };
    
    public static void email(String address, String title, String text){
        System.out.println(address + "に、以下のメールを送信しました");
        System.out.println("件名:" +title);
        System.out.println("本文:" +text);

    };
    public static void email(String address, String text){
        System.out.println(address + "に、以下のメールを送信しました");
        System.out.println("件名:　無題");
        System.out.println("本文:" +text);
    };
    public static double calcTriangArea(double bottom, double height){
        double anser = (bottom * height) / 2;
        return anser;
    };
    public static double calcCircleArea(double radius){
        double anser = radius * radius * 3.14;
        return anser;
    };
}