import android.media.AudioRecord;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_alu_myic_opentouch_258321264 {
   @Test
   public void testCase() throws Exception {
      int var7 = AudioRecord.getMinBufferSize(8000, 16, 2);
      int var1 = var7;
      var7 /= 8;
      byte var2 = 2;
      byte var3 = 1;
      short var4 = 8000;
      byte var5 = 1;
      AudioRecord var6 = new AudioRecord(var5, var4, var3, var2, var1);
      AudioRecord var8 = new AudioRecord(1, 8000, 16, 2, var7);
      var8.setPositionNotificationPeriod(var4);
   }
}
