package com.example.ibesteeth.gjj_td;

import android.app.Application;

import com.tendcloud.tenddata.TCAgent;

/**
 * 作者：iBesteeth on 2016/10/24 11:43
 * 邮箱：gujj512@163.com
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        TCAgent.LOG_ON=true;
        // App ID: 在TalkingData创建应用后，进入数据报表页中，在“系统设置”-“编辑应用”页面里查看App ID。
        // 渠道 ID: 是渠道标识符，可通过不同渠道单独追踪数据。
//        TCAgent.init(this, "18BAC46255E964E541F6B781D7D5AB80", "渠道 ID");
        TCAgent.init(this);
        TCAgent.setReportUncaughtExceptions(true);
    }
}
