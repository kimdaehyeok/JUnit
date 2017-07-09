package com.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JUnitMain
{
    /* assertEquals(arg1, arg2)
     * arg1 : 기대하는 결과 값(Expected)
     * arg2 : 메소드를 실행한 결과 값(Actual)
     * int, long, String 등 다양한 데이터 타입에 대한 지원이 가능하다.
     * assertEquals(), assertTrue(), assertFalse(), assertNull, assertNotNull, assertArrayEquals() 등
     */
    
    /* 각 테스트를 보면 중복으로 ReturnValueClass 객체를 생성하고 있다.
     * 중복된 부분을 최소화 햐여야 한다. 이를 해결하기 위해 
     * private ReturnValueClass returnValueClass = new ReturnValueClass();
     * 처럼 필드에 객체를 생성한 뒤 재사용 할 수 있다.
     * 그러나, 이는 각 테스트가 수행될 때마다 테스트의 대상이 되는 객체가 상태가 변할 수 있다.
     * 그러므로 @Before을 사용한다.
     */
    private ReturnValueClass returnValueClass;
    
    @Before
    public void returnValueClassSetup()
    {   
        returnValueClass = new ReturnValueClass();
    }
    
    @Test
    public void add()
    {
        Calculator calculator = new Calculator();
        assertEquals(7, calculator.add(3, 4));
    }
    
    @Test
    public void junitTrueTest()
    {
//        ReturnValueClass returnValueClass = new ReturnValueClass();
        assertTrue(returnValueClass.returnTrue());
    }
    
    @Test
    public void junitFalseTest()
    {
//        ReturnValueClass returnValueClass = new ReturnValueClass();
        assertFalse(returnValueClass.returnFalse());
    }
    
    @Test
    public void junitNullTest()
    {
//        ReturnValueClass returnValueClass = new ReturnValueClass();
        assertNull(returnValueClass.returnNullString());
    }
    
    @After
    public void junitAfter()
    {
        System.out.println("This is JUnit After Method");
    }
}
