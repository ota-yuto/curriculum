public class Task1_2{
    public static void main(string[]args){
        //「①JAPAN」、「AMERICA」、「KOREA」を要素の値（初期値）とする配列countryを作成しなさい。
int[]country={"JAPAN","AMERICA","KOREA"};

//②①で作成した配列の要素数を出力してください。
System.out.println("配列countryの要素数"+country.length);

/*③下記の値を保持した、要素数3のstringクラスの配列strArrayを作成しなさい。
 *  1番目(先頭)の要素に「りんご」を代入
 *  2番目の要素に「もも」を代入
 *  3番目の要素に「ぶどう」を代入
 */String[]strArray=newstring[3];
 strArray[1]="りんご";
 strArray[2]="もも";
 strArray[3]="ぶどう";

 //④③で作成した配列の2番目の要素を出力しなさい
System.out.println("strArray[1]…"+strArray[1]);
 /*⑤下記の処理について、何をしているのかコメントを記入してください。
  *
  */
  //10,20,30,40,50を要素の値（初期値）とする配列intArrayを作成しなさい。
  int[]intArray={10,20,30,40,50};
  //⑥下記の処理について、何をしているのかコメントを記入してください。
  //添え字が1と4の要素の値を表示
  System.out.println(intArray[1]+intArray[4]);

    }
}