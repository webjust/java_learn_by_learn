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

### Java修饰符
像其他语言一样，Java可以使用修饰符来修饰类中方法和属性。主要有两类修饰符：

- 访问控制修饰符：default, public, protected, private
- 非访问控制修饰符：final, abstract, strictfp

### Java变量
Java中主要有如下几种类型的变量：

- 局部变量
- 类变量（静态变量）
- 成员变量（非静态变量）

### Java数组
数组是存储在堆上的对象，可以保存多个同类型变量。

### Java枚举
Java 5.0引入了枚举，枚举限制变量只能是预先定义好的值，使用枚举可以减少代码中的bug。

### Java关键词
见表

### Java注释
类似于C/C++，java也支持单行以及多行注释。注释中的字符将被Java编译器忽略。

### Java空行
空白行，或者有注释的行，Java编译器都会忽略掉。

### 继承
在Java中，一个类可以由其他类派生。如果你要创建一个类，而且已经存在一个类具有你所需要的属性或方法，那么你可以将新创建的类继承该类。

利用继承的方法，可以重用已存在类的方法和属性，而不用重写这些代码。被继承的类称为超类，派生类成为子类。

### 接口
在Java中，接口可理解为对象间相互通信的协议，接口在继承中扮演着很重要的角色。接口只定义派生要用到的方法，但是方法的具体实现完全取决于派生类。

### Java源程序与编译型运行区别
如图：

<img src="http://www.runoob.com/wp-content/uploads/2013/12/ZSSDMld.png" width="100%" />

## Java 对象和类 ##
Java作为一种面向对象语言。支持以下基本概念：

- 多态
- 继承
- 封装
- 抽象
- 类
- 对象
- 实例
- 方法
- 重载

本节重点研究对象和类的概念。

- 对象：对象是类的一个实例，有状态和行为。
- 类：类时一个模板，它描述一类对象的行为和状态。

### Java中的对象
对比现实对象和软件对象，他们之间十分相似。

软件对象也有状态和行为。软件对象的状态就是「属性」，行为通过「方法」体现。

在软件开发中，方法操作对象内部状态的改变，对象的相互调用也是通过「方法」来完成。

### Java中的类
类可以看成是创建Java对象的模板。

通过下面的一个简单的类来理解下Java中类的定义：

	public class Dog{
		String breed;
		int age;
		String color;
		void barking(){

		}
		void hungry(){

		}
		void sleep(){
			
		}
	}

一个类可以包含以下类型变量：

- 局部变量：在方法、构造方法或者语句块中定义的变量被称为局部变量。变量声明和初始化都是在方法中，方法结束后，变量就会自动销毁。
- 成员变量：成员变量时定义在类中，方法体之外的变量。这种变量时在创建对象的时候实例化。成员变量可以被类中的方法、构造方法和特定类中的语句块访问。
- 类变量：类变量也声明在类中，方法体之外，但必须声明为static类型。

一个类可以拥有多个方法，在上面的例子中：barking(), hungry() 和 sleeping() 都是Dog类的方法。

### 构造方法
每个类都有构造方法。如果没有显式地为类定义构造方法，Java编译器将会为该类提供一个默认构造方法。

在创建一个对象的时候，至少调用一个构造方法。构造方法的名称必须与类同名，一个类可以有多个构造方法。

下面是一个构造方法示例：

	public class Puppy{
		public Puppy() {
		}

		public Puppy(String name){
			System.out.println(name);
		}
	}

### 创建对象
对象是根据类创建的。在Java中，使用关键字new来创建一个新的对象。创建对象需要以下三步骤：

- 声明：声明一个对象，包括对象名称和对象类型。
- 实例化：使用关键字new来创建一个对象。
- 初始化：使用new创建对象时，会调用构造方法初始化对象。

下面是创建一个对象的例子：

	public class Puppy{
		public Puppy(String name){
			System.out.println(name);
		}

		public static void main(String[] args){
			Puppy myPuppy = new Puppy("Chris");
		}
	}

### 访问实例变量和方法
通过已创建的对象来访问成员变量和成员方法，如下所示：

/*实例化对象*/
ObjectReference = new Constructor();
/*访问类中的变量*/
ObjectReference.variableName;
/*访问类中的方法*/
ObjectReference.MethodName();

### 实例
下面的例子展示如何访问实例变量和调用成员方法：

	public class Puppy2{
		int puppyAge;

		public Puppy2(String name) {
			System.out.println("小狗的名字：" + name);
		}

		public void setAge(int age) {
			puppyAge = age;
		}

		public void getAge() {
			System.out.println("小狗的年龄为：" + puppyAge);
		}

		public static void main(String[] args) {
			// 创建对象
			Puppy2 myPuppy = new Puppy2("tommy");
			// 通过方法来设定年龄
			myPuppy.setAge(2);
			// 通过方法来获取年龄
			myPuppy.getAge();
			// 访问成员变量
			System.out.println("变量值为：" + myPuppy.puppyAge);
		}
	}

### 源文件声明规则
在本节的最后部分，我们将学习源文件的声明规则。当在一个源文件中定义多个类，并且还有import语句和package语句时，要特别注意这些规则。

- 一个源文件中只能有一个public类
- 一个源文件可以有多个非public类
- 源文件的名称应该和public类的类名保持一致。例如：源文件中public类的类名是Employee，那么源文件应该命名为Employee.java。
- 如果一个类定义在某个包中，那么package语句应该在源文件的首行。
- 如果源文件包含import语句，那么应该放在package语句和类定义之间。如果没有package语句，那么important语句应该在源文件中最前面。
- import语句和package语句对源文件中定义的所有类都有效。在同一源文件中，不能给不同的类不同的包声明。

### Java包
包主要用来对类和接口进行分类。当开发Java程序时，可能编写成百上千的类，因此很有必要对类和接口进行分类。

#### Import语句
在Java中，如果给出一个完整的限定名，包括包名、类名，那么Java解释器就可以很容易地定位到源代码或者类。Import语句就是用来提供一个合理的路径，使得编译器可以找到某个类。

	import java.io.*;

#### 一个简单的例子
在该例子中，我们创建两个类：Employee 和 EmployeeTest。Employee类有4个成员变量，显式声明了一个构造方法，该方法只有一个参数。

	import java.io.*;

	public class Employee{
		String name;
		int age;
		String designation;
		double salary;

		// Employee类的构造器
		public Employee(String name) {
			this.name = name;
		}
		// 设置age的值
		public void empAge(int empAge) {
			age = empAge;
		}
		// 设置designation的值
		public void empDesignation(String empDesig) {
			designation = empDesig;
		}
		// 设置salary的值
		public void empSalary(double empSalary) {
			salary = empSalary;
		}
		// 打印信息
		public void printEmployee() {
			System.out.println("名字" + name);
			System.out.println("年龄" + age);
			System.out.println("职位" + designation);
			System.out.println("薪水" + salary);
		}
	}

程序都是从 main 方法开始执行，为了可以运行这个程序，必须包含main方法并且创建一个实例对象。

下面给出 EmployeeTest 类，该类实例化2个 Employee 类的实例，并调用方法设置变量的值。

	import java.io.*;

	public class EmployeeTest{
		public static void main(String[] args) {
			// 是用构造器创建两个对象
			Employee empOne = new Employee("Test 01");
			Employee empTwo = new Employee("Test 02");

			// 调用这2个对象的成员方法
			empOne.empAge(26);
			empOne.empDesignation("高级程序员");
			empOne.empSalary(9000);
			empOne.printEmployee();
			
			empTwo.empAge(20);
			empTwo.empDesignation("菜鸟程序员");
			empTwo.empSalary(2000);
			empTwo.printEmployee();
		}
	}

编译这2个文件，并且运行 EmployeeTest 类。


## Java 基本数据类型 ##
变量就是申请内存来存储值。也就是说，当创建变量的时候，需要在内存中申请空间。

