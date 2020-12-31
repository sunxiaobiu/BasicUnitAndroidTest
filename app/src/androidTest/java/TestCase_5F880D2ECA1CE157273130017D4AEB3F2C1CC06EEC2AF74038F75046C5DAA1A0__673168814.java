import android.icu.text.DateFormat;
import android.icu.util.ULocale;
import androidx.test.runner.AndroidJUnit4;
import java.util.Date;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5F880D2ECA1CE157273130017D4AEB3F2C1CC06EEC2AF74038F75046C5DAA1A0__673168814 {
   @Test
   public void testCase() throws Exception {
      ULocale var2 = new ULocale("en_US@calendar=islamic");
      DateFormat var3 = DateFormat.getDateInstance(0, var2);
      Object var1 = null;
      var3.format((Date)var1);
   }
}
