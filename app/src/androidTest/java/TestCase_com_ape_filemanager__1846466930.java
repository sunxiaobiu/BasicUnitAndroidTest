import android.app.DownloadManager;
import android.content.Context;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_ape_filemanager__1846466930 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Context.class);
      DownloadManager.getRecommendedMaxBytesOverMobile((Context)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
