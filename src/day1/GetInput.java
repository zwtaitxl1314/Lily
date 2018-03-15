package day1;
import java.util.Scanner;

public class GetInput {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in );    	// 用来扫描用户输入数据的扫描器
		
		System.out.println("请输入你的姓名：");
		String name=s.next();                               // 读取一个字符串，遇到 空格 即结束本次读取
		//sdsdsdsdsdsdsdsdsd
		//sssssssssssssssssssssssssewewewewewe
		System.out.println("请输入你的年龄：");
		int age=s.nextInt();                                // 读取一个数值，遇到 空格 即结束本次读取
		
		System.out.println("请输入你的性别：");
		String  gender=s.next();                            
	    //String gender=s.next();
	//	char g = gender.charAt(0);
		
		System.out.println("请输入你的身高：");
		double height = s.nextDouble();             
		
		System.out.println("请输入你的体重：");
		double weight = s.nextDouble();               
		
		System.out.println("请输入你的婚姻状况：");
		String Marriage = s.next();                    
	    System.out.println("你好，"+name+"今年"+age+"岁，"+"身高"+height+"CM，"+"，体重"+weight+"婚姻状况为"+Marriage);
		
		s.close(); 
		
		

		
	}

}
