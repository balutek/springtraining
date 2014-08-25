package pl.balutek.springtraining.dao;

import pl.balutek.springtraining.domain.Account;

import java.util.List;

/**
 * Created by pawel on 8/23/14.
 */
public interface IAccountDao {

    public List<Account> findAll() throws Exception;

}
