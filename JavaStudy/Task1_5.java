public class Task1_5{
    public static void main(String[]args){
        //①「みかん」、「りんご」、「ぶどう」、「メロン」の値を設定した配列fluitsを作成してください。
        int[]flutis={"みかん","りんご","ぶどう","メロン"};
        //② for文を使って①で作成した配列を出力しなさい。
        for(int i=0;i<flutis.length;i++){
            System.out.println("flutis["+i+"]…"+flutis[i]);
        }
        //③以下のwhile文の処理について、何をしているのかコメントを記入してください。
       /*
        *1から100までの数字を出力。
        */
        int i=1;
        while(i<=100){
            System.out.print(i);
            i++;
        }
        System.out.println();
        /*④wikiに掲載されている【多重ループのプログラム例(九九表を表示)】を参考に
        行の最初に「段数」と「||」を追加したものを表示させるプログラムを作成しなさい。
         *     1 || 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |
        *     2 || 2 | 4 | 6 | 8 | 10 | 12 | 14 | 16 | 18 |
        *     3 || 3 | 6 | 9 | 12 | 15 | 18 | 21 | 24 | 27 |
        *     4 || 4 | 8 | 12 | 16 | 20 | 24 | 28 | 32 | 36 |
        *     5 || 5 | 10 | 15 | 20 | 25 | 30 | 35 | 40 | 45 |
        *     6 || 6 | 12 | 18 | 24 | 30 | 36 | 42 | 48 | 54 |
        *     7 || 7 | 14 | 21 | 28 | 35 | 42 | 49 | 56 | 63 |
        *     8 || 8 | 16 | 24 | 32 | 40 | 48 | 56 | 64 | 72 |
        *     9 || 9 | 18 | 27 | 36 | 45 | 54 | 63 | 72 | 81 |
        */
        for(int i=1;i<9;i++){
            for(int j=1;j<=9;j++){
                System.out.print(i+"x"+j+"="+(i*j)+"");
            }
            System.out.println();
        }
    }
}
