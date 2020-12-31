import android.content.Context;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat.Builder;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_022BC1688CBF0E2D4F14C24C0F730659F9B6D64AF786F30A36D44618CA18520E_909394036 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Builder var2 = new Builder(var1, "PSVKidsGames");
      Object var3 = EasyMock.createMock(RemoteViews.class);
      var2.setCustomContentView((RemoteViews)var3);
   }
}
