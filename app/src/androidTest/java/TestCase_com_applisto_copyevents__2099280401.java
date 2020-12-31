import android.content.ContentResolver;
import android.net.Uri;
import android.os.Bundle;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_applisto_copyevents__2099280401 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(ContentResolver.class);
      Object var1 = EasyMock.createMock(Bundle.class);
      ((ContentResolver)var2).startSync((Uri)null, (Bundle)var1);
   }
}
