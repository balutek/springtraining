package pl.balutek.springtraining.dao.impl;

import org.apache.commons.lang.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.core.io.Resource;
import pl.balutek.springtraining.dao.IAccountDao;
import pl.balutek.springtraining.domain.Account;
import pl.balutek.springtraining.util.date.JodaDateTimeUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by pawel on 8/23/14.
 */
public class CsvAccountDao implements IAccountDao
{

   private Resource csvResource;

   private static char SPLIT_DELIMITER = ';';

   public void setCsvResource(Resource csvResource)
   {
      this.csvResource = csvResource;
   }

   @Override
   public List<Account> findAll() throws Exception
   {
      List<Account> accounts = new ArrayList<Account>();

      DateTimeFormatter dateTimeFormatter = JodaDateTimeUtils.createFormatter("MMddyyyy");

      BufferedReader csvReader = new BufferedReader(new FileReader(csvResource.getFile()));
      String line;
      while ((line = csvReader.readLine()) != null)
      {
         String[] rowData = StringUtils.split(line, SPLIT_DELIMITER);

         String accountNo = rowData[0];
         BigDecimal balance = new BigDecimal(rowData[1]);
         DateTime lastPaidOn = dateTimeFormatter.parseDateTime(rowData[2]);
         accounts.add(new Account(accountNo, balance, lastPaidOn));
      }

      return accounts;
   }
}
