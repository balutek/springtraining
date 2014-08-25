package pl.balutek.springtraining.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.balutek.springtraining.domain.Account;
import pl.balutek.springtraining.service.AccountService;

import java.util.List;

/**
 * Created by pawel on 8/23/14.
 */
public class ConsoleApp
{

   public static void main(String args[]) throws Exception
   {
      ApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
      AccountService accountService = (AccountService) context.getBean("accountService");

      List<Account> deliquentAccounts = accountService.findDeliquentAccounts();
      System.out.println(deliquentAccounts.toString());

   }

}
