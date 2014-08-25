package pl.balutek.springtraining.util.date;

import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.DateTimeParser;

/**
 * Created by pawel on 8/23/14.
 */
public class JodaDateTimeUtils
{
   public static DateTimeFormatter createFormatter(String... formats)
   {
      DateTimeParser[] dateTimeParsers = new DateTimeParser[formats.length];
      for (int i = 0; i < formats.length; ++i)
      {
         dateTimeParsers[i] = DateTimeFormat.forPattern(formats[i]).getParser();
      }
      return new DateTimeFormatterBuilder().append(null, dateTimeParsers).toFormatter();
   }

}