内存管理系统根据变量的类型为变量分配存储空间，分配的存储空间只能用来存储该类型数据。

因此，通过定义不同类型的变量，可以在内存中储存整数、小数或者字符。

Java 的两大数据类型：

- 内置数据类型
- 引用数据类型

### 内置数据类型 ###
Java语言提供了八种基本类型。六种数字类型（四个整数型、两个浮点型），一种字符类型，还有一种布尔类型。

byte:

- byte数据类型是8位，有符号，以二进制补码表示的整数；
- 最小值是 -128 (-2^7)
- 最大值 127 (2^7-1)
- 默认值0
- byte类型用在大型数组中节约空间，主要代替整数，因为byte变量占用的空间只是int类型的四分之一
- 例子：byte a=100, byte b=-50

short:

- short数据类型是16位，有符号的以二进制补码表示的整数
- 最小值是 (-2^15) -32768
- 最大值是 (2^15-1) 32767
- Short数据类型也可以像byte那样节省空间，一个short变量是int型变量所占空间的二分之一
- 默认值是0
- 例子：short s = 1000, short r = -20000;

int:

- int数据类型是32位、有符号的以二进制补码表示的整数
- 最小值是 (-2^31) -2147483648
- 最大值是 (2^31-1) 2147483647
- 一般地整型变量默认为int类型
- 默认值是0
- 例子：int a = 100000; int b = -20000000;

long:

- long数据类型是64位，有符号的以二进制补码表示的整数
- 最小值是 (-2^63) -9,223,372,036,854,775,808
- 最大值是 (2^63-1) 9,223,372,036,854,775,807
- 这种类型主要使用在需要比较大整数的系统上；
- 默认值是0L
- 例子：long a = 100000L; Long b=-20000000L (L理论上不区分大小写，但是若写成l容易与数字“1”混淆，不容易分辨，所以最好大写)

float:

- float数据类型是单精度、32位、符合IEEE754标准的浮点数
- float在储存大型浮点数组的时候可节省内存空间；
- 默认值是0.0f；
- 浮点数不能用来表示精确的值，如货币；
- 例子：float f1 = 234.5f;

double:

- double 数据类型是双精度、64位、符合IEEE754标准的浮点数
- 浮点数的默认类型为double类型
- double类型同样不能表示精确的值，如货币
- 默认值是 0.0d
- 例子：double d1 = 123.4

boolean:

- boolean数据类型表示一位的信息；
- 只有两个取值：true , false；
- 这种类型只作为一种标志来记录 true/false 情况
- 默认值是 false
- 例子 boolean one = true;

char:

- char 类型是一个单一的16位 Unicode 字符；
- 最小值是 \u0000 即为0
- 最大值是 \uffff 即为65535
- char 数据类型可以存储任何字符；
- 例子 char letter='A';

### 实例 ###
对于数值类型的基本类型的取值范围，我们无需强制去记忆，因为他们的值都已经以常理的形式定义在对应的包装类中了。

	public class PrimitiveTypeTest{
		public static void main(String[] args) {
			// byte
			System.out.println("基本类型：byte二进制位数：" + Byte.SIZE);
			System.out.println("包装类：java.lang.Byte");
			System.out.println("最小值：Byte.MIN_VALUE=" + Byte.MIN_VALUE);
			System.out.println("最小值：Byte.MAX_VALUE=" + Byte.MAX_VALUE);
			System.out.println();

			// short
			System.out.println("基本类型：short 二进制位数：" + Short.SIZE);
			System.out.println("包装类：java.lang.Short");
			System.out.println("最小值：Short.MIN_VALUE=" + Short.MIN_VALUE);
			System.out.println("最大值：Short.MAX_VALUE=" + Short.MAX_VALUE);
			System.out.println();
			
			// int
			System.out.println("基本类型：int 二进制位数：" + Integer.SIZE);
			System.out.println("包装类：java.lang.Integer");
			System.out.println("最小值：Integer.MIN_VALUE=" + Integer.MIN_VALUE);
			System.out.println("最大值：Integer.MAX_VALUE=" + Integer.MAX_VALUE);
			System.out.println();
			
			// long
			System.out.println("基本类型：long 二进制位数：" + Long.SIZE);
			System.out.println("包装类：java.lang.Long");
			System.out.println("最小值：Long.MIN_VALUE" + Long.MIN_VALUE);
			System.out.println("最大值：Long.MAX_VALUE" + Long.MAX_VALUE);
			System.out.println();
			// float
			System.out.println("基本类型：float 二进制位数：" + Float.SIZE);
			System.out.println("包装类：java.lang.Float");
			System.out.println("最小值：Float.MIN_VALUE=" + Float.MIN_VALUE);
			System.out.println("最大值：Float.MAX_VALUE=" + Float.MAX_VALUE);
			System.out.println();
			// double
			System.out.println("基本类型：double 二进制位数：" + Double.SIZE);
			System.out.println("包装类：java.lang.Double");
			System.out.println("最小值：Double.MIN_VALUE=" + Double.MIN_VALUE);
			System.out.println("最大值：Double.MAX_VALUE=" + Double.MAX_VALUE);
			System.out.println();
			// char
			System.out.println("基本类型：char 二进制位数：" + Character.SIZE);
			System.out.println("包装类：java.lang.Character");
			System.out.println("最小值：Character.MIN_VALUE=" + (int)Character.MIN_VALUE);
			System.out.println("最大值：Character.MAX_VALUE=" + (int)Character.MAX_VALUE);
			System.out.println();
		}
	}

Float和Double的最小值和最大值都是以科学计数法的形式输出的，结尾的“E+数字”表示E之前的数字要乘以10的多少次方。比如3.14E3就是3.14X10^3=3140; 3.14E-3就是3.14X10^-3=0.00314。

### 引用类型 ###
- 在Java中，引用类型的变量非常类似于C/C++的指针。引用类型指向一个对象，指向对象的变量是引用变量。这些变量在声明时被指定为一个特定的类型，比如 Employee, Puppy等。变量一旦声明后，类型就不能被改变了。
- 对象、数组都是引用数据类型。
- 所有的引用类型的默认值都是 null。
- 一个引用变量可以用来引用任何与之兼容的类型。
- 例子：Site site = new Site("WWWW");

### Java常量 ###
常量在程序运行时是不能被修改的。
在Java中使用final关键字来修饰常量，声明方式和变量类似：

	final double PI = 3.1415927;

虽然常量名也可以用小写，但为了便于识别，通常使用大写字母来表示常量。

字面量可以赋给任何内置类型的变量。例如：

	byte a = 68;
	char a = 'A';

byte, int, long 和 short 都可以用十进制、16进制以及8进制的方式来表示。

当使用常量的时候，前缀 0 表示 8进制，而前缀 ox 代表 16 进制，例如：

	int decimal = 100;
	int octal = 0144;
	int hexa = 0x64;

和其他语言一样，Java的字符串常量也是包含在两个引号之间的字符序列。下面是字符串类型字面量的例子：

	"Hello World"
	"two\nlines"
	"\"This is in qutes\""

字符串常量和字符常量都可以包含任何Unicode字符。例如：

	char a = '\u0001';
	String a = '\u0001';

Java语言支持一些特殊的转义字符序列：

### 自动类型转换 ###
整型、实型(常量)、字符型数据可以混合运算。运算中，不同类型的数据先转化为同一类型，然后进行运算。转换从低级到高级。

byte<short<char<int<long<float<double

数据类型转换必须满足如下规则：

- 不能对boolean类型进行类型转换
- 不能把对象类型转换成不相关类的对象
- 在把容量大的类型转换为容量小的类型时必须使用强制类型转换
- 转换过程中可能导致溢出或损失精度，例如：int i=128; byte b=(byte)i; 因为byte类型是8位，最大值是127，所以当int强制转换为byte类型时，值128时候就会导致溢出。
- 浮点数到整数的转换是通过舍弃小数得到，而不是四舍五入，例如：(int)23.7=23; (int)-45.89f=-45;

