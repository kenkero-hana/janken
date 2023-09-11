/*1 相手はランダムで出す
  ２ 自分はぐー、ちょき、パー
  ３　相手と比較して勝敗を決める
  ４　あいこならやり直す
  
  クラス
    ・メインクラス
    ・じゃんけんの手
    ・勝ち負け*/

import janken.window.MainWindow;

public class janken{
    public static void main(String args){
        //ゲームWindowの生成と表示
        MainWindow window = new MainWindow();
        window.show();
    }
}