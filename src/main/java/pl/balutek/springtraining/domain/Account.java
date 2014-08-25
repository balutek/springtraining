package pl.balutek.springtraining.domain;

import org.joda.time.DateTime;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by pawel on 8/21/14.
 */
public class Account
{

   private String accountNo;
   private BigDecimal balance;
   private DateTime lastPaidOn;

   public Account(String accountNo, BigDecimal balance, DateTime lastPaidOn)
   {
      this.accountNo = accountNo;
      this.balance = balance;
      this.lastPaidOn = lastPaidOn;
   }

   public String getAccountNo()
   {
      return accountNo;
   }

   public BigDecimal getBalance()
   {
      return balance;
   }

   public DateTime getLastPaidOn()
   {
      return lastPaidOn;
   }

   @Override
   public String toString()
   {
      return accountNo + " " + balance.toString() + " " + lastPaidOn.toString();
   }
}