### 自动类型转换 ###
必须满足转换前的数据类型的位数要低于转换后的数据类型，例如：short数据类型的位数为16位，就可以自动转换为位数为32位的int类型，同样float数据类型的位数为32，可以自动转换为64位的double类型。

	public class ZiDongZhuanHuan{
		public static void main(String[] args){
			char c1 = 'a';
			int i1 = c1;
			System.out.println("char自动类型转换为int后的值为：" + i1);
			char c2 = 'a';
			int i2=c2+1;
			System.out.println("char类型和int计算后的值等于：" + i2);
		}
	}

解析：c1的值为字符'1'，查ascii码表可知对应的int类型值为97，所以'a'对应的值为97，所以i2=97+1=98。

### 强制类型转换 ###
- 条件时转换的数据类型必须是兼容的；
- 格式：(type)value type是要强制类型转换后的数据类型 

实例：

	public class QiangZhiZhuanHuan{
		public static void main(String[] args){
			int i1=128;
			byte b=(byte)i1;
			System.out.println("int类型强制转换为byte后的值等于" + b);
		}
	}

### 隐含强制类型转换 ###
- 整数的默认类型是 int
- 浮点数不存在这种情况，因为在定义float类型时必须在数字后面跟上F或者f；

## Java 变量类型 ##
在Java语言中，所有的变量在使用前必须声明。声明变量的基本格式如下：

	type identifier [=value][,identifier [=value]...];

格式说明：type为Java数据类型。identifier是变量名。可以使用逗号隔开来声明多个同类型变量。

以下列出了一些变量的声明实例。注意有些包含了初始化过程。

	int a,b,c;			// 声明3个int整型整数：a, b, c
	int d=3,e=4,f=5;	// 声明3个整数并赋予初值
	byte z=22;			// 声明并初始化z
	String s="runoob";	// 声明并初始化字符串s
	double pi=3.14159;	// 声明了双精度浮点型变量pi
	char x='x';			// 声明变量x的值是字符x

Java语言支持的变量类型有：

- 类变量：独立于方法之外的变量，用static修饰
- 实例变量：独立于方法之外的变量，不过没有static修饰
- 局部变量：类的方法中的变量

实例：

	public class Variable{
		static int allClicks=0;		// 类变量
		String str="hello world";	// 实例变量
		public void main(){
			int i=0;				// 局部变量
		}
	}

### Java局部变量 ###
- 局部变量声明在方法、构造方法或者语句块中；
- 局部变量在方法、构造方法、或者语句块被执行的时候创建，当他们执行完成后，变量将会被销毁；
- 访问修饰符不能用于局部变量；
- 局部变量只在声明它的方法、构造方法或者语句块中可见；
- 局部变量是在栈上分配的；
- 局部变量没有默认值，所以局部变量被声明后，必须经过初始化，才可以使用。

#### 实例1 ####
在以下实例中age是一个局部变量。定义在pupAge()方法中，它的作用域就限制在这个方法中：

	public class Test{
		public void pupAge(){
			int age=0;
			age=age+7;
			System.out.println("小狗的年龄是："+age);
		}

		public static void main(String[] args) {
			Test test = new Test();
			test.pupAge();
		}
	}


### 实例变量 ###
- 实例变量声明在一个类中，但在方法、构造方法和语句块之外；
- 当一个对象被实例化之后，每个实例变量的值就跟着确定；
- 实例变量在对象创建的时候创建，在对象被销毁的时候销毁；
- 实例变量的值应该至少被一个方法、构造方法或者语句块引用，使得外部能够通过这些方式获取实例变量信息；
- 实例变量可以声明在使用前或者使用后；
- 访问修饰符可以修饰实例变量；
- 实例变量对于类中的方法、构造方法或者语句块是可见的。一般情况下应该把实例变量设为私有。通过使用访问修饰符可以使实例变量对子类可见；
- 实例变量具有默认值。数值型变量的默认值是0，布尔变量的默认值是false，引用类型变量的默认值是null。变量的值可以在声明时指定，也可以在构造方法中指定。
- 实例变量可以直接通过变量名访问。但在静态方法以及其他类中，就应该使用完全限定名：ObejectReference.VariableName。

实例：

	public class Employee{
		public String name;
		private double salary;
		public Employee(String empName){
			name=empName;
		}
		public void setSalary(double empSal){
			salary=empSal;
		}
		public void printEmp(){
			System.out.println("名字："+name);
			System.out.println("薪水："+salary);
		}
		public static void main(String[] args){
			Employee empOne=new Employee("Jack");
			empOne.setSalary(1000);
			empOne.printEmp();
		}
	}

### 静态变量(类变量) ###
- 类变量也成为静态变量，在类中以staic关键字声明，但必须在构造方法和语句块之外。
- 无论一个类创建了多少个对象，类只拥有类变量的一份拷贝。
- 静态变量除了被声明为常量外很少使用。常量是指声明为public/private，final和static类型的变量。常量初始化后不可改变。
- 静态变量存储在静态存储区。经常被声明为常量，很少单独使用static声明变量。
- 静态变量在程序开始时创建，在程序结束时销毁。
- 与实例变量具有相似的可见性。但为了对类的使用者可见，大多数静态变量声明为public类型。
- 默认值和实例变量相似。数值型变量默认值是0，布尔型默认值是false，引用类型默认值是null。变量的值可以在声明的时候指定，也可以在构造方法中指定。此外，静态变量还可以在静态语句块中初始化。
- 静态变量可以通过：ClassName.VariableName的方式访问。
- 类变量被声明为public static final类型时，类变量名称一般建议使用大写字母。如果静态变量不是public和final类型，其命名方式与实例变量以及局部变量的命名方式一致。

实例：

	public class Employee2{
		// salary是静态的私有变量
		private static double salary;
		// DEPARTMENT是一个常量
		public static final String DEPARTMENT="开发人员";
		public static void main(String[] args){
			salary=10000;
			System.out.println(DEPARTMENT + "平均工资："+salary);
		}
	}

注意：如果其他类想要访问该变量，可以这样访问：Employee.DEPARTMENT。

## Java 修饰符 ##
Java语言提供了很多修饰符，主要分为以下两类：

- 访问修饰符
- 非访问修饰符

修饰符用来定义类、方法或者变量，通常放在语句的最前端。

### 访问控制修饰符 ###
Java中，可以使用访问控制符来保护对类、变量、方法和构造方法的访问。Java支持4种不同的访问权限。

- default
- private
- public
- protected



## Java 运算符 ##



## Java 循环结构 ##



## Java 分支结构 ##



## Java Number & Math 类 ##



## Java Character 类 ##
Character类用于对单个字符进行操作。

Character类在对象中包装一个基本类型char值。

然而，在实际开发过程中，我们经常会遇到需要使用对象，而不是内置数据类型的情况。为了解决这个问题，Java语言为内置数据类型char提供了包装类Character类。

Character类提供了一系列方法来操纵字符。你可以使用Character的构造方法创建一个Character类对象，例如：

	Character ch = new Character('a');
	
在某些情况下，Java编译器会自动创建一个Character对象。

例如，将一个char类型的参数传递给需要一个Character类型参数的对象时，那么编译器会自动地将char类型参数转换为Character独享。这种特征称为装箱，反过来称为拆箱。

实例：

### 转义序列
前面有反斜杠(\)的字符代表转义字符，它对编译器来说是有特殊含义的。

下面列表展示了Java的转义序列：

