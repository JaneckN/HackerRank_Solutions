package interview_preparation_kit.recruitment_tasks;

import org.junit.Assert;
import org.junit.Test;

/**
 * ... comment class...
 *
 * @author JKN janeck@protonmail.com
 * @since 08 October 2021 @ 00:08
 */


public class AccountTest {

    @Test
    public void depositWillNotAcceptNegativeNumber() {
        Account account = new Account(20);
        Assert.assertEquals(false, account.deposit(-10));

    }

    @Test
    public void withdrawWillNotAcceptNegativeNumber() {
        Account account = new Account(20);
        Assert.assertEquals(false, account.withdraw(-10));
    }

    @Test
    public void withdrawWillNotOverstepOverdrawLimit() {
        Account account = new Account(20);
        Assert.assertEquals(false, account.withdraw(30));
    }

    @Test
    public void withdrawTest() {
        Account account = new Account(10);
        account.deposit(20);
        account.withdraw(10);
        Assert.assertEquals(10, account.getBalance(),0);
    }

    @Test
    public void withdrawReturnTest() {
        Account account = new Account(10);
        Assert.assertEquals(true, account.deposit(20));
        Assert.assertEquals(true, account.withdraw(10));
    }


}