package com.example.zyh.mathtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    public  static   String Tag="MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int x=3;
        int y=4;
        double z=-3.2;
        double abs=Math.abs(z);//输出为3.2
        double asin=Math.asin(0.5);//返回0.5求出的角对应的弧度,除以π乘180得30度
        double sin=Math.sin(30*Math.PI/180);//返回1/2,注意这种写法,且sin()的方法参数应为目标角度对应的弧度
        double pow=Math.pow(2,3);// 返回8,第一个参数为底 求幂函数,2的3次方,
        double  sqrt=Math.sqrt(4);//开平方,返回2
        double   radians=Math.toRadians(180);//返回角度对应的弧度,本次返回180度对应的π,
        // ps:Math提供的方法中方法参数类型大多是double,
        double  Degrees=Math.toDegrees(Math.PI);//返回180度对应的弧,我们可以用这两个方法快速转换角度弧度
        int round  = (int) Math.round(2.7);//  此处需要强制转换,这是四舍五入, 返回3
        double hybot=Math.hypot(3,4);  //返回5,返回是一个double,这是求两个数的平方和在开放,直角三角形斜边就是这样的
          double  random=Math.random();//给出一个随机数0到1之间

    }
}
