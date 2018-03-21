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