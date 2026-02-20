package com.ui;

import javax.swing.*;

public class RegisterJFrame extends JFrame {//注册界面
    public RegisterJFrame(){
        this.setSize(488,500);
        this.setTitle("拼图注册");//标题
        this.setAlwaysOnTop(true);//位于最上
        this.setLocationRelativeTo(null);//居中
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//关闭模式，关闭即结束虚拟机
        this.setVisible(true);
    }
}
