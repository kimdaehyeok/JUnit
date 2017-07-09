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
     * arg1 : ����ϴ� ��� ��(Expected)
     * arg2 : �޼ҵ带 ������ ��� ��(Actual)
     * int, long, String �� �پ��� ������ Ÿ�Կ� ���� ������ �����ϴ�.
     * assertEquals(), assertTrue(), assertFalse(), assertNull, assertNotNull, assertArrayEquals() ��
     */
    
    /* �� �׽�Ʈ�� ���� �ߺ����� ReturnValueClass ��ü�� �����ϰ� �ִ�.
     * �ߺ��� �κ��� �ּ�ȭ �Ῡ�� �Ѵ�. �̸� �ذ��ϱ� ���� 
     * private ReturnValueClass returnValueClass = new ReturnValueClass();
     * ó�� �ʵ忡 ��ü�� ������ �� ���� �� �� �ִ�.
     * �׷���, �̴� �� �׽�Ʈ�� ����� ������ �׽�Ʈ�� ����� �Ǵ� ��ü�� ���°� ���� �� �ִ�.
     * �׷��Ƿ� @Before�� ����Ѵ�.
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
