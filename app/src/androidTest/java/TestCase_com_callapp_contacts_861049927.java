import android.telecom.CallAudioState;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_callapp_contacts_861049927 {
   public static void testCase() throws Exception {
      byte var0 = 1;
      String var1 = CallAudioState.audioRouteToString(var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
