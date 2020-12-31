import android.app.Notification;
import android.graphics.drawable.Icon;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5AAB38AFDDD5E42D031C0D0C663A3CD585B820999131F6AA9E3FFDA3671B8871_233344318 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Notification.class);
      Icon var2 = ((Notification)var1).getSmallIcon();
      int var3 = var2.getResId();
   }
}