<table width="100%">
	<tr>
		<thead>转义序列</thead>
	</tr>
	<tr>
		<th>转义序列</th>
		<th>描述</th>
	</tr>
	<tr>
		<td>\t</td>
		<td>在文中该处插入一个tab键</td>
	</tr>
	<tr>
		<td>\b</td>
		<td>在文中该处插入一个后退键</td>
	</tr>
	<tr>
		<td>\n</td>
		<td>在文中该处换行</td>
	</tr>
	<tr>
		<td>\r</td>
		<td>在文中该处插入回车</td>
	</tr>
	<tr>
		<td>\f</td>
		<td>在文中该处插入换页符</td>
	</tr>
	<tr>
		<td>\'</td>
		<td>在文中插入单引号</td>
	</tr>
	<tr>
		<td>\"</td>
		<td>在文中插入双引号</td>
	</tr>
	<tr>
		<td>\\</td>
		<td>在文中插入反斜线</td>
	</tr>
</table>

实例：

## Java String 类 ##
字符串广泛应用在Java编程中，在Java中字符串属于对象，Java提供了String类来创建和操作字符串。

### 创建字符串 ###
创建字符串最简单的方式如下：

	String greeting = "菜鸟教程";
	
在代码中遇到字符串常量时，这里的值是"菜鸟教程"，编译器会使用该值创建一个String对象。

和其他对象一样，可以使用关键字和构造方法来创建 String 对象。

String 类有11种构造方法，这些方法提供不同的参数来初始化字符串，比如提供一个字符数组参数：

例子：

> 注意：String类是不可改变的，所以你一但创建了String对象，那它的值就无法改变了。

如果需要对字符串做很多修改，那么应该选择使用 StringBuffer & StringBuilder 类。

### 字符串长度
用于获取有关对象的信息的方法称为访问器方法。

String类的一个访问器方法是 length() 方法，它返回字符串对象包含的字符数。

例子：

### 连接字符串
String类提供了连接两个字符串的方法：

	String1.concat(string2);
	
返回 string2 连接 string1 的新字符串。也可以对字符串常量使用 concat() 方法，如：

	"我的名字是".concat("Tony");
	
更常用的是使用'+'操作符来连接字符串，如：

	"Hello," + " Tony" + "!"
	
下面是一个例子：

### 创建格式化字符串
我们知道输出格式化数字可以使用 printf() 和 format() 方法。

String 类使用静态方法 format() 返回一个 String 对象而不是 PrintStream 对象。

String 类的静态方法 format() 能用来创建可复用的格式化字符串，而不仅仅是用于一次打印输出。

## Java StringBuffer和StringBuilder类 ##
当对字符串进行修改的时候，需要使用 StringBuffer 和 StringBuilder 类。

和String类不同的是，StringBuffer 和 StringBuilder 类的对象能够被多次的修改，并且不产生新的未使用对象。

StringBuilder 类在 Java 5 中被提出，它和 StringBuffer 之间的最大不同在于 StringBuilder 的方法不是线程安全的 (不能同步访问)。

由于 StringBuilder 相较于 StringBuffer 有速度优势，所以多数情况下建议使用 StringBuilder 类。然而在应用程序要求线程安全的情况下，则必须使用 StringBuffer 类。

例子：


## Java 数组 ##
数组对于每一门编程语言来说都是重要的数据结构之一，当然不同语言对数组的实现及处理也不尽相同。

Java语言中提供的数组是用来存储固定大小的同类型元素。

你可以声明一个数组变量，如 numbers[100] 来代替直接声明 100 个独立变量 number0, number1,...,number99。

下面，我们将为大家介绍 Java 数组的声明，创建和初始化，并给出其对应的代码。

### 声明数组变量
首先必须声明数组变量，才能在程序中使用数组，下面是声明数组变量的语法：

	dataType[] arrayRefVar;	// 首选方法
	或
	dataType arrayRefVar[];
	
> 注意：建议使用 dataType[] arrayRefVar 的声明风格声明数组变量， dataType arrayRefVar[] 风格来自 C/C++ 语言，在Java中采用是为了让 C/C++程序员能够快速理解java语言。

实例：


### 创建数组
Java语言使用new操作符来创建数组，语法如下：

	arrayRefVar = new dataType[arraySize];

上面的语法语句做了两件事：

- 使用 dataType[arraySize] 创建了数组；
- 把新创建的数组的引用赋值给变量 arrayRefVar。

数组变量的声明，和创建数组可以用一条语句完成，如下所示：

	dataType[] arrayRefVar = new dataType[arraySize];
	
另外，你还可以使用如下的方式创建数组：

	dataType[] arrayRefVar = {value0, value1, ..., valuek};
	
数组的元素是通过索引访问的，数组索引从0开始，所以索引值从0到 arrayRefVar.length-1 。

实例：

### 处理数组
数组的元素类型和数组的大小都是确定的，所以当处理数组元素的时候，我们通常使用基本循环或者 foreach循环 。

实例：

### foreach循环
JDK1.5引进了一种新的循环类型，被称为 foreach循环 或者加强型循环，它能在不适用下标的情况下遍历数组。

实例：

### 数组作为函数的参数
数组可以作为参数传递给方法。

### 数组作为函数的返回值
### 多维数组
多维数组可以看成是数组的数组，比如二维数组就是一个特殊的一维数组，其每一个元素都是一个一维数组，例如：

	String str[][] = new String[3][4];

## Java 日期时间 ##
java.util包提供了 Date 类来封装当前的日期和时间。Date类提供两个构造函数来实例化 Date 对象。

方法1：使用当前日期和时间来初始化对象。

	Date()

方法2：接收一个参数，该参数是从1970年1月1日起的毫秒数。

	Date(long millisec)
	


## Java 正则表达式 ##
正则表达式定义了字符串的模式。

正则表达式可以用来搜索、编辑或处理文本。

正则表达式并不仅限于某一种语言，但是在每种语言中有细微的差别。


## Java 方法 ##
在前面我们经常使用的 System.out.println() ，那么它是什么呢？

- println() 是一个方法
- System 是系统类
- out 是标准输出对象

这句话的用法是调用系统类 System 中的标准输出对象 out 中的方法：println()。

**那么什么是方法呢？**

Java方法是语句的集合，它们在一起执行一个功能。

- 方法是解决一类问题的步骤的有序组合
- 方法包含于类或对象中
- 方法在程序中被创建，在其他地方被引用

**方法的优点**

- 使程序变得更简短而清晰
- 有利于程序维护
- 可以提高程序开发的效率
- 提高了代码的重用性

**方法的命名规则**

- 方法的名字的第一个单词应以小写字母作为开头，后面的单词则用大写字母开头写，不使用连接符。例如：addPerson。
- 下划线可能出现在 JUnit 测试方法名称中用以分隔名称的逻辑组件。一个典型的模式是：test<MethodUnderTest>_<state>，例如：testPop_emptyStack。

### 方法的定义
一般情况下，定义一个方法包含以下语法：

	修饰符 返回值类型 方法名(参数类型 参数名){
		...
		方法体
		...
		return 返回值;
	}

方法包含一个方法头和一个方法体。下面是一个方法的所有部分：

- 修饰符：修饰符，这是可选的，告诉编译器如何调用该方法。定义了该方法的访问类型。
- 返回值类型：方法可能会返回值。returnValueType 是方法返回值的数据类型。有些方法执行所需的操作，但没有返回值。在这种情况下，returnValueType是关键字void。
- 方法名：是方法的实际名称。方法名和参数表共同构成方法签名。
- 参数类型：参数像是一个占位符。当方法被调用时，传递值给参数。这个值被称为实参或变量。参数列表是指方法的参数类型、顺序和参数的个数。参数是可选的，方法可以不包含任何参数。
- 方法体：方法体包含具体的语句，定义该方法的功能。
	
### 方法调用
Java支持两种调用方法的方式，根据方法是否返回值来选择。

当程序调用一个方法时，程序的控制权交给了被调用的方法。当被调用方法的返回语句执行或者到达方法体闭括号时候交还控制权给程序。

当方法返回一个值的时候，方法调用通常被当做一个值。例如：

	int larger = max(30, 40);
	
