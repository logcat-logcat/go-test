package com.example.life;

import android.app.Application;

public class flag extends Application {

    public static int a; //글로벌로 사용할 변수를 선언합니다.
    private static int b;
    private static int c;
    public static int num;
    public static String[] name = new String[100];
    public static int[] k1 = new int[100];
    public static int[] k2 = new int[100];
    public static int[] k3 = new int[100];

    @Override   //오버라이딩 해서 onCreate()를 만들어 줍니다. 여느 클래스와 똑같이요 ㅎㅎ
    public void onCreate() {
        super.onCreate();
        a = 0;
        b=0;
        c=0;
        num=0;

    }
/*
    @Override  //이건 선택사항인데 일단 추가해 줍니다. 데이터 공간 낭비를 방지하기 위해 추가하고 나중에 필요하면 선언하세요.
    public void onTerminate() {
        super.onTerminate();
        instance = null;
    }
*/

    // 초기화 함수입니다. 처음 선언을 해주면 안정적으로 초기화 되서 변수가 안정적입니다.
    public void Init() {
        a = 0;
        b=0;
        c=0;
        num=0;

    }

    //클래스를 선언한 뒤, 다른 액티비티에서 사용될 함수 입니다. 이건 verdiosn이라는 글로벌 변수에 flag값을 넣게다는 뜻입니다.
//다른 액티비티에서 선언 방법은 밑에 써드릴게요
    public void seta(int aa){this.a = aa;}
    public void setb(int bb){this.b = bb;}
    public void setc(int cc){this.c = cc;}

    public void input(int q,String x,int w,int e,int r){
        this.name[q] = x;
        this.k1[q] = w;
        this.k2[q] = e;
        this.k3[q] = r;
    }
    public void plus(){this.num++;}
    //이것은 저장된 값을 불러오는 함수입니다.
    public int geta(){return a;}
    public int getb(){return b;}
    public int getc(){return c;}


}
