import android.util.EventLog;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_cn_danatech_xingseapp__1513304990 {
   public static void testCase() throws Exception {
      byte var0 = 1;
      Object var1 = null;
      EventLog.writeEvent(var0, (Object[])var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
