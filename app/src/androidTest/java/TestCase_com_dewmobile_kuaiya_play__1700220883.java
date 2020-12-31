import android.content.ContentResolver;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_dewmobile_kuaiya_play__1700220883 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(ContentResolver.class);
      String var1 = "android";
      ((ContentResolver)var2).acquireUnstableContentProviderClient(var1);
   }
}
