# acitivitylifecycle
把玩activity生命周期
#项目结构：
三个activity，main, 透明，和第二
从main有两个button跳转到透明和第二。
main中有一个edit 来让用户输入内容，观察saveInstance相关的现象。

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

=============================================================

1. 正常可见，可交互状态，点击菜单键（可以看到结果同home键）

2019-11-07 18:19:32.019 5574-5574/com.play.activitylife E/MainActivity: onPause  
2019-11-07 18:19:32.049 5574-5574/com.play.activitylife E/MainActivity: onSaveInstanceState  
2019-11-07 18:19:32.054 5574-5574/com.play.activitylife E/MainActivity: onStop  

==============================================================

1. 正常可见状态下，翻转屏幕

2019-11-07 18:21:43.818 5863-5863/com.play.activitylife E/MainActivity: onPause  
2019-11-07 18:21:43.820 5863-5863/com.play.activitylife E/MainActivity: onSaveInstanceState  
2019-11-07 18:21:43.847 5863-5863/com.play.activitylife E/MainActivity: onStop  
2019-11-07 18:21:43.848 5863-5863/com.play.activitylife E/MainActivity: onDestroy  
2019-11-07 18:21:43.891 5863-5863/com.play.activitylife E/MainActivity: onCreate savedInstanceStateC.L.Wang
2019-11-07 18:21:43.891 5863-5863/com.play.activitylife E/MainActivity: onCreate  
2019-11-07 18:21:43.891 5863-5863/com.play.activitylife E/MainActivity: onStart  
2019-11-07 18:21:43.892 5863-5863/com.play.activitylife E/MainActivity: onRestoreInstanceState  savedInstanceStateC.L.Wang
2019-11-07 18:21:43.892 5863-5863/com.play.activitylife E/MainActivity: onRestoreInstanceState  
2019-11-07 18:21:43.893 5863-5863/com.play.activitylife E/MainActivity: onResume  

2. 再次切回正常竖屏（可以看到和1完全一样）

2019-11-07 18:23:08.614 5863-5863/com.play.activitylife E/MainActivity: onPause  
2019-11-07 18:23:08.616 5863-5863/com.play.activitylife E/MainActivity: onSaveInstanceState  
2019-11-07 18:23:08.622 5863-5863/com.play.activitylife E/MainActivity: onStop  
2019-11-07 18:23:08.622 5863-5863/com.play.activitylife E/MainActivity: onDestroy  
2019-11-07 18:23:08.651 5863-5863/com.play.activitylife E/MainActivity: onCreate savedInstanceStateC.L.Wang
2019-11-07 18:23:08.651 5863-5863/com.play.activitylife E/MainActivity: onCreate  
2019-11-07 18:23:08.652 5863-5863/com.play.activitylife E/MainActivity: onStart  
2019-11-07 18:23:08.652 5863-5863/com.play.activitylife E/MainActivity: onRestoreInstanceState  savedInstanceStateC.L.Wang
2019-11-07 18:23:08.652 5863-5863/com.play.activitylife E/MainActivity: onRestoreInstanceState  
2019-11-07 18:23:08.654 5863-5863/com.play.activitylife E/MainActivity: onResume  




