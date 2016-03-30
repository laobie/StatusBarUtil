# StatusBarUtil
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-StatusBarUtil-green.svg?style=true)](https://android-arsenal.com/details/1/3341)


A util for setting status bar style on Android App. It can work above API 19(KitKat 4.4).

[中文版点我](http://laobie.github.io/android/2016/03/27/statusbar-util.html)

### Sample
[Download StatusBarUtil-Demo](http://fir.im/5mnp)

### Features

- Set status bar color
	
	```java
	StatusBarUtil.setColor(Activity activity, int color)
	```

  ![](img/set_color.png)

- Set status bar translucent

	```java
	StatusBarUtil.setTranslucent(Activity activity, int statusBarAlpha)
	```
	
	![](img/set_translucnet.png)
	
- Set status bar transparent

	```java
	StatusBarUtil.setTransparent(Activity activity)
	```
	
	![](img/set_transparent.png)
  
- Set status bar color for `DrawerLayout`

	```java
	StatusBarUtil.setColorForDrawerLayout(Activity activity, DrawerLayout drawerLayout, int color)
	```
	
  ![](img/set_color_for_drawer_layout.png)
  
- Pass statusBarAlpha param when necessary to change your status bar alpha, which is 112 by default.
  

### Usage

##### 1. Add the dependencies to your build.gradle file, StatusBarUtil is avaiable in JCenter:

```groovy
compile 'com.jaeger.statusbaruitl:library:1.0.0'
```


##### 2. Call method you need after `setContentView()`,  such as :


```java
setContentView(R.layout.main_activity);
...
StatusBarUtil.setColor(MainActivity.this, mColor);
```

##### 3. If you use this util in a page which containing a `DrawerLayout`, you need add `android:fitsSystemWindows="true"` for `DrawerLayout` in your layout XML:

```xml
<android.support.v4.widget.DrawerLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:id="@+id/drawer_layout"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:fitsSystemWindows="true">

    ...

</android.support.v4.widget.DrawerLayout>
```

##### 4. All `statusBarAlpha` value you set should between 0 ~ 255

### License

	Copyright 2016 Jaeger Chen
	
	Licensed under the Apache License, Version 2.0 (the "License");	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

		http://www.apache.org/licenses/LICENSE-2.0
	
	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.