# Android Helper
Android Helper is a library for new Android developers. This library can made your work with android easily! Only add it to your dependencies and enjoy it!

# How to use
## Add dependency
Add the following code to build.gradle of project module:
```groovy
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```
And add the following code to build.gradle of app module:
```groovy
dependencies {
    implementation 'com.github.AlirezaIvaz:AndroidHelper:1.0'
}
```
## Methods usage

### Debug Logger
This method can make logs in LogCat when you debug your app for find problems of that.

For using it, you should define two variable: **Tag** and **Message**.

```java
Logger(tag, msg);
```

### Network status checker
This method, check user is online or offline. This method is very good for online applications.

If user is online, the method return **true** or not, return **false**.
```java
if(isOnline) {
    // do anything when user is online
} else {
    // do other when user is offline
}
```

### Package installation checker
This method, check an application is installed on user device or not.

If package that entered by you, installed on user device, method returns **true** or not, returns **false**.

For using this method, you should be define two variable: Application **context** and Application **package name** that you want.

```java
if(isPackageInstalled(context, packageName)) {
    // do anythin when the specefic app is installed on user device
} else {
    // do anythin when the specefic app isn't installed on user device
}
```

### Toast
Create three type toast easily!

In short and long length toast, you should two variable: Application **Context** and **Message**.
#### Toast with short length
```java
ShortToast(context, message);
```

### Toast with long length
```java
LongToast(context, message)
```

### Toast with custom font
This method can create a short toast with a custom font!
In this method, you should only define an extra variable for **typeface**.
First define your typeface in onCrate method, then select it on this method.

```java
Typeface typeface;
typeface = Typeface.createFromAsset(getAssets(), "fonts/myFont.ttf");
CustomToast(context, message, typeface);
```

### AlertDialog
This tool can make AlertDialog very easy. This tool have two template: **Simple** and **AppCompat**.

You should define three variable: Your application **context**, **Title** and **message** of *AlertDialog*.
#### Simple AlertDialog
```java
Dialog(context, title, message);
```
#### AppCompat AlertDialog
```java
CompatDialog(context, title, message);
```

### TextViewPlus
With this xml tag, you didn't need to define typeface hardly on Java code and repeat find and define; Only use this tag and add an extra attribute and enter font path!
For migrate from TextView to TextViewPlus, you need only rename tag and add tvFont attribute!

*Notice: Typeface font should be in assets folder.*

#### Simple TextView
```xml
    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginLeft="12dp"
        android:layout_marginTop="15dp"
        android:layout_marginRight="12dp"
        android:layout_marginBottom="2dp"
        android:gravity="right"
        android:text="@string/app_name"/>
```

#### TextViewPlus
```xml
    <ir.android.helper.tvplus
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginLeft="12dp"
        android:layout_marginTop="15dp"
        android:layout_marginRight="12dp"
        android:layout_marginBottom="2dp"
        android:gravity="right"
        android:text="@string/app_name"
        app:tvFont="fonts/myFont.ttf"/>
```

# Developer
**Programmed by**: Alireza Ivaz

**WebSite**: [https://alirezaivaz.ir](https://alirezaivaz.ir)

**E-Mail**: [info@alirezaivaz.ir](mailto:info@alirezaivaz.ir)
