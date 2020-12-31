import android.content.Context;
import android.media.RingtoneManager;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5A2064FD1EBA4AD0E4375A58CC14726A62232B824C23AB78A86EB577CDB89622__1139538019 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      RingtoneManager var2 = new RingtoneManager(var1);
      byte var3 = 1;
      var2.getRingtoneUri(var3);
   }
}
