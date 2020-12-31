import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.AccessibilityServiceInfo;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_tominven_vcfwt_634874134 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(AccessibilityService.class);
      Object var1 = EasyMock.createMock(AccessibilityServiceInfo.class);
      ((AccessibilityService)var2).setServiceInfo((AccessibilityServiceInfo)var1);
   }
}
