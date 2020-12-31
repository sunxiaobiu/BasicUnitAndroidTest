import android.content.Context;
import android.net.Uri;
import androidx.core.app.NotificationCompat.Builder;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_66F265862A96F6CA65F1A6FAECEA81F93811B171BA08FD0092FC4697C8E818F5_774932103 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Builder var2 = new Builder(var1, "CustomRingtone");
      Object var3 = EasyMock.createMock(Uri.class);
      var2.setSound((Uri)var3, 2);
   }
}
