# acitivitylifecycle
把玩activity生命周期
#注意：
项目下载后，可以通过过滤MainActivity标签。在logcat中查看生命周期的过程。
#可玩操作：
启动应用到可见：

2019-11-07 18:15:15.993 5574-5574/? E/MainActivity: onCreate  
2019-11-07 18:15:15.994 5574-5574/? E/MainActivity: onStart  
2019-11-07 18:15:15.996 5574-5574/? E/MainActivity: onResume  
1. 点击跳转透明

2019-11-07 18:15:48.677 5574-5574/com.play.activitylife E/MainActivity: onPause  
2019-11-07 18:15:49.222 5574-5574/com.play.activitylife E/MainActivity: onSaveInstanceState  
2019-11-07 18:15:49.222 5574-5574/com.play.activitylife E/MainActivity: onStop  

2. 点返回键

2019-11-07 18:16:08.148 5574-5574/com.play.activitylife E/MainActivity: onRestart  
2019-11-07 18:16:08.149 5574-5574/com.play.activitylife E/MainActivity: onStart  
2019-11-07 18:16:08.150 5574-5574/com.play.activitylife E/MainActivity: onResume  
3. 点home键

2019-11-07 18:16:25.017 5574-5574/com.play.activitylife E/MainActivity: onPause  
2019-11-07 18:16:25.524 5574-5574/com.play.activitylife E/MainActivity: onSaveInstanceState  
2019-11-07 18:16:25.525 5574-5574/com.play.activitylife E/MainActivity: onStop  
4. 点菜单键（无生命周期），并选择我们的应用

2019-11-07 18:16:54.223 5574-5574/com.play.activitylife E/MainActivity: onRestart  
2019-11-07 18:16:54.224 5574-5574/com.play.activitylife E/MainActivity: onStart  
2019-11-07 18:16:54.224 5574-5574/com.play.activitylife E/MainActivity: onResume  

