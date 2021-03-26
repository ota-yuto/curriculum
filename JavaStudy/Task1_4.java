public class Task1_4{
    //定数(アカウント情報)
    //①登録されている名前(USER_RNAME)とパスワード(USER_PASSWORD)を定数で定義してください。
    private static final string USER_RNAME="alice";
    private static final string USER_PASSWORD="pass";

    //定数(メッセージ)
    private static final string CONST_MSG_SUCCESS="ログイン成功です。";
    private static final string CONST_MSG_ERROR_NAME="名前に誤りがあります。";
    private static final string CONST_MSG_ERROR_PASS="パスワードに誤りがあります。";
    private static final string CONST_MSG_ERROR_INPUT="入力情報に誤りがあります。";

    public static void main(string[]args){
        //以下の変数「name」「pass」を使用して、②～⑤の条件を満たす処理を記述してください。
        //nameとpassはログイン画面からの入力値だと想定してみましょう。

        string name="alice";
        string pass="pass";

        //②「name」の値が「USER_RNAME」と等しく、「pass」の値が「USER_PASSWORD」と等しい場合。
        //定数を使用して「ログイン成功です」と出力してください。
        if(name.equals(USER_RNAME)&&pass.equals(USER_PASSWORD)){
            system.out.println(CONST_MSG_SUCCESS);
            system.out.prinntln(USER_RNAME);
        }

        //③「USER_RNAME」の値のみ等しい場合。
        //定数を使用して「パスワードに誤りがあります。」と出力してください。
        else(name.equals(USER_RNAME)){
            system.out.prinntln(CONST_MSG_ERROR_PASS);
        }

        
        //④「USER_PASSWORD」の値のみ等しい場合。
        //定数を使用して「入力情報に誤りがあります。」と出力してください。
       else(pass.equals(USER_PASSWORD)){
           system.out.prinntln(CONST_MSG_ERROR_INPUT);
       }

        //⑤「USER_RNAME」も「USER_PASSWORD」の値も間違っていた場合。
        //定数を使用して「入力情報に誤りがあります。」と出力してください。
        else if(name.equals(USER_RNAME))&&pass.equals(USER_PASSWORD){
            system.out.prinntln(CONST_MSG_ERROR_INPUT);
        }
        
    }
}