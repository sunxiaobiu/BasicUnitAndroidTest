import android.icu.util.GregorianCalendar;
import android.icu.util.TimeZone;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_38A614208A9231B84F176DFD756DBFD034B5F20E4476AFC990762CD48F97BEF8_875446242 {
   @Test
   public void testCase() throws Exception {
      Object var4 = EasyMock.createMock(TimeZone.class);
      GregorianCalendar var1 = new GregorianCalendar((TimeZone)var4);
      long var2 = 1L;
      var1.setTimeInMillis(var2);
   }
}
