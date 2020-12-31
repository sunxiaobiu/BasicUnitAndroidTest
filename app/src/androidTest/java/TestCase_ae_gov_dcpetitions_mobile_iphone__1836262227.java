import android.app.DownloadManager;
import android.app.DownloadManager.Query;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_gov_dcpetitions_mobile_iphone__1836262227 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(DownloadManager.class);
      Object var1 = EasyMock.createMock(Query.class);
      ((DownloadManager)var2).query((Query)var1);
   }
}
