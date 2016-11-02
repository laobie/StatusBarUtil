# StatusBarUtil
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-StatusBarUtil-green.svg?style=true)](https://android-arsenal.com/details/1/3341)

[![Download](https://api.bintray.com/packages/laobie/maven/statusbarutil/images/download.svg) ](https://bintray.com/laobie/maven/statusbarutil/_latestVersion)


A util for setting status bar style on Android App. It can work above API 19(KitKat 4.4).

[中文版点我](http://laobie.github.io/android/2016/03/27/statusbar-util.html)

![](img/status_bar_util.png)

### Sample
[Download StatusBarUtil-Demo](http://fir.im/5mnp)

### Change Log

+ 1.3.0

    - Fix multi-fragment problem && rootView may not ViewGroup bug

+ 1.2.8

    - fix method `setColorDiff` bug

+ 1.2.7

    - add `setColorForSwipeBack` method, now support

        - [r0adkll/Slidr: Easily add slide to dismiss functionality to an Activity](https://github.com/r0adkll/Slidr)

+ 1.2.6

    - update support version to 24.2.1

+ 1.2.5

    - add `@ColorInt`, if you pass a color res, now you will get a error

    - fix bug: ContentView in DrawerLayout padding not work

+ 1.2.4

    fix bug in method `setTransparentForImageViewInFragment`

+ 1.2.3

    fix method `setTranslucentForImageView` support pass null as needOffsetView

    add method for fragment witch using ImageView as head view

    ~~~ java
    setTranslucentForImageViewInFragment(Activity activity, View needOffsetView)
    setTransparentForImageViewInFragment(Activity activity, View needOffsetView)
    ~~~

    fix setTranslucent bug when root layout is CoordinatorLayout

    ~~~ java
    setTranslucentForCoordinatorLayout(Activity activity, int statusBarAlpha)
    ~~~

+ 1.2.0
	
	add method for page witch using ImageView as head view

	~~~ java
	setTranslucentForImageView(Activity activity, int statusBarAlpha, View needOffsetView)
	~~~ 
	
	and
	
	~~~ java 
	setTranslucentForImageView(Activity activity, View needOffsetView)
	~~~

+ 1.1.1

    fix set color bug on 4.4 devices

+ 1.1.0

    fix some bugs

+ 1.0.0

	first publish

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

- Set translucent status bar for using ImageView as head view page

    ```java
    StatusBarUtil.setTranslucentForImageView(Activity activity, int statusBarAlpha, View needOffsetView)
    ```
   ![](img/set_for_image_view_page.png)

- Use in fragment

   ![](img/use_in_fragment.gif)

- Set color for swipe back page

    ```java
    StatusBarUtil.setColorForSwipeBack(Activity activity, @ColorInt int color, int statusBarAlpha)
    ```

    ![](img/set_color_for_swipe_back_page.png)

- Pass statusBarAlpha param when necessary to change your status bar alpha, which is 112 by default.
  

### Usage

##### 1. Add the dependencies to your build.gradle file, StatusBarUtil is avaiable in JCenter:

```groovy
compile 'com.jaeger.statusbaruitl:library:1.3.0'
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

####  5. How to use in Fragment, please read [UseInFragmentActivity.java](https://github.com/laobie/StatusBarUtil/blob/master/sample/src/main/java/com/jaeger/statusbarutil/UseInFragmentActivity.java)

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
