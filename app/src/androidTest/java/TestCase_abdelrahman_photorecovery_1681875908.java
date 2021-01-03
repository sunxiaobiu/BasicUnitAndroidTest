import android.net.Uri;
import android.net.Uri.Builder;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abdelrahman_photorecovery_1681875908 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(String.class);
      Uri var2 = Uri.parse((String)var1);
      Builder var3 = var2.buildUpon();
      var3 = var3.query((String)"android");
   }
}
