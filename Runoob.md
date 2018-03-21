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
### 静态变量(类变量) ###



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


