import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import androidx.test.runner.AndroidJUnit4;
import java.util.Iterator;
import java.util.List;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_0249F7DE168C625C51A2A423806DEB8B2A1A2A00162DE39C1E7D338DF900531F__1959212046 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(NotificationManager.class);
      List var2 = ((NotificationManager)var1).getNotificationChannelGroups();
      Iterator var3 = var2.iterator();
      var1 = var3.next();
      NotificationChannelGroup var4 = (NotificationChannelGroup)var1;
      String var5 = var4.getId();
   }
}
