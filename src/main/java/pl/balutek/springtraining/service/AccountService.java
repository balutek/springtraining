package pl.balutek.springtraining.service;

import org.joda.time.DateTime;
import org.joda.time.Interval;
import org.joda.time.Period;
import pl.balutek.springtraining.dao.IAccountDao;
import pl.balutek.springtraining.domain.Account;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created by pawel on 8/23/14.
 */
public class AccountService {

   protected IAccountDao accountDao;

   public void setAccountDao(IAccountDao accountDao)
   {
      this.accountDao = accountDao;
   }

   public List<Account> findDeliquentAccounts() throws Exception
   {
      List<Account> accounts = accountDao.findAll();
      List<Account> deliquentAccounts = new ArrayList<Account>();

      for (Account account : accounts)
      {
         if(account.getBalance().compareTo(BigDecimal.ZERO) < 0)
         {
            deliquentAccounts.add(account);
         }
      }
      return deliquentAccounts;
   }
}
