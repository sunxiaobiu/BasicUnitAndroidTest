import android.app.Notification.Builder;
import android.app.Notification.Extender;
import android.app.Notification.WearableExtender;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_601C67A02E80251C9FB817F7A0D1EC267920C7AAB688ED1837E2627A4E2C42D0_1700858308 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Builder.class);
      Object var1 = EasyMock.createMock(WearableExtender.class);
      ((Builder)var2).extend((Extender)var1);
   }
}
