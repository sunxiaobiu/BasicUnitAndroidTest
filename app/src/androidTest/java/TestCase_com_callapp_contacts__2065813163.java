import android.telecom.Call;
import android.telecom.InCallService.VideoCall;
import androidx.test.runner.AndroidJUnit4;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_callapp_contacts__2065813163 {
   @Test
   public void testCase() throws Exception {
      HashMap var1 = new HashMap();
      Collection var2 = var1.values();
      Iterator var3 = var2.iterator();
      Object var4 = var3.next();
      Call var5 = (Call)var4;
      VideoCall var6 = var5.getVideoCall();
   }
}
