package day1;

public class Operator6 {

	public static void main(String[] args) {
		
		final int x = 0b00000000_00000000_00000000_00010001 ; // 17 ;
		
		// 0_00000000_00000000_00000000_0001000
		int y = x >> 1 ; // 有符号右移 (对于正数，高位补充0，对于负数高位补充 1 )
		System.out.println( y );
		
		// 0000000_00000000_00000000_000100010
		int z = x << 1 ; // 向左移位 ( 最低位依次补充 0 )
		System.out.println( z );
		// 原码:  5 : 00000000_00000000_00000000_00000101
		int a = 5 ;
		// 反码: -6 : 11111111_11111111_11111111_11111010
		System.out.println( ~a );
		// 补码: -5 : 11111111_11111111_11111111_11111011
		int u = -5 ;
		int v = u >> 1 ; // 有符号向右移位
		System.out.println( v );
		
		int xxx = u >>> 1 ; // 无符号右移 ( 高位总是补 0 )
		System.out.println( xxx );
		
		/*** x << 36 ; 结果是多少，为什么 ? ****/
		
	}

}
