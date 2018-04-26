## Change Log

### 1.5.1

fix set light/dark mode bug

### 1.5.0

add set light/dark mode method

### 1.4.0

fix typo

### 1.3.6

- bug fix and remove StatusBarView

### 1.3.5

- add method `hideFakeStatusBarView` to hide fake StatusBarView

### 1.3.4
### 1.3.3

- fix `setColorForSwipeBack` method with `CoordinatorLayout` bug

### 1.3.2

- Bug fix

### 1.3.1

- Bug fix

### 1.3.0

- Fix multi-fragment problem && rootView may not ViewGroup bug

#### 1.2.8
####
- fix method `setColorDiff` bug

### 1.2.7

- add `setColorForSwipeBack` method, now support
	
	- [r0adkll/Slidr: Easily add slide to dismiss functionality to an Activity](https://github.com/r0adkll/Slidr)

### 1.2.6

- update support version to 24.2.1

### 1.2.5

- add `@ColorInt`, if you pass a color res, now you will get a error

- fix bug: ContentView in DrawerLayout padding not work

### 1.2.4

- fix bug in method `setTransparentForImageViewInFragment`

### 1.2.3

- fix method `setTranslucentForImageView` support pass null as needOffsetView

- add method for fragment witch using ImageView as head view

    ~~~ java
    setTranslucentForImageViewInFragment(Activity activity, View needOffsetView)
    setTransparentForImageViewInFragment(Activity activity, View needOffsetView)
    ~~~

- fix setTranslucent bug when root layout is CoordinatorLayout

    ~~~ java
    setTranslucentForCoordinatorLayout(Activity activity, int statusBarAlpha)
    ~~~

### 1.2.0
	
- add method for page witch using ImageView as head view

	~~~ java
	setTranslucentForImageView(Activity activity, int statusBarAlpha, View needOffsetView)
	~~~ 
	
	and
	
	~~~ java 
	setTranslucentForImageView(Activity activity, View needOffsetView)
	~~~

### 1.1.1

- fix set color bug on 4.4 devices

### 1.1.0

- fix some bugs

### 1.0.0

- first publish