如果方法返回值是void，方法调用一定是一条语句。例如：方法 println 返回 void。下面的调用是个语句：

	System.out.println("hello");
	
实例：


### void关键字
本节说明如何声明和调用一个void方法。

下面的例子声明了一个名为 printGrade 的方法，并且调用它来打印给定的分数。



### 通过值传递参数
调用一个方法时候需要提供参数，你必须按照参数列表指定的顺序提供。

### 方法的重载
上面使用的max方法仅仅适用于int型数据。但如果你想得到两个浮点类型数据的最大值呢？

解决方法是创建另一个有相同名字但参数不同的方法，如下面代码所示：

...

如果你调用max方法时传递的是int型参数，则int型参数的max方法就会被调用；

如果传递的是 double 型参数，则 double 类型的max方法体会被调用，这叫做方法重载；

就是说一个类的两个方法拥有相同的名字，但是有不同的参数列表；

Java编译器根据方法签名判断哪个方法应该被调用。

方法重载可以让程序更清晰易读。执行密切相关任务的方法应该使用相同的名字。

重载的方法必须拥有不同的参数列表。你不能仅仅依据修饰符或者返回类型的不同来重载方法。

### 变量作用域
变量的范围是程序中该变量可以被引用的部分。

方法内定义的变量被称为局部变量；

局部变量的作用范围从声明开始，知道包含它的块结束；

局部变量必须声明才可以使用；

方法的参数范围涵盖整个方法。参数实际上是一个局部变量；

for 循环的初始化部分声明的变量，其作用范围在整个循环。

但循环体内声明的变量其适用范围是从它声明到循环体结束。它包含如下所示的变量声明：

...

你可以在一个方法里，不同的非嵌套块中多次声明一个具有相同的名称局部变量，但你不能再嵌套块内两次声明局部变量。

### 命令行参数的使用
有时候你希望运行一个程序时候再传递给它消息。这要靠传递命令行参数给 main() 函数实现。

命令行参数是在执行程序时候紧跟在程序名字后面的信息。

### 构造方法
当一个对象被创建时候，构造方法用来初始化该对象。构造方法和它所在类的名字相同，但构造方法没有返回值。

通常会使用构造方法给一个类的实例变量赋初值，或者执行其他必要的步骤来创建一个完整的对象。

不管你与否自定义构造方法，所有的二类都有构造方法，因为Java自动提供了一个默认的构造方法，它把所有成员初始化为0。

一旦你定义了自己的构造方法，默认构造方法就会失效。

...

### 可变参数
JDK1.5开始，Java支持传递同类型的可变参数给一个方法。

方法的可变参数的声明如下所示：

	typeName... parameterName

在方法声明中，在指定参数类型后加一个省略号(...)

一个方法中只能指定一个可变参数，它必须是方法的最后一个参数。任何普通的参数必须在它之前声明。

### finalize()方法
Java允许定义这样的方法，它在对象被垃圾收集器析构(回收)之前调用，这个方法叫做 finalize() ，它用来清除回收对象。

例如，你可以使用 finalize() 来确保一个对象打开的文件被关闭了。

在 finalize() 方法里，你必须制定在对象销毁时候要执行的操作。

finalize() 一般格式是：

	protected void finalize() {
		// 在这里终结代码
	}

关键字 protected 是一个限定符，它确保 finalize() 方法不会被该类以外的代码调用。

当然，Java的内存回收可以由JVM来自动完成。如果你手动使用，则可以使用上面的方法。

...
	
## Java Stream、File、IO ##
Java.io包几乎包含了所有操作输入、输出需要的类。所有这些流类代表了输入源和输出目标。

Java.io包中的流支持很多种格式，比如：基本类型、对象、本地化字符集等等；

一个流可以理解为一个数据的序列。输入流表示从一个源读取数据，输出流表示向一个目标写数据。

Java为I/O提供了强大的而灵活的支持，使其更广泛地应用到文件传输和网络编程中。

但本小节讲述最基本的和流与I/O相关的功能。我们将通过一个个例子来学习这些功能。

### 读取控制台输入
### 从控制台读取多字符输入
### 从控制台读取字符串
### 控制台输出
### 读写文件
### FileInputStream
### FileOutputStream
### 文件和I/O
### java中的目录
#### 创建目录
#### 读取目录
#### 删除目录或文件

## Java Scanner 类 ##
java.util.Scanner是Java5的新特征，我们可以通过Scanner类来获取用户的输入。

下面是创建Scanner对象的基本语法：

	Scanner s = new Scanner(System.in);
	
接下来我们演示一个最简单的数据输入，并通过Scanner类的next()与nextLine() 方法获取输入的字符串，在读取前我们一般需要使用 hasNext 与 hasNextLine 判断是否还有输入的数据：


### next() 与 nextLine() 区别
**next():**

- 一定要读取到有效字符后才可以结束输入；
- 对输入有效字符之前遇到的空白，next()方法会自动将其去掉。
- 只有输入有效字符后才将其后面输入的空白作为分隔符或者结束符。
- next() 不能得到带有空格的字符串。

**nextLine():**

- 以Enter为结束符，也就是说 nextLine() 方法返回的是输入回车之前的所有字符。
- 可以获得空白。

如果要输入 int 或 float 类型的数据，在Scanner类中也有支持，但是在输入之前最好先使用 hasNextXxx() 方法进行验证，在使用 nextXxx() 来读取：

...

## Java 异常处理 ##
异常是程序中的一些错误，但并不是所有的错误都是异常，并且错误有时候是可以避免的。

比如说，你的代码少了一个分好，那么运行出来结果是提示是错误 java.lang.Error; 如果你用 System.out.println(11/0), 那么你是因为你用0作为除数，会抛出 java.lang.ArithmeticException 的异常。

异常发生的原因有很多，通常包含以下几大类：

- 用户输入了非法数据
- 要打开的文件不存在
- 网络通信时连接中断，或者JVM内存溢出。

这些异常有的是因为用户错误引起，有的是程序错误引起的，还有其他一些是因为物理错误引起的；

要理解Java异常处理时如何工作的，你需要掌握以下三种类型的异常：

- **检查性异常：** 最具代表的检查性异常是用户错误或问题引起的异常，这是程序员无法预见的。例如要打开一个不存在文件时，一个异常就发生了，这些异常在编译时不能被简单的忽略；
- **运行时异常：** 运行时异常是可能被程序员避免的异常。与检查性异常相反，运行时异常可以在编译时被忽略。
- **错误：** 错误不是异常，而是脱离程序员控制的问题。错误在代码中通常被忽略。例如，当栈溢出时，一个错误就发生了，他们在编译也检查不到的。

### Exception类的层次
### Java内置异常类
### 异常方法
### 捕获异常
### 多重捕获块
### throws/throw关键字
### finally关键字
### 声明自定义异常
### 通用异常

# Java 面向对象 #
## Java 继承 ##
### 继承的概念 ###
继承是java面向对象编程技术的一块基石，因为它允许分等级层次的类。

继承就是子类继承父类的特征和行为，使得子类对象具有父类的实例域和方法，或子类从父类继承方法，使得子类具有父类相同的行为。

