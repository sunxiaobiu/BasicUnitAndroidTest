import android.telephony.TelephonyManager;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aadevelopers_com_khawabnamahazratyousufas_khawabkitabeer__484683957 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(TelephonyManager.class);
      int var2 = ((TelephonyManager)var1).getSimState();
   }
}
