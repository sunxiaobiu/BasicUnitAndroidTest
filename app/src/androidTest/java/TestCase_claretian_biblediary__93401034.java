import android.util.MonthDisplayHelper;
import androidx.test.runner.AndroidJUnit4;
import java.util.Calendar;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_claretian_biblediary__93401034 {
   @Test
   public void testCase() throws Exception {
      Calendar var1 = Calendar.getInstance();
      int var3 = var1.get(2);
      int var4 = var1.get(1);
      MonthDisplayHelper var2 = new MonthDisplayHelper(var4, var3);
      byte var5 = 1;
      var2.getDigitsForRow(var5);
   }
}
