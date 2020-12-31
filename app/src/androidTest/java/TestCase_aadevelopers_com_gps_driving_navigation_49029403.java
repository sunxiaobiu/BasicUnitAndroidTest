import android.content.Intent;
import android.content.pm.PackageManager;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aadevelopers_com_gps_driving_navigation_49029403 {
   @Test
   public void testCase() throws Exception {
      Intent var2 = new Intent();
      Object var1 = EasyMock.createMock(PackageManager.class);
      var2.resolveActivity((PackageManager)var1);
   }
}
