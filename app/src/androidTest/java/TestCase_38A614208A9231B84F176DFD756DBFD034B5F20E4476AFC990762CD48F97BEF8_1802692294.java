import android.icu.text.SimpleDateFormat;
import android.icu.util.TimeZone;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_38A614208A9231B84F176DFD756DBFD034B5F20E4476AFC990762CD48F97BEF8_1802692294 {
   @Test
   public void testCase() throws Exception {
      SimpleDateFormat var2 = new SimpleDateFormat("yyyy-MM-dd");
      Object var1 = EasyMock.createMock(TimeZone.class);
      var2.setTimeZone((TimeZone)var1);
   }
}
