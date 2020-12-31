import android.icu.util.Calendar;
import android.icu.util.GregorianCalendar;
import androidx.test.runner.AndroidJUnit4;
import java.util.Locale;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_38A614208A9231B84F176DFD756DBFD034B5F20E4476AFC990762CD48F97BEF8__1909141925 {
   @Test
   public void testCase() throws Exception {
      Locale var1 = Locale.getDefault();
      Calendar var2 = GregorianCalendar.getInstance(var1);
      var2.setMinimalDaysInFirstWeek(4);
   }
}
