package janken.window.enums;

import java.util.*;

public enum Hands{
    //グー
    Rock("グー", 0),
    //チョキ
    Scissors("チョキ", 1),
    //パー
    Paper("パー", 2);

    //表示文字
    private final String display;
    //内部番号
    private final int number;

    //コンストラクタ
    // display 表示
    // number 番号
    Hands(String display, int number){
        this.display = display;
        this.number  = number;
    }
    
    //相手のランダムなて
    public static Hands getRandomHands(){
        Random rand = new Random();
        return Hands.values()[rand.nextInt(3)];
    }

    //表示を取得
    public String getDisplay(){
        return this.display;
    }

    //番号を取得
    public int getNumber(){
        return this.number;
    }
}