import android.content.Context;
import android.text.format.DateUtils;
import androidx.test.runner.AndroidJUnit4;
import java.util.Formatter;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_alarm_alarmmobile_android_adt__77245505 {
   public static void testCase() throws Exception {
      Object var0 = null;
      Object var1 = EasyMock.createMock(Context.class);
      long var2 = 1L;
      String var4 = "android";
      DateUtils.formatDateRange((Context)var1, (Formatter)var0, var2, var2, 131088, var4);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
