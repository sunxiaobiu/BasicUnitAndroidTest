import android.app.Fragment;
import android.content.Intent;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_mbrf_ddl_app_325101268 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(Fragment.class);
      Object var1 = EasyMock.createMock(Intent.class);
      byte var2 = 1;
      ((Fragment)var3).startActivityForResult((Intent)var1, var2);
   }
}
