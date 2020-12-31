import android.app.Notification.Builder;
import android.content.Context;
import android.widget.RemoteViews;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_596B150675225C5FBB28600E3806804D8988DB6FC033A03CDF3DCFB1C1199D28__1194282750 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Builder var2 = new Builder(var1);
      Object var3 = EasyMock.createMock(RemoteViews.class);
      var2.setCustomContentView((RemoteViews)var3);
   }
}
