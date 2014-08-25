package pl.balutek.springtraining.dao.impl;

import pl.balutek.springtraining.dao.IAccountDao;
import pl.balutek.springtraining.domain.Account;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by pawel on 8/24/14.
 */
public class JdbcAccountDao implements IAccountDao
{
   private DataSource dataSource;

   public void setDataSource(DataSource dataSource)
   {
      this.dataSource = dataSource;
   }

   @Override
   public List<Account> findAll() throws Exception
   {
      return null;
   }
}
