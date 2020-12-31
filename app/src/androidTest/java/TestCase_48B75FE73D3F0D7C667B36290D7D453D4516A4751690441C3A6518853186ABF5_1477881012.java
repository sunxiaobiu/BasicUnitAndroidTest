import android.net.wifi.SupplicantState;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_48B75FE73D3F0D7C667B36290D7D453D4516A4751690441C3A6518853186ABF5_1477881012 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(SupplicantState.class);
      boolean var1 = SupplicantState.isValidState((SupplicantState)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