#### 生活中的继承： ####
![](https://www.runoob.com/wp-content/uploads/2013/12/14B0951E-FC75-47A3-B611-4E1883887339.jpg)

#### 类的继承格式： ####
在java中通过extends关键字可以申明一个类是从另一个类继承而来的，一般形式如下：

	class Foo{
		
	}
	
	// 子类继承父类
	class Bar extends Foo{
		
	}

#### 为什么需要继承： ####
接下来，我们通过实例来说明这个需求。

- 企鹅：属性（姓名，id），方法（吃、睡、自我介绍）
- 老鼠：属性（姓名，id），方法（吃、睡、自我介绍）

企鹅类：

	public class Penguin{
		private String name;
		private int id;
		public Penguin(String myName, int myid){
			name = myName;
			id = myid;
		}
		public void eat(){
			System.out.println(name + "正在吃");
		}
		public void sleep(){
			System.out.println(name + "正在睡");
		}
		public void introduction(){
			System.out.println("大家好！我是" + id + "号" + name + ".");
		}
	}

老鼠类：

	public class Mouse{
		private String name;
		private int id;
		public Mouse(String myName, int myid){
			name = myName;
			id = myid;
		}
		public void eat(){
			System.out.println(name + "正在吃");
		}
		public void sleep(){
			System.out.println(name + "正在睡");
		}
		public void introduction(){
			System.out.println("大家好！我是" + id + "号" + name + ".");
		}
	}

从这两段代码可以看出来，代码存在重复了，导致后果就是代码量大且臃肿，而且维护性不高，所以要从根本上解决问题，就需要继承，将两段代码中相同的地方提取出来，组成一个父类：

公共父类，动物类：

	public class Animal{
		private String name;
		private int id;
		public Animal(String myName, int myid){
			name = myName;
			id = myid;
		}
		public void eat(){
			System.out.println(name + "正在吃");
		}
		public void sleep(){
			System.out.println(name + "正在睡");
		}
		public void introduction(){
			System.out.println("大家好！我是" + id + "号" + name + ".");
		}
	}

这个Animal类，就可以作为一个父类，然后企鹅类，和老鼠类继承这个类以后，就具有父类当中的属性和方法，子类就不存在重复的代码，维护性也提高，代码也更加简洁，提高代码的复用性，继承之后的代码：

企鹅类：

	public class Penguin extends Animal{
		public Penguin(String myName, int myid){
			super(myName, myid);
		}
	}

老鼠类：

	public class Mouse extends Animal{
		public Mouse(String myName, int myid){
			super(myName, myid);
		}
	}

### 继承的特性 ###
- 子类拥有父类非private的属性、方法；
- 子类可以拥有自己的属性和方法，及子类可以对父类进行扩展；
- 子类可以用自己的方式实现父类的方法；
- Java的继承是单继承，但是也可以多重继承，单继承就是一个子类只能继承一个父类，多重继承就是，例如A类继承B类，B类继承C类，所以按照关系就是C类是B类的父类，B类时A类的父类，这是java继承区别于C++继承的一个特性。
- 提高了类之间的耦合性（继承的缺点，耦合度高就会造成代码之间的联系）

### 继承关键字 ###
继承可以使用 extends 和 implements 这两个关键字来实现继承，而且所有的类都是继承于 java.lang.Object ，当一个类没有继承的两个关键字，则默认继承 object (这个类在 java.lang包中，所以不需要import) 祖先类。

#### extends关键字 ####
在java中，类的继承是单一继承，也就是说，一个子类只能拥有一个父类，所以 extends 只能继承一个类。

	public class Penguin extends Animal{}

#### implements关键字 ####
使用 implements 关键字可以变相的使java具有多继承的特性，使用范围为类继承接口的情况，可以同时继承多个接口，接口和接口之间使用逗号分开：

**implements关键字：**

	public interface A{
		public void eat();
		public void sleep();
	}
	
	public interface B{
		public void show();
	}
	
	public class C implements A,B{
	}

#### super与this关键字 ####
super关键字：我们可以通过super关键字来实现对父类成员的访问，用来引用当前对象的父类。

this关键字：指向自己的引用。

	package com.runoob.test;
	
	class Animal{
		void eat() {
			System.out.println("animal:eat");
		}
	}
	
	class Dog extends Animal{
		void eat() {
			System.out.println("dog:eat");
		}
		void eatTest() {
			this.eat();		// this调用自己的方法
			super.eat();	// super调用父类方法
		}
	}
	
	public class Test {
		public static void main(String[] args) {
			Animal a = new Animal();
			a.eat();
			Dog d = new Dog();
			d.eatTest();
		}
	}


#### final关键字 ####
final关键字声明类可以把类定义为不能继承的，即为最终类，或者用于修饰方法，该方法不能被子类重写：

	final class 类名{// 类体}  // 修饰类

	// 声明方法
	修饰符(public/private/default/protected) final 返回值类型 方法名(){//方法体}

注：实例变量也可以被定义为final，被定义为final的变量不能被修改，被声明为final的类的方法自动的声明为final，但是实例变量并不是final。


### 构造器 ###
子类不能继承父类的构造器（构造方法或叫做构造函数），但是父类的构造器带有参数的，则必须在子类的构造器中显示的用 super 关键字调用父类的构造器并配以适当的参数列表：

如果父类有无参数构造器，则在子类的构造器中用super调用父类构造器不是必须的，如果没有使用super关键字，系统会自动调用父类无参构造器。

	package com.runoob.test;
	
	class SuperClass{
		private int n;
		SuperClass() {
			System.out.println("SuperClass()");
		}
		SuperClass(int n){
			System.out.println("SuperClass(int n)");
		}
	}
	
	class SubClass extends SuperClass{
		private int n;
		public SubClass() {
			super(300);
			System.out.println("SubClass");
		}
		SubClass(int n){
			System.out.println("SubClass(int n):" + n);
			this.n = n;
		}
	}
	
	public class TestSuperSub {
	
		public static void main(String[] args) {
			SubClass c = new SubClass();
			SubClass c2 = new SubClass(200);
		}
	
	}

运行结果：

	SuperClass(int n)
	SubClass
	SuperClass()
	SubClass(int n):200

## Java Override/Overload ##
### 重写 Override
### 方法的重写规则
### Super关键字
### 重载 Overload
### 重写与重载的区别

## Java 多态 ##
多态是同一个行为具有多个不同表现形式或形态的能力。

多态就是同一个接口，使用不同的实例而执行不同操作。多态性是对象多种表现形式的体现。

同一个事件发生在不同对象上会产生不同的结果。

### 多态的优点

### 多态存在的三个必要条件

### 虚方法

### 多态的实现方式

## Java 抽象类 ##
在面向对象的概念中，所有的对象都是通过类来描绘的，但是反过来，并不是所有的类都是用来描绘对象的，如果一个类中没有包含足够的信息来描绘一个具体的对象，这样的类就是抽象类。

抽象类除了不能实例化对象之外，类的其他功能依然存在，成员变量、成员方法和构造方法的访问方式和普通类一样。

由于抽象类不能实例化对象，所以抽象类必须被继承，才能被使用。也正是因为这个原因，通常在设计阶段决定要不要设计抽象类。

父类包含了子类集合的常见的方法，但是由于父类本身是抽象的，所以不能使用这些方法。

在Java中抽象类表示的是一种继承关系，一个类只能继承一个抽象类，而一个类却可以实现多个接口。

### 抽象类
### 继承抽象类
### 抽象方法
### 抽象类总结规定

## Java 封装 ##
在面向对象程式设计方法中，封装是指一种将抽象性函式接口的实现细节部分包装，隐藏起来的方法。

封装可以被认为是一个保护屏障，防止该类的代码和数据被外部类定义的代码随机访问。

要访问该类的代码和数据，必须通过严格的接口控制。

封装最主要的功能在于我们能修改自己的实现代码，而不用修改那些调用我们代码的程序片段。

适当的封装可以让程式码更容易理解和维护，也加强了程序的安全性。

**封装的优点：**

- 良好的封装能够减少耦合
- 类内部的结构可以自由修改
- 可以对成员变量进行更精确的控制
- 隐藏信息，实现细节

### 实现Java封装的步骤
1. 修改属性的可见性来限制对属性的访问(一般限制为private)，例如：

...

2. 对每个值属性提供对外的公共方法访问，也就是创建一堆赋值取值方法，用于对私有属性的访问，例如：

...

> 采用 this 关键字是为了解决实例变量和局部变量之间发生的同名冲突。

### 实例：

...



## Java 接口 ##
接口(Interface)，在Java编程语言中是一个抽象类型，是抽象方法的集合，接口通常以interface来声明。一个类通过继承接口的方式，从而来继承接口的抽象方法。

接口并不是类，编写接口的方式和类相似，但是他们属于不同的概念。类描述对象的属性和方法。接口则包含类要实现的方法。

除非实现接口的类是抽象类，否则该类要定义接口中的所有方法。

接口无法被实例化，但是可以被实现。一个实现接口的类，必须实现接口内所描述的所有的方法，否则就必须声明为抽象类。另外，在Java中，接口类型可用来声明一个变量，他们可以成为一个空指针，或是被绑定在一个以此接口实现的对象。

**接口与类相似点：**

- 一个接口可以有多个方法
- 接口文件保存在 .java 结尾的文件中，文件名使用接口名
- 接口的字节码文件保存在 .class 结尾的文件中。
- 接口相应的字节码文件必须在与包名称相匹配的目录结构中

**接口与类的区别：**

- 接口不能用于实例化对象
- 接口没有构造方法
- 接口中所有的方法必须是抽象方法
- 接口不能包含成员变量，除了 static 和 final 变量
- 接口不是被类继承了，而是要被类实现
- 接口支持多继承

**接口特性：**

- 接口中每一个方法也是隐式抽象的，接口中的方法会被隐式的指定为 public abstract (只能是public abstract，其他修饰符都会报错)
- 接口中可以含有变量，但是接口中的变量会被隐式的指定为 public static final 变量 (并且只能是public，用private修饰会报编译错误)
- 接口中的方法是不能在接口中实现的，只能由实现接口的类来实现接口中的方法。

**抽象类和接口的区别：**

- 抽象类中的方法可以有方法体，就是能实现方法的具体功能，但是接口中的方法不行。
- 抽象类中的成员变量可以是各种类型的，而接口中的成员变量只能是 public static final 类型的。
- 接口中不能含有静态代码块以及静态方法(用staic修饰的方法)，而抽象类是可以有静态代码块和静态方法。
- 一个类只能继承一个抽象类，而一个类却可以实现多个接口。

### 接口的声明
### 接口的实现
当类实现接口的时候，类要实现接口中的所有方法。否则，类必须声明为抽象的类。

类使用 implements 关键字实现接口。在类声明中，Implements 关键字放在class声明后面。

...

重写接口中声明的方法时，需要注意以下规则：

- 类在实现接口的方法时，不能抛出强制性异常，只能在接口中，或者继承接口的抽象类中抛出该强制性异常。
- 类在重写方法时要保持一致的方法名，并且应该保持相同或者兼容的返回值类型。
- 如果实现接口的类是抽象类，那么就没必要实现该接口的方法。

在实现接口的时候，也要注意一些规则：

- 一个类可以同时实现多个接口。
- 一个类只能继承一个类，但是能实现多个接口。
- 一个接口能继承另一个接口，这和类之间的继承比较相似。

### 接口的继承
一个接口能继承另一个接口，和类之间的继承方式比较相似。接口的继承使用 extends 关键字，子接口继承父接口的方法。

### 接口的多继承
在Java中，类的多继承是不合法，但接口允许多继承。

在接口的多继承中 extends 关键字只需要使用一次，在其后跟着继承接口。

### 标记接口
最常用的继承接口是没有包含任何方法的接口。

标记接口是没有任何方法和属性的接口，它仅仅表明它的类属于一个特定的类型，供其他代码来测试允许做的一些事情。

标记接口的作用：简单形象的说就是给某个对象打个标(盖个戳)，使对象拥有某个或某些特权。

...

没有任何方法的接口被称为标记接口。标记接口主要用于以下两种目的：

- 建立一个公共的父接口：
- 向一个类添加数据类型：

## Java 包(package) ##
为了更好的组织类，Java提供了包机制，用于区别类名的命名空间。

### 包的作用
- 1、把功能相似或相关的类或接口组织在同一个包中，方便类的查找和使用。
- 2、如同文件夹一样，包也采用了树形目录的存储方式。同一个包中的类名字是不同的，不同的包中的类的名字是可以相同的，当同时调用两个不同包中相同类名的类时，应该加上包名加以区别。因此，包可以避免名字冲突。
- 3、包也限定了访问权限，拥有包访问权限的类才能访问某个包中的类。

Java使用包这种机制是为了防止命名冲突，访问控制，提供搜索和定位类、接口、枚举和注释等；

### 创建包
### import关键字
### package的目录结构
### 设置CLASSPATH系统变量


# Java 高级教程 #
## Java 数据结构 ##
Java工具包提供了强大的数据结构，在Java中的数据结构主要包括以下几种接口和类：

- 枚举
- 位集合
- 向量
- 栈
- 栈
- 字典
- 哈希表
- 属性

以上这些类是传统遗留的，在Java2中引入了一种新的框架-集合框架(Collection)，我们后面再讨论。



## Java 集合框架 ##
早在Java 2中之前，Java就提供了特设类。比如：Dictionary, Vector, Stack 和 Properties 这些类用来存储和操作对象组。

虽然这些类都非常有用，但是他们缺少一个核心的、统一的主题。由于这个原因，使用 Vector 类的方式和使用 Properties 类的方式有很大不同。

集合框架被设计成要满足以下几个目标：

- 该框架必须是高性能的。基本集合的实现也必须是高效的。
- 该框架允许不同类型的集合，以类似的方式工作，具有高度的互操作性。
- 对一个集合的扩展和适应必须是简单的。

为此，整个集合框架就围绕一组标准接口而设计。你可以直接使用这些接口的标准实现，诸如：LinkedList, HashSet 和 TreeSet 等，除此之外你也可以通过这些接口实现自己的集合。

集合框架是一个用来代表和操纵集合的统一架构，所有的集合框架都包含如下内容：

- 接口：是代表集合的抽象数据类型。接口允许集合独立操纵其代表的细节。在面向对象的语言，接口通常形成一个层次。
- 实现(类)：是集合接口的具体实现。从本质上讲，它们是可重复使用的数据结构。
- 算法：是实现集合接口的对象里的方法执行的一些有用的计算，例如：搜索和排序。这些算法被称为多态，那是因为相同的方法可以在相似的接口上有着不同的实现。

除了集合，该框架也定义了几个Map接口和类。Map里存储的是键/值对。尽管Map不是Collections，但是它们完全整合在集合中。

集合框架体系如图所示：

<img src="http://www.runoob.com/wp-content/uploads/2014/01/java-coll.png" width="100%" />

Java集合框架提供了一套性能优良，使用方便的接口和类，java集合框架位于java.util包中，所以当使用集合框架的时候需要进行导包。

### 集合接口

<table width="100%">
	<tr>
		<thead>集合接口</thead>
	</tr>
	<tr>
		<th>序号</th>
		<th>接口</th>
		<th>描述</th>
	</tr>
	<tr>
		<td>1</td>
		<td>Collection</td>
		<td>Collection是最基本的集合接口，一个Collection代表一组Object，即Collection的元素，Java不提供直接继承自Collection的类，只提供继承于Collection的子接口(如：List和Set)</td>
	</tr>
	<tr>
		<td>2</td>
		<td>List</td>
		<td>List接口是一个有序的Collection，使用此接口能够精确的控制每个元素插入的位置，能够通过索引(元素在List中位置，类似于数组的下标)来访问List中的元素，第一个元素的索引为0，而且允许有相同的元素。</td>
	</tr>
	<tr>
		<td>3</td>
		<td>Set</td>
		<td>Set具有和Collection完全一样的接口，只是行为上不同，Set不保存重复的元素。</td>
	</tr>
	<tr>
		<td>4</td>
		<td>SortedSet</td>
		<td>继承于Set保存有序的集合。</td>
	</tr>
	<tr>
		<td>5</td>
		<td>Map</td>
		<td>将唯一的键映射到值。</td>
	</tr>
	<tr>
		<td>6</td>
		<td>Map.Entry</td>
		<td>描述在一个Map中的一个元素(键/值对)，是一个Map的内部类。</td>
	</tr>
	<tr>
		<td>7</td>
		<td>SortedMap</td>
		<td>继承于Map，使Key保持在升序排列。</td>
	</tr>
	<tr>
		<td>8</td>
		<td>Enumeration</td>
		<td>这是一个传统的接口和定义的方法，通过它可以枚举对象集合中的元素。这个传统接口已被迭代器取代。</td>
	</tr>
</table>

**Set和List的区别：**

- 1、Set接口实例存储的是无序的，不重复的数据。List接口实例存储的是有序的，可以重复的元素。
- 2、Set检索效率低下，删除和插入效率高，插入和删除不会引起元素位置改变(实现类有HashSet, TreeSet)
- 3、List和数组类似，可以动态增长，根据实际存储的数据的长度自动增长List的长度。查找元素效率高，插入删除效率低，因为会引起其他元素位置改变 (实现类有ArrayList, LinkedList, Vector)

## Java 泛型 ##
Java泛型 (generics) 是JDK5中引入的一个新特性，泛型提供了编译时类型安全监测机制，该机制允许程序员在编译时检测到非法的类型。

泛型的本质是参数化类型，也就是说所操作的数据类型被指定为一个参数。

> 假定我们有这样一个需求：写一个排序方法，能够对整型数组、字符串数组甚至其他任意类型的数组进行排序，该如何实现？

> 答案是泛型。使用Java泛型的概念，我们可以写一个泛型方法来对一个对象数组排序。然后，调用该泛型方法来对整型数组、浮点数数组、字符串数组等进行排序。

### 泛型方法
你可以写一个泛型方法，该方法在调用时可以接收不同类型的参数。根据传递给泛型方法的参数类型，编译器会适当地处理每一个方法调用。

下面是定义泛型方法的规则：

- 所有泛型方法声明都有一个类型参数声明部分(由尖括号分隔)，该类型参数声明部分在方法返回类型之前。
- 每一个类型参数声明部分包含一个或多个类型参数，参数间用逗号隔开。一个泛型参数，也被称为一个类型变量，是用于指定一个泛型类型名称的标识符。
- 类型参数能被用来声明返回值类型，并且能作为泛型方法得到的实际参数类型的占位符。
- 泛型方法体的声明和其他方法一样。注意类型参数只能代表引用型类型，不能是原始类型(像int, double, char等)。

实例：

### 泛型类
泛型类的声明和非泛型类的声明类似，除了在类名后面添加了类型参数声明部分。

和泛型方法一样，泛型类的类型参数声明部分也包含一个或多个类型参数，参数间用逗号隔开。一个泛型参数，也被称为一个类型变量，是用于指定一个泛型类型名称的标识符。因为他们接受一个或多个参数，这些类被称为参数化的类或参数化的类型。

...

### 类型通配符


## Java 序列化 ##
Java提供了一种对象序列化的机制，该机制中，一个对象可以被表示为一个字节序列，该字节序列包括该对象的数据、有关对象的类型的信息和存储在对象中数据的类型。

将序列化对象写入文件之后，可以从文件中读取出来，并且对它进行反序列化，也就是说，对象的类型信息、对象的数据，还有对象中的数据类型可以用来在内存中新建对象。

整个过程都是Java虚拟机(JVM)独立的，也就是说，在一个平台上序列化的对象可以在另一个完全不同的平台上反序列化该对象。

类 ObjectInputStream 和 ObjectOutputStream 是高层次的数据流，他们包含序列化和反序列化对象的方法。

ObjectOutputStream 类包含很多写方法来写各种数据类型，但是一个特别的方法例外：

	public final void writeObject(Object x) throws IOException
	
上面的方法序列化一个对象，并将它发送到输出流。相似的 ObjectInputStream 类包含如下反序列化一个对象的方法：

	public final Object readObject() throws IOException, ClassNotFoundException
	
该方法从流中取出下一个对象，并将对象反序列化。它的返回值为 Object，因此，你需要将它转换成合适的数据类型。

为了演示序列化在 Java 中是怎样工作的，我将使用之前提到的 Employee 类。

...




## Java 网络编程 ##
网络编程是指编写运行在多个设备的程序，这些设备通过网络连接起来。

java.net包中 J2SE 的API包含有类和接口，它们提供低层次的通信细节。你可以直接使用这些类和接口，来专注于解决问题，而不用关注通信细节。

java.net包中提供了两种常见的网络协议的支持：

- TCP: TCP是传输控制协议的缩写，它保障了两个应用程序之间的可靠通信。通常用于互联网协议，被称为 TCP/IP。
- UDP: UDP是用户数据报协议的缩写，一个无连接的协议。提供了应用程序之间要发送的数据的数据包。

本教程主要讲解以下两个主题：

- Socket编程：这是使用最广泛的网络概念，它已被解释的非常详细。
- URL处理：这部分会在另外的篇幅讲解。

### Socket编程
套接字使用TCP提供了两台计算机之间的通信机制。客户端程序创建一个套接字，并尝试连接服务器的套接字。

当连接建立时，服务器会创建一个Socket对象。客户端和服务器现在可以通过对Socket对象的写入和读取来进行通信。

java.net.Socket类代表一个套接字，并且java.net.ServerSocket类为服务器程序提供了一种来监听客户端，并与他们建立连接的机制。

以下步骤在两台计算机之间使用套接字建立TCP连接时会出现：

- 服务器实例化一个 ServerSocket 对象，表示通过服务器上的端口通信。
- 服务器调用 ServerSocket 类的 accept() 方法，该方法将一直等待，直到客户端连接到服务器上给定的端口。
- 服务器正在等待时，一个客户端实例化一个 Socket 对象，指定服务器名称和端口号来请求连接。
- Socket 类的构造函数视图将客户端连接到指定的服务器和端口号。如果通信被建立，则在客户端创建一个 Socket 对象能够与服务器进行通信。
- 在服务器端，accept() 方法返回服务器上一个新的 socket 引用，该 socket 连接到客户端的 socket。

连接建立后，通过使用I/O流在进行通信，每一个socket都有一个输出流和一个输入流，客户端的输出流连接到服务器端的输入流，而客户端的输入流连接到服务器端的输出流。

TCP是一个双向的通信协议，因此数据可以通过两个数据流在同一时间发送，以下是一些类提供的一套完整的有用的方法来实现 socket。

## Java 发送邮件 ##



## Java 多线程编程 ##
Java给多线程编程提供了内置的支持。一条线程指的是进程中一个单一顺序的控制流，一个进程中可以并发多个线程，每条线程并行执行不同的任务。

多线程是多任务的一种特别的形式，但多线程使用了更小的资源开销。

这里定义和线程相关的另一个术语-进程：一个进程包括由操作系统分配的内存空间，包含一个或多个线程。一个线程不能独立的存在，它必须是进程的一部分。一个进程一直运行，直到所有的非守护线程都结束运行后才能结束。

多线程能满足程序员编写高效率的程序来达到充分利用CPU的目的。

### 一个线程的生命周期
线程是一个动态执行的过程，它也有一个从产生到死亡的过程。

下面显示了一个线程完整的生命周期。

<img src="http://www.runoob.com/wp-content/uploads/2014/01/java-thread.jpg" />

## Java Applet 基础 ##
Applet是一种Java程序。它一般运行在支持Java的Web浏览器内。因为它有完整的Java API支持，所以Applet是一个全功能的Java应用程序。




## Java 文档注释 ##
Java支持三种注释方式。前两种分别是`//`和`/**/`，第三种被称作说明注释，它以`/**`开始，以`*/`结束。

说明注释允许你在程序中嵌入关于程序的信息。你可以使用javadoc工具软件来生成信息，并输出到HTML文件中。

说明注释，使你更加方便的记录你的程序信息。


## Java 实例 ##



## Java 8 新特性 ##



## Java MySQL 连接 ##


