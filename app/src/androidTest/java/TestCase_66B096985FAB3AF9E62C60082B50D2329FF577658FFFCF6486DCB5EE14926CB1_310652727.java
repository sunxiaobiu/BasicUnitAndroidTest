import android.drm.DrmManagerClient;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_66B096985FAB3AF9E62C60082B50D2329FF577658FFFCF6486DCB5EE14926CB1_310652727 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(DrmManagerClient.class);
      byte var1 = 1;
      ((DrmManagerClient)var2).closeConvertSession(var1);
   }
}
