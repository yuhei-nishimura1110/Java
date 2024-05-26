public class main_004 {
    public static void main(String[] args) {
        //練習１
        int[] points;
        points = new int[4];
        double[] weights;
        weights = new double[5];
        boolean[] answers;
        answers = new boolean[3];
        String[] names;
        names = new String[3];

        //練習２
        int [] moneyList = new int[] {121902 , 8302 , 55100 };
        for(int i = 0; i > 3; i++){
            System.out.println(moneyList[i]);
        };
        for (int value : moneyList){
            System.out.println(value);
        };

        //練習４
        int[] numbers = new int[] {3,4,9};
        System.out.println("数字を入力してください");
        int input = new java.util.Scanner(System.in).nextInt();
        if(input == numbers[0] || input == numbers[1] || input == numbers[2]){
            System.out.println("アタリ");
        }else{
            System.out.println("違います");
        };
    }
}
