# Java 教程 #
Java 是由Sun Microsystems公司于1995年5月推出的高级程序设计语言。Java可运行于多平台，如Windows, Mac OS, 及其他多种UNIX版本的系统。

我的第一个JAVA程序：`HelloWorld.java`

	public class HelloWorld {
		public static void main(String[] args) {
			System.out.println("Hello World");
		}
	}

## Java 简介 ##
Java是由Sun Microsystems公司于1995年5月推出的Java面向对象程序设计语言和Java平台的总称。由James Gosling和同事们共同研发，并于1995年正式推出。

Java分为三个体系：

- JavaSE(J2SE)
- JavaEE(J2EE)
- JavaME(J2ME)

2005年6月，JavaOne大会召开，SUN公司公开Java SE 6。此时，Java的各种版本已经更名以取消其中的数字“2”：J2EE更名为Java EE，J2SE更名为Java SE，J2ME更名为Java ME。

主要特性：

- Java语言是简单的；
- Java语言是面向对象的；
- Java语言是分布式的；
- Java语言是健壮的；
- Java语言是安全的；
- Java语言是体系结构中立的；
- Java语言是可移植的；
- Java语言是解释型的；
- Java语言是高性能的；
- Java语言是多线程的；
- Java语言是动态的；

Java开发工具：http://www.eclipse.org/downloads/

## Java 开发环境配置 ##
下载 Java：java开发工具包JDK：http://www.oracle.com/technetwork/cn/java/javase/downloads/index.html

配置环境变量

在"系统变量"中设置3项属性，JAVA_HOME, PATH, CLASSPATH (大小写无所谓),若已存在则点击"编辑"，不存在则点击"新建"。

变量设置参数如下：

	变量名：JAVA_HOME
	变量值：C:\Program Files (x86)\Java\jdk1.8.0_91   // 要根据自己的实际路径配置
	变量名：CLASSPATH
	变量值：.;%JAVA_HOME%\lib\dt.jar;%JAVA_HOME%\lib\tools.jar;         //记得前面有个"."
	变量名：Path
	变量值：%JAVA_HOME%\bin;%JAVA_HOME%\jre\bin;

测试JDK是否安装成功：

cmd 键入命令：java -version, java, javac

## Java 基础语法 ##
一个Java程序可以认为是一系列对象的集合，而这些对象之间通过调用彼此的方法来协同工作。下面简要介绍下类、对象、方法和实例变量的概念。

- 对象是类的一个实例，有状态和行为。
- 类是一个模板，它描述一类对象的行为和状态。
- 方法就是行为，一个类可以有很多方法。逻辑运算、数据修改以及所有动作都是在方法中完成的。
- 实例变量：每个对象都有独特的实例变量，对象的状态由这些实例变量的值决定。

### 基本语法
编写Java程序时，应注意以下几点：

- 大小写敏感
- 类名：对于所有的类来说，类名的首字母应该大写。如果类名由若干单词组成，那么每个单词的首字母应该大写。
- 所有的方法名都应该以小写字母开头。如果方法名含有若干单词，则后面的每个单词首字母大写。
- 源文件名：源文件名必须和类名相同。当保存文件的时候，你应该使用类名作为文件名保存，文件名的后缀为 .java
- 主方法入口：所有的java程序由 public static void main(String[] args) 方法开始执行

### Java标识符
Java所有的组成部分都需要名字。类名、变量名以及方法名都被成为标识符。

关于标识符，有以下几点需要注意：

- 所有的标识符都应该以字母、美元符、或者下划线开始；
- 首字符之后可以使字母、美元符、下划线或数字的任意字符组合
- 关键字不能作为标识符
- 标识符是大小写敏感
- 合法标识符举例：age, $salary, _value, __1_value
- 非法标识符举例：123abc, -salary

## Java 对象和类 ##



## Java 基本数据类型 ##



## Java 变量类型 ##



## Java 修饰符 ##



## Java 运算符 ##



## Java 循环结构 ##



## Java 分支结构 ##



## Java Number & Math 类 ##



## Java Character 类 ##



## Java String 类 ##



## Java StringBuffer ##



## Java 数组 ##



## Java 日期时间 ##



## Java 正则表达式 ##



## Java 方法 ##



## Java Stream、File、IO ##



## Java Scanner 类 ##



## Java 异常处理 ##



# Java 面向对象 #
## Java 继承 ##



## Java Override/Overload ##



## Java 多态 ##



## Java 抽象类 ##



## Java 封装 ##



## Java 接口 ##



## Java 包(package) ##



# Java 高级教程 #
## Java 数据结构 ##



## Java 集合框架 ##



## Java 泛型 ##



## Java 序列化 ##



## Java 网络编程 ##



## Java 发送邮件 ##



## Java 多线程编程 ##



## Java Applet 基础 ##



## Java 文档注释 ##



## Java 实例 ##



## Java 8 新特性 ##



## Java MySQL 连接 ##


