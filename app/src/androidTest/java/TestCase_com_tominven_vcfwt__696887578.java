import android.content.Context;
import android.media.RingtoneManager;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_tominven_vcfwt__696887578 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      RingtoneManager var1 = new RingtoneManager(var2);
      var1.setStopPreviousRingtone(true);
   }
}
