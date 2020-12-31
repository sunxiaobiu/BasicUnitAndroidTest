import android.app.Notification.Builder;
import android.widget.RemoteViews;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_liven_android_1883378921 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Builder.class);
      RemoteViews var2 = ((Builder)var1).createBigContentView();
   }
}
