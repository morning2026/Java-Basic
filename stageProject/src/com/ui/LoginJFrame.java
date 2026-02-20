package com.ui;

import javax.swing.*;

public class LoginJFrame extends JFrame {//登录界面
    public LoginJFrame(){
        this.setSize(488,430);
        this.setTitle("拼图登录");//标题
        this.setAlwaysOnTop(true);//位于最上
        this.setLocationRelativeTo(null);//居中
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//关闭模式，关闭即结束虚拟机
        this.setVisible(true);
    }
}
