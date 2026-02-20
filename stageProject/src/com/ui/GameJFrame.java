package com.ui;

import javax.swing.*;

public class GameJFrame extends JFrame {//JFrame 界面 窗体，本类表示游戏主界面
    public GameJFrame(){
        initJFrame();//初始化界面

        //初始化菜单
        initMenu();
        this.setVisible(true);//界面可视

    }

    private void initMenu() {
        JMenuBar jMenuBar = new JMenuBar();

        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");

        JMenuItem replayItem = new JMenuItem("重新游戏");
        JMenuItem reLoginItem = new JMenuItem("重新登录");
        JMenuItem closeItem = new JMenuItem("关闭游戏");

        JMenuItem accountItem = new JMenuItem("公众号");

        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);

        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        this.setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
        this.setSize(603,680);//界面宽高
        this.setTitle("拼图 V1.0");//标题
        this.setAlwaysOnTop(true);//位于最上
        this.setLocationRelativeTo(null);//居中
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//关闭模式，关闭即结束虚拟机
    }

}
