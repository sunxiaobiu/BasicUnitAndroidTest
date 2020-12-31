import android.app.Notification.Action;
import android.app.Notification.Builder;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_air_BroWorldAndroid_1625814282 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Builder.class);
      Object var1 = EasyMock.createMock(Action.class);
      ((Builder)var2).addAction((Action)var1);
   }
}
