/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datlt.mathutil.test;

import com.datlt.mathutil.MathUtility;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class MathUtilityTest {
    
    //ta sẽ viết những đoạn code ở đây để test cái hàm chính getFactorial()
    //bên MathUtility coi mày chạy có đúng hông
    //viết code để test code chính
    //đúng sai ở đây chúng tôi dùng màu sắc XANH ĐỎ
    @Test   //biến hàm thường thành hàm main()
    //Shift-F6 để chạy
    public void testFactorialGivenRightArgumentReturnsGoodResult(){
        
        int n = 5; //tui muốn tính 5
        long expected = 120;  //tui hy vọng trả về 120
        long actual = MathUtility.getFactorial(n);
        assertEquals(expected, actual);
        //khớp màu xanh, sai lệch màu đỏ
        //màu xanh xuất hiện khi tất cả tình huống xài hàm 
        //test case đều xanh
        //màu đỏ xuất hiện ngay khi có ít nhất 1 thằng đỏ
        //               1 test case sai, tất cả bỏ đi
        //ẩn ý: hàm đã đúng thì phải đúng cho tất cả test case
        
        assertEquals(720, MathUtility.getFactorial(6)); //6! có đúng là 720?
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(1, MathUtility.getFactorial(0));
        //khi màu đỏ thì có 2 tình huống: hàm bạn tính sai ko như kì vọng
        //                                hàm tính đúng, bạn kì vọng sai
    }
    
    //ta sẽ đi test hàm có ném ra ngoại lệ như thiết kế hay không
    //hàm được thiết kế rằng: đưa tham số n 0..20 -> tính đúng n!
    //hàm được thiết kế rằng: đưa tham số cà chớn, < 0 > 20
    //                        ném ra ngoại lệ cảnh báo sai tham số, ngoài miền giá trị tính!
    //chốt: đưa tham số cà chớn phải ném về ngoại lệ 
    //      nếu thấy đúng là ném về ngoại lệ khi đưa tham số cà chớn thì kết luận hàm đúng, XANH
    //thấy ngoại lệ khi đưa n cà chớn, mừng rơi nước mắt vì hàm chạy đúng như thiết kế
    //ngoại lệ không phải là giá trị để so sánh kiểu assertEquals()
    //@Test(expected = Exception.class)    //ko nên bắt mức cao nhất
                                           //mặc dù ko saipwd
    @Test(expected = IllegalArgumentException.class)
    public void getFactorialGivenWrongArgumentThrowsException(){
        MathUtility.getFactorial(40);
        MathUtility.getFactorial(-40);
    }   //cá luôn 2 thằng này phải ném về ngoại lệ IllegalArgumentException
    
}
