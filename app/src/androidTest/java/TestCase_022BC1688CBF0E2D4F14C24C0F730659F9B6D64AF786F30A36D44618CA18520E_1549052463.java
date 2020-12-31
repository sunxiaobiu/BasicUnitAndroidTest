import android.content.Context;
import android.net.Uri;
import androidx.core.app.NotificationCompat.Builder;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_022BC1688CBF0E2D4F14C24C0F730659F9B6D64AF786F30A36D44618CA18520E_1549052463 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Builder var2 = new Builder(var1, "PSVKidsGames");
      Object var3 = EasyMock.createMock(Uri.class);
      var2.setSound((Uri)var3);
   }
}
