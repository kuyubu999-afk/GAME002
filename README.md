# 太阳系探索 Solar System Explorer

安卓本地太阳系模拟与日月食候选日期查询。

## 功能
- 八大行星轨道动画、播放/暂停、速度调节、日期推进
- 行星资料卡片
- 日食/月食日期候选查询（本地近似算法）
- 手机端 WebView，无需联网运行

## 构建
运行 gradle assembleDebug
APK 输出位置：app/build/outputs/apk/debug/app-debug.apk

## 日月食数据说明
本应用的日月食查询是用于教学演示的近似候选筛选，不提供精确接触时刻、食分或当地可见性，也不能代替 NASA/GSFC 正式星历目录。正式预测需使用高精度太阳/月球星历及地球自转参数。
