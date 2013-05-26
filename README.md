VanityViews _for Android_
=====================================

> The purpose of this repo is to provide a list of fairly used compound views with all the interdependencies that is repeatedly written by a lot of developers



### List of VanityViews
#### [SeekBarWithText](#SeekBarWithText)

_more to come... please contribute your views too..._

<a name="SeekBarWithText" />
SeekBarWithText
---------------
Seekbar that changes the value of text upon sliding.

Demo: `/library/res/layout/vv_seekbars.xml`

<img src="http://i.imgur.com/rDbIGDu.png" alt="SeekBarWithText screenshot" style="width: 200px;"/>

### simple xml implementation

```xml
<in.jasonleon.vanityviews.widget.SeekBarWithText
    android:layout_width="match_parent"
    android:layout_height="wrap_content" />
```

### custom xml layout

```xml
<in.jasonleon.vanityviews.widget.SeekBarWithText
    android:layout_width="match_parent"
    android:layout_height="wrap_content" >

    <include
        android:id="@id/vv_custom_include"
        layout="@layout/custom_seekbar" />
</in.jasonleon.vanityviews.widget.SeekBarWithText>
```
