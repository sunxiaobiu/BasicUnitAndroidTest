import android.content.IntentFilter;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aero_sita_lab_resmobileweb_android_mh_1634855681 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(String.class);
      IntentFilter var1 = new IntentFilter((String)var2);
      var1.addDataAuthority("*", (String)"android");
   }
}
