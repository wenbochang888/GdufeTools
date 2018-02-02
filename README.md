# GdufeTools

## 项目起源

由于每次查课表，查成绩都要去教务系统，而且每次都要登录，并且教务系统的页面只适用于

电脑端，对手机端的小屏幕非常的不友好，所以想开发一个适应于手机端的教务系统网页。

## 项目功能

项目有简单的查询课表，查询成绩，查询个人信息，素质拓展，饭卡余额，图书借阅等功能。

这些信息都是同步于教务系统，API网址于：http://www.wegdufe.com/apidoc/#api-Jw-get_basic

这个API是一个已经毕业的师兄做毕业设计开发的，是PHP进行爬取整理的。

![Image text](https://github.com/wenbochang888/GdufeTools/blob/master/index.png)

## 项目技术

主要用到了spring + springmvc。以及用到了第三方的库，google开发的Gson库。

其中在这个项目中学习到了，如何进行登录的拦截，用到了springmvc的HanderIntercptor

并且学会了如何进行cookie保存，下次就无需登录，直接访问，极大地方便了用户。

以前只知道如何有cookie，却不知如何用，这次在项目中运用，并且f12进行了调试，加深了印象。

## 未来拓展

个人比较想放到公众号上，用户一点击菜单栏就显示出这个页面，类似于超级课程表的那种。

不过他是一个App，但不是所有人都想下载App的。